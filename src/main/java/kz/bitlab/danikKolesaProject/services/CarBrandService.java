package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.CarBrandDTO;
import kz.bitlab.danikKolesaProject.mapper.CarBrandMapper;
import kz.bitlab.danikKolesaProject.repositories.CarBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarBrandService {
    private final CarBrandRepository carBrandRepository;
    private final CarBrandMapper carBrandMapper;

    public List<CarBrandDTO> getCarBrands(){
        return carBrandMapper.toDtoList(carBrandRepository.findAll());
    }

    public CarBrandDTO getCarBrand(Long id){
        return carBrandMapper.toDto(carBrandRepository.findById(id).orElseThrow());
    }

    public CarBrandDTO addCarBrand(CarBrandDTO carBrandDTO){
        return carBrandMapper.toDto(carBrandRepository.save(carBrandMapper.toModel(carBrandDTO)));
    }

    public CarBrandDTO updateCarBrand(CarBrandDTO carBrandDTO){
        return carBrandMapper.toDto(carBrandRepository.save(carBrandMapper.toModel(carBrandDTO)));
    }

    public void deleteCarBrand(Long id){
        carBrandRepository.deleteById(id);
    }
}
