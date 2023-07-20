package kz.bitlab.danikKolesaProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @ManyToOne
    private User user;
    @ManyToOne
    private Deal deal;
}
