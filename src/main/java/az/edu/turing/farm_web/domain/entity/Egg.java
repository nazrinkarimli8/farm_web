package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Egg extends Product {
    private int count; // number of eggs in the package
    private String size; // e.g. "large", "extra-large", etc.
}
