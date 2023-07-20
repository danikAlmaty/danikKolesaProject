package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.BodyStyleDTO;
import kz.bitlab.danikKolesaProject.services.BodyStyleService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/body-style")
@RequiredArgsConstructor
public class BodyStyleRestController {
    private final BodyStyleService bodyStyleService;

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public List<BodyStyleDTO> bodyStyleDTOList(){
        return bodyStyleService.getBodyStyles();
    }

    @GetMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public BodyStyleDTO getBodyStyle(
            @PathVariable(name = "id") Long id
    ){
        return bodyStyleService.getBodyStyle(id);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public BodyStyleDTO addBodyStyle(
            @RequestBody BodyStyleDTO bodyStyleDTO
    ){
        return bodyStyleService.addBodyStyle(bodyStyleDTO);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public BodyStyleDTO updateBodyStyle(
            @RequestBody BodyStyleDTO bodyStyleDTO
    ){
        return bodyStyleService.updateBodyStyle(bodyStyleDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public void deleteBodyStyle(
            @PathVariable(name = "id") Long id
    ){
        bodyStyleService.deleteBodyStyle(id);
    }
}
