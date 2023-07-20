package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.CarBrandDTO;
import kz.bitlab.danikKolesaProject.services.CarBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car-brands")
@RequiredArgsConstructor
public class CarBrandRestController {
    private final CarBrandService carBrandService;

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public List<CarBrandDTO> carBrandDTOList(){
        return carBrandService.getCarBrands();
    }

    @GetMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public CarBrandDTO getCarBrandDto(
            @PathVariable(name = "id") Long id
    ){
        return carBrandService.getCarBrand(id);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public CarBrandDTO addCarBrand(
            @RequestBody CarBrandDTO carBrandDTO
    ){
        return carBrandService.addCarBrand(carBrandDTO);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public CarBrandDTO updateCarBrand(
            @RequestBody CarBrandDTO carBrandDTO
    ){
        return carBrandService.updateCarBrand(carBrandDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public void deleteCarBrand(
            @PathVariable(name = "id") Long id
    ){
        carBrandService.deleteCarBrand(id);
    }
}
