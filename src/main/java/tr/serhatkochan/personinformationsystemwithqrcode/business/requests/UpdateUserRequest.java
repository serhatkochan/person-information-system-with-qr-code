package tr.serhatkochan.personinformationsystemwithqrcode.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {
    private Integer id;
    private String name;
}
