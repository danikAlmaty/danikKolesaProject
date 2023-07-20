package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.CarDTO;
import kz.bitlab.danikKolesaProject.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarRestController {
    private final CarService carService;

    @GetMapping
    public List<CarDTO> getCars(){
        return carService.getAllCars();
    }

    @GetMapping(value = "{id}")
    public CarDTO getCar(
            @PathVariable(name = "id") Long id
    ){
        return carService.getCar(id);
    }

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    public CarDTO addCar(
            @RequestBody CarDTO carDTO
    ){
        return carService.addCar(carDTO);
    }

    @PutMapping
    @PreAuthorize("isAuthenticated()")
    public CarDTO updateCar(
            @RequestBody CarDTO carDTO
    ){
        return carService.updateCar(carDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public void deleteCar(
            @PathVariable(name = "id") Long id
    ){
        carService.deleteCar(id);
    }
}
