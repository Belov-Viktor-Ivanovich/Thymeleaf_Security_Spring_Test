package testgroup.securitytest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {
    @GetMapping
    public String getIndex(){
        return "startPage";
    }
    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

}
