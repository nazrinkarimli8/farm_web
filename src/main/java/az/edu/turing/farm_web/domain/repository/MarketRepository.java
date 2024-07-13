package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market, Long> {
}
