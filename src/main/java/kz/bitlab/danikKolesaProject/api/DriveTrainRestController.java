package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.DriveTrainDTO;
import kz.bitlab.danikKolesaProject.services.DriveTrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drive-train")
@RequiredArgsConstructor
public class DriveTrainRestController {
    private final DriveTrainService driveTrainService;

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public List<DriveTrainDTO> getAllDriveTrains(){
        return driveTrainService.getDriveTrains();
    }

    @GetMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public DriveTrainDTO getDriveTrain(
            @PathVariable(name = "id") Long id
    ){
        return driveTrainService.getDriveTrain(id);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public DriveTrainDTO addDriveTrain(
            @RequestBody DriveTrainDTO driveTrainDTO
    ){
        return driveTrainService.addDriveTrain(driveTrainDTO);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public DriveTrainDTO updateDriveTrain(
            @RequestBody DriveTrainDTO driveTrainDTO
    ){
        return driveTrainService.updateDriveTrain(driveTrainDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public void deleteDriveTrain(
            @PathVariable(name = "id") Long id
    ){
        driveTrainService.deleteDriveTrain(id);
    }
}
