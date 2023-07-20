package kz.bitlab.danikKolesaProject.repositories;

import jakarta.transaction.Transactional;
import kz.bitlab.danikKolesaProject.model.DriveTrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DriveTrainRepository extends JpaRepository<DriveTrain, Long> {
}
