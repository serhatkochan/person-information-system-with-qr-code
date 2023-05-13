package tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts;

import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllUsersResponse;

import java.util.List;

public interface UserService {
    List<GetAllUsersResponse> getAll();
    void add (CreateUserRequest createUserRequest);
}
