package az.edu.turing.farm_web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EggDto extends BaseProductDto{
    private int count;
    private String size;
}
