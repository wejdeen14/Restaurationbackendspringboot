package dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
@Data
@NoArgsConstructor
public class MenuDto {
    @NotEmpty
    private String nom;
}
