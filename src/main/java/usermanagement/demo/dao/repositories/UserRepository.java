package usermanagement.demo.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usermanagement.demo.dao.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
