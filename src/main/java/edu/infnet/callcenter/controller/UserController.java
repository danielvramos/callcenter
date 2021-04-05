package edu.infnet.callcenter.controller;

import java.util.List;
import java.util.Optional;

import edu.infnet.callcenter.dto.UserDTO;
import edu.infnet.callcenter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getAll();
    }

    @PostMapping
    public UserDTO storeUser(@RequestBody UserDTO user) {
        return userService.save(user);
    }

    @PatchMapping("/{id}")
    public UserDTO patchUser(@RequestBody UserDTO user, @PathVariable Long id) {
        if(!userService.exists(id)) return null;

        return userService.update(user, id);
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        Optional<UserDTO> user = userService.getById(id);

        if(user.isEmpty()) return null;

        return user.get();
    }

    @DeleteMapping("/{id}")
    public Optional<UserDTO> deleteUser(@PathVariable Long id) {
        if(!userService.exists(id)) return null;

        return userService.deleteById(id);
    }
}
