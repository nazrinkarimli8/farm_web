package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vegetables")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double weight; // in kg or lbs
    private boolean seasonal; // true if the vegetable is seasonal, false otherwise
    private boolean organic; // true if the vegetable is organic, false otherwise

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
