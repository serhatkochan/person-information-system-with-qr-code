package tr.serhatkochan.personinformationsystemwithqrcode.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllQrCodesResponse {
    private Integer id;
    private String title;
    private String code;
    private String userName; // tabloda name şeklinde kayıtlı
}
