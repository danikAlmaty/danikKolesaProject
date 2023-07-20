package kz.bitlab.danikKolesaProject.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class DealDTO {
    private Long id;
    private LocalDateTime currentDate;
    private String phoneNumber;
    private Boolean isActive;
    private CarDTO carDTO;
    private Long dealUserId;
}
