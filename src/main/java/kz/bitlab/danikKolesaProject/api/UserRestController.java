package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.UserDTO;
import kz.bitlab.danikKolesaProject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public UserDTO getUser(
            @PathVariable(name = "id") Long id
    ){
        return userService.getUser(id);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public void deleteUser(@RequestBody UserDTO userDTO){
        userService.deleteUser(userDTO);
    }
}
