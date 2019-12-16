package authenticate.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import authenticate.example.model.*;

@RestController
public class Contoller {

    @RequestMapping("/getUser")
    public Users user() {
        Users user = new Users("123123123", "test");
        return user;
    }

}