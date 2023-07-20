package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.CarBrandDTO;
import kz.bitlab.danikKolesaProject.model.CarBrand;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarBrandMapper {
    CarBrandDTO toDto(CarBrand carBrand);
    CarBrand toModel(CarBrandDTO carBrandDTO);
    List<CarBrandDTO> toDtoList(List<CarBrand> carBrandList);
    List<CarBrand> toModelList(List<CarBrandDTO> carBrandDTOList);
}
