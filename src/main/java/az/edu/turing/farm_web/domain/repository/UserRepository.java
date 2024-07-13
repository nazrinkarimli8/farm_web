package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
