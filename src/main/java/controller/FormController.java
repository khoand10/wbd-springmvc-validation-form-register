package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import model.User;
import service.UserService;
import service.UserServiceImpl;

@Controller
public class FormController {
    UserService service = new UserServiceImpl();
    @GetMapping("/")
    public String getIndex(ModelMap model){
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping("/check")
    public String checkForm(@Validated @ModelAttribute("user")User user
            , BindingResult bindingResult,ModelMap model){
        if (bindingResult.hasFieldErrors()){
            return "index";
        }

        else {
            service.addUser(user);
            return "result";
        }
    }
}
