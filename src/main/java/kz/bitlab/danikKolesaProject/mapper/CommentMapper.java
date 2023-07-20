package kz.bitlab.danikKolesaProject.mapper;

import kz.bitlab.danikKolesaProject.dto.CommentDTO;
import kz.bitlab.danikKolesaProject.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(source = "deal.id", target = "dealId")
    @Mapping(source = "user.fullName", target = "userFullName")
    @Mapping(source = "user.id", target = "userId")
    CommentDTO toDto(Comment comment);
    @Mapping(source = "dealId", target = "deal.id")
    @Mapping(source = "userFullName", target = "user.fullName")
    @Mapping(source = "userId", target = "user.id")
    Comment toModel(CommentDTO commentDTO);
    List<CommentDTO> toDtoList(List<Comment> comments);
    List<Comment> toModelList(List<CommentDTO> commentDTOList);

}
