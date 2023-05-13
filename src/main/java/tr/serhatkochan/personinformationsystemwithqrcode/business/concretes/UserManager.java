package tr.serhatkochan.personinformationsystemwithqrcode.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts.UserService;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.UpdateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllUsersResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetByIdUserResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.core.utilities.mappers.ModelMapperService;
import tr.serhatkochan.personinformationsystemwithqrcode.entities.concretes.User;
import tr.serhatkochan.personinformationsystemwithqrcode.dataAccess.abstracts.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor // bunu neden kullanıyoruz ??
public class UserManager implements UserService {
    private UserRepository userRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllUsersResponse> getAll() {
        List<User> users = userRepository.findAll();
        List<GetAllUsersResponse> getAllUsersResponse = users.stream() // tek tek gez
                .map(user -> modelMapperService.forResponse()
                        .map(user, GetAllUsersResponse.class))
                .collect(Collectors.toList()); // bunları toplam şu tipe çevir
        return getAllUsersResponse;
    }

    @Override
    public GetByIdUserResponse getById(int id) {
        Optional<User> user = userRepository.findById(id); // bulamazsa orElseThrow veya Optional yapacaz

        GetByIdUserResponse getByIdUserResponse = modelMapperService.forResponse()
                .map(user, GetByIdUserResponse.class);
        return getByIdUserResponse;
    }

    @Override
    public void add(CreateUserRequest createUserRequest) {
        User user = modelMapperService.forRequest().map(createUserRequest, User.class);
        userRepository.save(user);
    }

    @Override
    public void update(UpdateUserRequest updateUserRequest) {
        User user = modelMapperService.forRequest().map(updateUserRequest, User.class);
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
