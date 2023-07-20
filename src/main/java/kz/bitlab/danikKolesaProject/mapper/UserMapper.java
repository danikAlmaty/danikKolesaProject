package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.UserDTO;
import kz.bitlab.danikKolesaProject.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "permissons", target = "permissionsDTO")
    UserDTO toDto(User user);
    @Mapping(source = "permissionsDTO", target = "permissons")
    User toModel(UserDTO userDTO);
    List<UserDTO> toDtoList(List<User> userList);
    List<User> toModelList(List<UserDTO> userDTOList);
}
