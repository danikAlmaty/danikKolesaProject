package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.TransmissionDTO;
import kz.bitlab.danikKolesaProject.mapper.TransmissionMapper;
import kz.bitlab.danikKolesaProject.repositories.TransmissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransmissionService {
    private final TransmissionRepository transmissionRepository;
    private final TransmissionMapper transmissionMapper;

    public List<TransmissionDTO> getAllTransmissions(){
        return transmissionMapper.toDtoList(transmissionRepository.findAll());
    }

    public TransmissionDTO getTransmission(Long id){
        return transmissionMapper.toDto(transmissionRepository.findById(id).orElseThrow());
    }

    public TransmissionDTO addTransmission(TransmissionDTO transmissionDTO){
        return transmissionMapper.toDto(transmissionRepository.save(transmissionMapper.toModel(transmissionDTO)));
    }

    public TransmissionDTO updateTransmission(TransmissionDTO transmissionDTO){
        return transmissionMapper.toDto(transmissionRepository.save(transmissionMapper.toModel(transmissionDTO)));
    }

    public void deleteTransmission(Long id){
        transmissionRepository.deleteById(id);
    }
}
