package az.edu.turing.farm_web.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}

//fermer
//id
//        ad
//soyad
//
//
//                pomidor
//id
//                        sayi
//fermer_id references fermer(id)