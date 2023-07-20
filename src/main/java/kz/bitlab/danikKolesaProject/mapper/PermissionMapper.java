package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.PermissionDTO;
import kz.bitlab.danikKolesaProject.model.Permission;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    PermissionDTO toDto(Permission permission);
    Permission toModel(PermissionDTO permissionDTO);
    List<PermissionDTO> toDtoList(List<Permission> permissionList);
    List<Permission> toModelList(List<PermissionDTO> permissionDTOList);
}
