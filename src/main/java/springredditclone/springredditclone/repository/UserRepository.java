package springredditclone.springredditclone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springredditclone.springredditclone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
