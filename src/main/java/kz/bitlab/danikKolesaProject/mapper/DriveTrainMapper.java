package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.DriveTrainDTO;
import kz.bitlab.danikKolesaProject.model.DriveTrain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriveTrainMapper {
    DriveTrainDTO toDto(DriveTrain driveTrain);
    DriveTrain toModel(DriveTrainDTO driveTrainDTO);
    List<DriveTrainDTO> toDtoList(List<DriveTrain> driveTrainList);
    List<DriveTrain> toModelList(List<DriveTrainDTO> driveTrainDTOList);
}
