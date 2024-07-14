package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Seed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeedRepository extends JpaRepository<Seed, Integer> {
}
