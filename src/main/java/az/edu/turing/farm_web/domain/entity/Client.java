package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;

@Entity
@Builder
@Data
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
public class Client extends User {
    // no additional fields needed for clients
    @Column(name = "client_description",unique = true)
    private String clientDescription;

}