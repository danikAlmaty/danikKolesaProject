package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.BodyStyleDTO;
import kz.bitlab.danikKolesaProject.model.BodyStyle;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BodyStyleMapper {
    BodyStyleDTO toDto(BodyStyle bodyStyle);
    BodyStyle toModel(BodyStyleDTO bodyStyleDTO);
    List<BodyStyleDTO> toDtoList(List<BodyStyle> bodyStyleList);
    List<BodyStyle> toModelList(List<BodyStyleDTO> bodyStyleDTOList);
}
