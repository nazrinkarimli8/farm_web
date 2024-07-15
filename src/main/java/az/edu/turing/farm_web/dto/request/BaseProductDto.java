package az.edu.turing.farm_web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseProductDto {
    private String name;
    private BigDecimal price;
    private String description;
    private String categoryName;
}
