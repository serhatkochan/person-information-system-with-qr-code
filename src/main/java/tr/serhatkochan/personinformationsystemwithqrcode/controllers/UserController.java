package tr.serhatkochan.personinformationsystemwithqrcode.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok("hahaha");
    }
}
