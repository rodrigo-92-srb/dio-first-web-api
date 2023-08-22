package dio.myfirstapi.controller;

import dio.myfirstapi.model.User;
import dio.myfirstapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username){
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }

}
