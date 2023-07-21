package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.UserDTO;
import kz.bitlab.danikKolesaProject.mapper.UserMapper;
import kz.bitlab.danikKolesaProject.model.Permission;
import kz.bitlab.danikKolesaProject.model.User;
import kz.bitlab.danikKolesaProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;


public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user != null){
            return user;
        }
        else {
            throw new UsernameNotFoundException("User Not Found");
        }
    }

    public User addUser(User user){
        User checkUser = userRepository.findByEmail(user.getEmail());
        if (checkUser == null){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setStatus(true);
            Permission permission = new Permission();
            permission.setId(1L);
            permission.setRole("ROLE_USER");
            List<Permission> basePermission = new ArrayList<>();
            basePermission.add(permission);
            user.setPermissons(basePermission);
            return userRepository.save(user);
        }
        return null;
    }

    public User changePassword(String newPassword, String oldPassword){
        User currentUser = getCurrentSessionUser();
        if (passwordEncoder.matches(oldPassword, currentUser.getPassword())){
            if (!(newPassword.equals(oldPassword))){
                currentUser.setPassword(passwordEncoder.encode(newPassword));
                return userRepository.save(currentUser);
            }
        }
        return null;
    }

    public User getCurrentSessionUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)){
            User user = (User) authentication.getPrincipal();
            if (user != null){
                return user;
            }
        }
        return null;
    }

    public List<UserDTO> getAllUsers(){
        List<User> userList = userRepository.findAll();
        return userMapper.toDtoList(userList);
    }

    public UserDTO getUser(Long id){
        return userMapper.toDto(userRepository.findById(id).orElseThrow());
    }

    public UserDTO updateUser(UserDTO userDTO){
        User currentUser = userRepository.findById(userDTO.getId()).orElseThrow();
        User updateUser = userMapper.toModel(userDTO);
        currentUser.setPermissons(updateUser.getPermissons());
        userRepository.save(currentUser);
        return userMapper.toDto(currentUser);
    }

    public void deleteUser(UserDTO userDTO){
        User user = userRepository.findById(userDTO.getId()).orElseThrow();
        user.setStatus(userDTO.getStatus());
        userRepository.save(user);
    }
}
