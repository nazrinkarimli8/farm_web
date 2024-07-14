package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Egg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EggRepository extends JpaRepository<Egg, Integer> {
}
