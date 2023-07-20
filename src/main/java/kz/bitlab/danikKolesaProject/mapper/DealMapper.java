package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.DealDTO;
import kz.bitlab.danikKolesaProject.model.Deal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DealMapper {
    @Mapping(source = "car", target = "carDTO")
    @Mapping(source = "author.id", target = "dealUserId")
    DealDTO toDto(Deal deals);
    @Mapping(source = "carDTO", target = "car")
    @Mapping(source = "dealUserId", target = "author.id")
    Deal toModel(DealDTO dealsDTO);
    List<DealDTO> toDtoList(List<Deal> dealsList);
    List<Deal> toModelList(List<DealDTO> dealsDTOList);
}
