package tr.serhatkochan.personinformationsystemwithqrcode.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdUserResponse {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private boolean isAdmin;
}
