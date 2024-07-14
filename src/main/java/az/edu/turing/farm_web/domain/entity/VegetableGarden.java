package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vegetable_gardens")
public class VegetableGarden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double weight; // in kg or lbs
    private String growingInstructions; // e.g. "full sun", "partial shade", etc.

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
