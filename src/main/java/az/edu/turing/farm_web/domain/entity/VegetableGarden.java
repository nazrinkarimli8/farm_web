package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VegetableGarden extends Product {
    private double weight; // in kg or lbs
    private String growingInstructions; // e.g. "full sun", "partial shade", etc.
}
