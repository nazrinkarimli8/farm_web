package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Category;
import az.edu.turing.farm_web.domain.entity.ECategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByCategory(ECategory name);
}
