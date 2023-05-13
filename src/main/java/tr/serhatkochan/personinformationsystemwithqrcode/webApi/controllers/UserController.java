package tr.serhatkochan.personinformationsystemwithqrcode.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts.UserService;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateUserRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllUsersResponse;

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

    @PostMapping("/add")
    public void add(@RequestBody()CreateUserRequest createUserRequest) {
        userService.add(createUserRequest);
    }
}
