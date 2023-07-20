package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.PermissionDTO;
import kz.bitlab.danikKolesaProject.mapper.PermissionMapper;
import kz.bitlab.danikKolesaProject.repositories.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionService {
    private final PermissionRepository permissionRepository;
    private final PermissionMapper permissionMapper;

    public List<PermissionDTO> getAllPermissions(){
        return permissionMapper.toDtoList(permissionRepository.findAll());
    }
}
