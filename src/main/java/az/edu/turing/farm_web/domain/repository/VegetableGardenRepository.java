package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.VegetableGarden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableGardenRepository extends JpaRepository<VegetableGarden, Integer> {
}