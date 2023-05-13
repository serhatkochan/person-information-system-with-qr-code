package tr.serhatkochan.personinformationsystemwithqrcode.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllQrCodesResponse {
    private int id;
    private String title;
    private String userName; // tabloda name şeklinde kayıtlı
}
