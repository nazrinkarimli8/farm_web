package az.edu.turing.farm_web.domain.repository;

import az.edu.turing.farm_web.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

