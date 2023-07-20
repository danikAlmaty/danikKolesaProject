package kz.bitlab.danikKolesaProject.repositories;

import jakarta.transaction.Transactional;
import kz.bitlab.danikKolesaProject.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByDealId(Long id);
}
