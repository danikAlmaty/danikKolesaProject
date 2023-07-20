package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.CityDTO;
import kz.bitlab.danikKolesaProject.mapper.CityMapper;
import kz.bitlab.danikKolesaProject.repositories.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    public List<CityDTO> getCities(){
        return cityMapper.toDtoList(cityRepository.findAll());
    }
    public CityDTO getCity(Long id){
        return cityMapper.toDto(cityRepository.findById(id).orElseThrow());
    }
    public CityDTO addCity(CityDTO cityDTO){
        return cityMapper.toDto(cityRepository.save(cityMapper.toModel(cityDTO)));
    }
    public CityDTO updateCity(CityDTO cityDTO){
        return cityMapper.toDto(cityRepository.save(cityMapper.toModel(cityDTO)));
    }
    public void deleteCity(Long id){
        cityRepository.deleteById(id);
    }
}
