package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.BodyStyleDTO;
import kz.bitlab.danikKolesaProject.mapper.BodyStyleMapper;
import kz.bitlab.danikKolesaProject.repositories.BodyStyleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BodyStyleService {
    private final BodyStyleRepository bodyStyleRepository;
    private final BodyStyleMapper bodyStyleMapper;

    public List<BodyStyleDTO> getBodyStyles(){
        return bodyStyleMapper.toDtoList(bodyStyleRepository.findAll());
    }

    public BodyStyleDTO getBodyStyle(Long id){
        return bodyStyleMapper.toDto(bodyStyleRepository.findById(id).orElseThrow());
    }

    public BodyStyleDTO addBodyStyle(BodyStyleDTO bodyStyleDTO){
        return bodyStyleMapper.toDto(bodyStyleRepository.save(bodyStyleMapper.toModel(bodyStyleDTO)));
    }

    public BodyStyleDTO updateBodyStyle(BodyStyleDTO bodyStyleDTO){
        return bodyStyleMapper.toDto(bodyStyleRepository.save(bodyStyleMapper.toModel(bodyStyleDTO)));
    }

    public void deleteBodyStyle(Long id){
        bodyStyleRepository.deleteById(id);
    }
}
