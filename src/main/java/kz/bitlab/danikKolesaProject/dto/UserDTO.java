package kz.bitlab.danikKolesaProject.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String email;
    private String fullName;

    private Boolean status;
    private List<PermissionDTO> permissionsDTO;
}
