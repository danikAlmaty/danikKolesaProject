package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.CityDTO;
import kz.bitlab.danikKolesaProject.model.City;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {
    CityDTO toDto(City city);
    City toModel(CityDTO cityDTO);
    List<CityDTO> toDtoList(List<City> cityList);
    List<City> toModelList(List<CityDTO> cityDTOList);
}
