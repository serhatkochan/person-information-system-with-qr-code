package tr.serhatkochan.personinformationsystemwithqrcode.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts.UserService;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllUsersResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.entities.concretes.User;
import tr.serhatkochan.personinformationsystemwithqrcode.dataAccess.abstracts.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor // bunu neden kullanıyoruz ??
public class UserManager implements UserService {
    private UserRepository userRepository;
    @Override
    public List<GetAllUsersResponse> getAll() {
        List<User> users = userRepository.findAll();
        List<GetAllUsersResponse> usersResponses = new ArrayList<GetAllUsersResponse>();
        for (User user : users) {
            GetAllUsersResponse responseItem = new GetAllUsersResponse();
            responseItem.setId(user.getId());
            responseItem.setName(user.getName());
            usersResponses.add(responseItem);
        }
        return usersResponses;
    }

    @Override
    public void add(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setName(createUserRequest.getName());

        userRepository.save(user);
    }
}
