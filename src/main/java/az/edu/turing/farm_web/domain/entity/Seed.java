package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seeds")
public class Seed  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int packetSize; // number of seeds in the packet
    private String instructions; // growing instructions for the seed

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
