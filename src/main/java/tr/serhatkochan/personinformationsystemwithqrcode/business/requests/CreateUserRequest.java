package tr.serhatkochan.personinformationsystemwithqrcode.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    @NotNull
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    @NotNull // javax.validation.constraints
    @NotBlank // FE sadece kullanıcı etkileşimini iyileştirmek için yapılır, zorunlu değildir.
    @Size(min = 3, max = 20)
    private String name;

    @NotNull
    private boolean isAdmin;
}
