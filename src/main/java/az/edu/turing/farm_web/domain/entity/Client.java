package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;

@Entity
@Builder
@Data

public class Client extends User {
    // no additional fields needed for clients
    public Client() {
        super();
    }
    public Client(Long id, Role role) {
        super( id,role);
    }


}