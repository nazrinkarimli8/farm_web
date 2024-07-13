package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
}
