package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategoryId(int categoryId);
}
