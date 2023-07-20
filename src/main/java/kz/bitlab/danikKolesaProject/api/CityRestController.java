package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.CityDTO;
import kz.bitlab.danikKolesaProject.services.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityRestController {
    private final CityService cityService;

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public List<CityDTO> getCities(){
        return cityService.getCities();
    }

    @GetMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public CityDTO getCity(
            @PathVariable(name = "id") Long id
    ){
        return cityService.getCity(id);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public CityDTO addCity(
            @RequestBody CityDTO cityDTO
    ){
        return cityService.addCity(cityDTO);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public CityDTO updateCity(
            @RequestBody CityDTO cityDTO
    ){
        return cityService.updateCity(cityDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public void deleteCity(
            @PathVariable(name = "id") Long id
    ){
        cityService.deleteCity(id);
    }
}
