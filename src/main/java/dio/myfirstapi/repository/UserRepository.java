package dio.myfirstapi.repository;

import dio.myfirstapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getId()==null)
            System.out.println("SAVE - Receiving user in repository");
        else
            System.out.println("UPDATE - Receiving user in repository");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Receive id: %d to remove a user", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - List all system users");
        List<User> users = new ArrayList<>();
        users.add(new User("rodrigo","password"));
        users.add(new User("john","masterpass"));
        return users;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Receive id: %d to find a user", id));
        return new User("rodrigo","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Receive username: %s to find a user", username));
        return new User("rodrigo","password");
    }
}