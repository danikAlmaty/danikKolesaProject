package kz.bitlab.danikKolesaProject.services;


import kz.bitlab.danikKolesaProject.dto.CarDTO;
import kz.bitlab.danikKolesaProject.mapper.CarMapper;
import kz.bitlab.danikKolesaProject.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarDTO> getAllCars(){
        return carMapper.toDtoList(carRepository.findAll());
    }

    public CarDTO getCar(Long id){
        return carMapper.toDto(carRepository.findById(id).orElseThrow());
    }

    public CarDTO addCar(CarDTO carDTO){
        return carMapper.toDto(carRepository.save(carMapper.toModel(carDTO)));
    }

    public CarDTO updateCar(CarDTO carDTO){
        return carMapper.toDto(carRepository.save(carMapper.toModel(carDTO)));
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }
}
