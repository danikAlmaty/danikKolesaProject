package kz.bitlab.danikKolesaProject.services;

import kz.bitlab.danikKolesaProject.dto.CommentDTO;
import kz.bitlab.danikKolesaProject.mapper.CommentMapper;
import kz.bitlab.danikKolesaProject.model.Comment;
import kz.bitlab.danikKolesaProject.model.User;
import kz.bitlab.danikKolesaProject.repositories.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;
    private final UserService userService;

    public List<CommentDTO> getAllComments(){
        return commentMapper.toDtoList(commentRepository.findAll());
    }

    public List<CommentDTO> getCommentsByDealId(Long id){
        return commentMapper.toDtoList(commentRepository.findAllByDealId(id));
    }

    public CommentDTO addComment(CommentDTO commentDTO){
        Comment comment = commentMapper.toModel(commentDTO);
        User user = userService.getCurrentSessionUser();
        if (user!=null && user.getStatus()){
            comment.setUser(user);
            comment.setCreatedAt(LocalDateTime.now());
            return commentMapper.toDto(commentRepository.save(comment));
        }
        return null;
    }

    public CommentDTO updateComment(CommentDTO commentDTO){
        return commentMapper.toDto(commentRepository.save(commentMapper.toModel(commentDTO)));
    }

    public void deleteComment(Long id){
        User user = userService.getCurrentSessionUser();
        if (user!=null){
            Comment comment = commentRepository.findById(id).orElseThrow();
            if (comment!=null && Objects.equals(comment.getUser().getId(), user.getId())){
                commentRepository.deleteById(id);
            }
        }
    }
}
