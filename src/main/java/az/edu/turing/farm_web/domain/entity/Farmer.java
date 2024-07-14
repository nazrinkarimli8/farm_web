package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "farmers")
public class Farmer extends User {
    @Column(unique = true)
    private String farmName;
    private String farmDescription;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

}

