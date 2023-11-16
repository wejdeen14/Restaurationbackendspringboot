package dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
@Data
@NoArgsConstructor
public class UtlisateurDto {
    @NotEmpty
    private String nom;
    @NotEmpty
    private String prenom;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    @NotEmpty(message = "role should not be empty")
    private String role;

}
