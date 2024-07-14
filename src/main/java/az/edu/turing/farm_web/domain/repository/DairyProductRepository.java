package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.DairyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DairyProductRepository extends JpaRepository<DairyProduct, Integer> {
}
