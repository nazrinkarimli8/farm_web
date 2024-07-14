package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer> {
}