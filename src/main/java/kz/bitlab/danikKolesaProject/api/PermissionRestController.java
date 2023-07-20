package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.PermissionDTO;
import kz.bitlab.danikKolesaProject.services.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permissions")
@RequiredArgsConstructor
public class PermissionRestController {
    private final PermissionService permissionService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public List<PermissionDTO> getList(){
        return permissionService.getAllPermissions();
    }
}
