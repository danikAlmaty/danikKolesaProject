package kz.bitlab.danikKolesaProject.controllers;

import kz.bitlab.danikKolesaProject.model.User;
import kz.bitlab.danikKolesaProject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final UserService userService;

    @GetMapping(value = "/")
    public String indexPage(){
        return "index";
    }

    @GetMapping(value = "/sign-in-page")
    public String signIn(){
        return "sign_in";
    }

    @GetMapping(value = "/profile")
    @PreAuthorize("isAuthenticated()")
    public String profilePage(){
        return "profile";
    }

    @GetMapping(value = "/sign-up-page")
    public String signUpPage(){
        return "sign_up";
    }

    @GetMapping(value = "/change-password-page")
    @PreAuthorize("isAuthenticated()")
    public String changePassword(){
        return "change_password";
    }

    @PostMapping(value = "/to-sign-up")
    public String toSignUp(
            @RequestParam(name = "user_email") String email,
            @RequestParam(name = "user_password") String password,
            @RequestParam(name = "re_user_password") String rePassword,
            @RequestParam(name = "user_full_name") String fullName
    ){
        if (password.equals(rePassword)){
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            user.setFullName(fullName);
            User newUser = userService.addUser(user);
            if (newUser != null){
                return "redirect:/sign-up-page?success";
            } else {
                return "redirect:/sign-up-page?emailerror";
            }
        } else {
            return "redirect:/sign-up-page?passworderror";
        }
    }

    @PostMapping(value = "/change-password")
    @PreAuthorize("isAuthenticated()")
    public String toChangePassword(
            @RequestParam(name = "old_password") String oldPassword,
            @RequestParam(name = "new_password") String newPassword,
            @RequestParam(name = "re_new_password") String reNewPassword
    ){
        if (newPassword.equals(reNewPassword)){
            User user = userService.changePassword(newPassword, oldPassword);
            if (user != null){
                return "redirect:/change-password-page?successchange";
            } else {
                return "redirect:/change-password-page?oldpasswordnotcorrect";
            }
        } else {
            return "redirect:/change-password-page?passwordmissmatch";
        }
    }

    @GetMapping(value = "/car-details/" + "{id}")
    public String carDetails(
            @PathVariable(name = "id") Long id
    ){
        return "car_details";
    }

    @GetMapping(value = "/add-deal")
    @PreAuthorize("isAuthenticated()")
    public String addDeal(){
        return "add_deal_page";
    }

    @GetMapping(value = "/my-deals")
    @PreAuthorize("isAuthenticated()")
    public String myDeals(){
        return "my_deals";
    }
}
