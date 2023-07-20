package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.TransmissionDTO;
import kz.bitlab.danikKolesaProject.services.TransmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transmission")
@RequiredArgsConstructor
public class TransmissionRestController {
    private final TransmissionService transmissionService;

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public List<TransmissionDTO> getTransmissions(){
        return transmissionService.getAllTransmissions();
    }

    @GetMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public TransmissionDTO getTransmission(
            @PathVariable(name = "id") Long id
    ){
        return transmissionService.getTransmission(id);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public TransmissionDTO addTransmission(
            @RequestBody TransmissionDTO transmissionDTO
    ){
        return transmissionService.addTransmission(transmissionDTO);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public TransmissionDTO updateTransmission(
            @RequestBody TransmissionDTO transmissionDTO
    ){
        return transmissionService.updateTransmission(transmissionDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public void deleteTransmission(
            @PathVariable(name = "id") Long id
    ) {
        transmissionService.deleteTransmission(id);
    }
}
