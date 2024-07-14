package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dairy_products")
public class DairyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fat_content")
    private String fatContent;  // e.g. "low-fat", "full-fat", etc.

    @Column(name = "packaging")
    private String packaging;    // e.g. "bottle", "carton", etc.

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
