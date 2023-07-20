package kz.bitlab.danikKolesaProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "deal")
@Getter
@Setter
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "date_of_post")
    private LocalDateTime currentDate;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "is_active")
    private Boolean isActive;
    @OneToOne
    private Car car;
    @ManyToOne
    private User author;
}
