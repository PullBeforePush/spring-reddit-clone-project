package springredditclone.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springredditclone.springredditclone.model.comment;

@Repository
public interface commentRepository extends JpaRepository<comment, Long> {
}
