package kz.bitlab.danikKolesaProject.services;


import kz.bitlab.danikKolesaProject.dto.DriveTrainDTO;
import kz.bitlab.danikKolesaProject.mapper.DriveTrainMapper;
import kz.bitlab.danikKolesaProject.repositories.DriveTrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriveTrainService {
    private final DriveTrainRepository driveTrainRepository;
    private final DriveTrainMapper driveTrainMapper;

    public List<DriveTrainDTO> getDriveTrains(){
        return driveTrainMapper.toDtoList(driveTrainRepository.findAll());
    }
    public DriveTrainDTO getDriveTrain(Long id){
        return driveTrainMapper.toDto(driveTrainRepository.findById(id).orElseThrow());
    }

    public DriveTrainDTO addDriveTrain(DriveTrainDTO driveTrainDTO){
        return driveTrainMapper.toDto(driveTrainRepository.save(driveTrainMapper.toModel(driveTrainDTO)));
    }

    public DriveTrainDTO updateDriveTrain(DriveTrainDTO driveTrainDTO){
        return driveTrainMapper.toDto(driveTrainRepository.save(driveTrainMapper.toModel(driveTrainDTO)));
    }

    public void deleteDriveTrain(Long id){
        driveTrainRepository.deleteById(id);
    }
}
