package az.edu.turing.farm_web.dto.request;

import az.edu.turing.farm_web.domain.entity.Product;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DairyProductDto extends BaseProductDto{
    private String fatContent;  // e.g. "low-fat", "full-fat", etc.
    private String packaging;    // e.g. "bottle", "carton", etc.
}
