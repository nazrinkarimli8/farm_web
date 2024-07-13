package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.MeatProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeatProductRepository extends JpaRepository<MeatProduct, Long> {
}