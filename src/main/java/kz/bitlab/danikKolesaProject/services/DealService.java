package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.CarDTO;
import kz.bitlab.danikKolesaProject.dto.DealDTO;
import kz.bitlab.danikKolesaProject.mapper.CarMapper;
import kz.bitlab.danikKolesaProject.mapper.DealMapper;
import kz.bitlab.danikKolesaProject.model.Deal;
import kz.bitlab.danikKolesaProject.model.User;
import kz.bitlab.danikKolesaProject.repositories.DealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DealService {
    private final DealRepository dealRepository;
    private final DealMapper dealsMapper;
    private final CarService carService;
    private final UserService userService;
    private final CarMapper carMapper;

    public List<DealDTO> getDeals() {
        return dealsMapper.toDtoList(dealRepository.findAllByIsActiveTrue());
    }

    public List<DealDTO> myDeals() {
        User user = userService.getCurrentSessionUser();
        return dealsMapper.toDtoList(dealRepository.findAllByAuthorIsAndIsActiveTrue(user));
    }

    public List<DealDTO> getSearchedDeals(String searchQuery) {
        return dealsMapper.toDtoList(dealRepository.findDealsByCarBrandOrCarModel(searchQuery));
    }

    public List<DealDTO> getDealsForCheck() {
        return dealsMapper.toDtoList(dealRepository.findAllByIsActiveFalse());
    }

    public DealDTO getDeal(Long id) {
        return dealsMapper.toDto(dealRepository.findById(id).orElseThrow());
    }

    public DealDTO addDeal(DealDTO dealsDTO) {
        User user = userService.getCurrentSessionUser();
        if (user.getStatus()) {
            CarDTO addedCar = carService.addCar(dealsDTO.getCarDTO());
            dealsDTO.setCarDTO(addedCar);
            dealsDTO.setCurrentDate(LocalDateTime.now());
            Deal deals = dealsMapper.toModel(dealsDTO);
            deals.setAuthor(user);
            deals.setIsActive(false);
            dealRepository.save(deals);
            return dealsMapper.toDto(deals);
        } else {
            return null;
        }
    }

    public DealDTO updateDeal(DealDTO dealsDTO) {
        Deal existingDeal = dealRepository.findById(dealsDTO.getId()).orElseThrow();
        CarDTO updatedCarDTO = carService.updateCar(dealsDTO.getCarDTO());
        dealsDTO.setCarDTO(updatedCarDTO);
        existingDeal.setCar(carMapper.toModel(updatedCarDTO));
        existingDeal.setPhoneNumber(dealsDTO.getPhoneNumber());
        dealRepository.save(existingDeal);
        return dealsMapper.toDto(existingDeal);
    }

    public DealDTO updateDealIsActive(DealDTO dealsDTO) {
        Deal existingDeal = dealRepository.findById(dealsDTO.getId()).orElseThrow();
        existingDeal.setIsActive(dealsDTO.getIsActive());
        dealRepository.save(existingDeal);
        return dealsMapper.toDto(existingDeal);
    }

    public void deleteDeal(Long id) {
        dealRepository.isActiveToNullById(id);
    }
}
