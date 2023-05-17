package tr.serhatkochan.personinformationsystemwithqrcode.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByCodeQrCodesResponse {
    private Integer id;
    private String title;
    private String code;
    private String userId; // tabloda id şeklinde kayıtlı
    private String userName; // tabloda name şeklinde kayıtlı
}
