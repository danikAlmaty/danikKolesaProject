package kz.bitlab.danikKolesaProject.repositories;

import jakarta.transaction.Transactional;
import kz.bitlab.danikKolesaProject.model.Deal;
import kz.bitlab.danikKolesaProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface DealRepository extends JpaRepository<Deal, Long> {
    @Modifying
    @Query("UPDATE Deal d SET d.isActive = NULL WHERE d.id = :id")
    void isActiveToNullById(Long id);
    List<Deal> findAllByIsActiveTrue();
    List<Deal> findAllByIsActiveFalse();
    @Query("SELECT d from Deal d WHERE LOWER(d.car.carBrand.name) LIKE %:keyword% " +
            "OR lower(d.car.model) LIKE %:keyword%")
    List<Deal> findDealsByCarBrandOrCarModel(@Param("keyword") String keyword);

    @Query("SELECT d from Deal d WHERE d.author.id = :id")
    List<Deal> findMyDeals(@Param("id") Long id);

    List<Deal> findAllByAuthorIsAndIsActiveTrue(User user);
}
