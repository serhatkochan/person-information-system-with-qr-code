package tr.serhatkochan.personinformationsystemwithqrcode.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersResponse {
    private Integer id;
    private String name;
}
