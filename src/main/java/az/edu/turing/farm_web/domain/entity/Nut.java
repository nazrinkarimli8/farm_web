package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nut extends Product {
    private double weight; // in kg or lbs
    private String shellType; // e.g. "shelled", "unshelled", etc.
}
