package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.CommentDTO;
import kz.bitlab.danikKolesaProject.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentRestController {
    private final CommentService commentService;

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public List<CommentDTO> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public List<CommentDTO> getCommentByDeal(
            @PathVariable(name = "id") Long id
    ){
        return commentService.getCommentsByDealId(id);
    }

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    public CommentDTO addComment(@RequestBody CommentDTO commentDTO){
        return commentService.addComment(commentDTO);
    }

    @PutMapping
    @PreAuthorize("isAuthenticated()")
    public CommentDTO updateComment(@RequestBody CommentDTO commentDTO){
        return commentService.updateComment(commentDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public void deleteComment(
            @PathVariable(name = "id") Long id
    ){
        commentService.deleteComment(id);
    }
}
