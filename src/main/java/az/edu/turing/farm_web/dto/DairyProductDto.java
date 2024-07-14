package az.edu.turing.farm_web.dto;

import az.edu.turing.farm_web.domain.entity.Category;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DairyProductDto {
    private String name;
    private BigDecimal price;
    private String description;
    private String category;
}
