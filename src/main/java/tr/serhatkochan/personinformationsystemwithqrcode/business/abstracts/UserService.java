package tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts;

import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.UpdateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllUsersResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetByIdUserResponse;

import java.util.List;

public interface UserService {
    List<GetAllUsersResponse> getAll();

    GetByIdUserResponse getById(Integer id);

    void add(CreateUserRequest createUserRequest);

    void update(UpdateUserRequest updateUserRequest);

    void delete(Integer id);

}
