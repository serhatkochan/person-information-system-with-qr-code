package tr.serhatkochan.personinformationsystemwithqrcode.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts.UserService;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.UpdateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllUsersResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetByIdUserResponse;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping
    public List<GetAllUsersResponse> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdUserResponse getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() CreateUserRequest createUserRequest) {
        userService.add(createUserRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateUserRequest updateUserRequest) {
        userService.update(updateUserRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }


}
