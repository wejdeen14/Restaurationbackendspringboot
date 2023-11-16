package dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
@Data
@NoArgsConstructor
public class OffreSpecialDto {
    @NotEmpty
    private String nom;
    @NotEmpty
    private float reduction;

}
