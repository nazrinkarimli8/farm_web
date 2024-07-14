package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
