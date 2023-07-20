package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.TransmissionDTO;
import kz.bitlab.danikKolesaProject.model.Transmission;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransmissionMapper {
    TransmissionDTO toDto(Transmission transmission);
    Transmission toModel(TransmissionDTO transmissionDTO);
    List<TransmissionDTO> toDtoList(List<Transmission> transmissionList);
    List<Transmission> toModelList(List<TransmissionDTO> transmissionDTOList);
}
