package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
}
