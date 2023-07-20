package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.CarDTO;
import kz.bitlab.danikKolesaProject.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDTO toDto(Car car);
    Car toModel(CarDTO carDTO);
    List<CarDTO> toDtoList(List<Car> carList);
    List<Car> toModelList(List<CarDTO> carDTOList);
}
