package controller;

public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}