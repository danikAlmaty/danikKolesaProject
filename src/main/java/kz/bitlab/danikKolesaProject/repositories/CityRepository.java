package kz.bitlab.danikKolesaProject.repositories;

import jakarta.transaction.Transactional;
import kz.bitlab.danikKolesaProject.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CityRepository extends JpaRepository<City, Long> {
}
