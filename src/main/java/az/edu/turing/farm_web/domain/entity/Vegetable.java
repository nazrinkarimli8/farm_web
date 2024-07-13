package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vegetable extends Product {
    private double weight; // in kg or lbs
    private boolean seasonal; // true if the vegetable is seasonal, false otherwise
    private boolean organic; // true if the vegetable is organic, false otherwise
}
