package springredditclone.springredditclone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springredditclone.springredditclone.model.Subreddit;

@Repository
public interface  SubredditRepository extends JpaRepository<Subreddit, Long> {
}
