package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "eggs")
public class Egg  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int count; // number of eggs in the package
    private String size;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;// e.g. "large", "extra-large", etc.
}
