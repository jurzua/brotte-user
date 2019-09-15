package cl.brotte.user.controller;

import cl.brotte.user.domain.User;
import cl.brotte.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public User get(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
