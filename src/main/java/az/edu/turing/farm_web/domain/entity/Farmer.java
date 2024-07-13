package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Farmer extends User {
    @Column(unique = true)
    private String farmName;
    private String farmDescription;
}

