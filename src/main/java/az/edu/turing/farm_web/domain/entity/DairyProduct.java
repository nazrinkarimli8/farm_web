package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DairyProduct extends Product {
    private String fatContent; // e.g. "low-fat", "full-fat", etc.
    private String packaging; // e.g. "bottle", "carton", etc.
}
