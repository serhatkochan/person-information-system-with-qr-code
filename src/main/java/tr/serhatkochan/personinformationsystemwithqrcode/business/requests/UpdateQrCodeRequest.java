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
public class UpdateQrCodeRequest {
    @NotNull
    private Integer id;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20)
    private String title;

    @NotNull
    @NotBlank
    private String code;

    @NotNull
    private Integer userId;
}
