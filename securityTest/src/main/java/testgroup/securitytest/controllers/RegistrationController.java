package testgroup.securitytest.controllers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import testgroup.securitytest.entities.User;
import testgroup.securitytest.servises.UserService;

@Controller
@AllArgsConstructor
public class RegistrationController {
    UserService service;
    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("user",new User());
        return "registration";
    }
    @PostMapping("/registration")
    public String registration(@ModelAttribute("user")User user,Model model){
        service.save(user);
        return "redirect:/login";
    }
    @GetMapping("/users")
    public String getAllBy(){
        return "login";
    }
}
