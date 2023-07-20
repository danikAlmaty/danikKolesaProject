package kz.bitlab.danikKolesaProject.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDTO {
    private Long id;
    private String content;
    private LocalDateTime createdAt;
    private Long dealId;
    private String userFullName;
    private Long userId;
}
