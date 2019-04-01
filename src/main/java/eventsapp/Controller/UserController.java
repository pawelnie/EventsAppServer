package eventsapp.Controller;

import eventsapp.Repository.UserRepository;
import eventsapp.entity.Event;
import eventsapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User show(@PathVariable String id){
        int userId = Integer.parseInt(id);
        return userRepository.findById(userId).get();
    }



    @PostMapping("/user")
    public User create(@RequestBody Map<String, String> body){
        String fireid = body.get("fireid");
        String lastname = body.get("lastname");
        String firstname = body.get("firstname");
        String username = body.get("username");
        String birthdate = body.get("birthdate");
        String homelocation = body.get("homelocation");
        String email = body.get("email");
        String phone = body.get("phone");
        return userRepository.save(new User(fireid, lastname, firstname, username, birthdate, homelocation, email, phone));
    }

    /**Get User id by his fireid**/
    @GetMapping("/user/id/{fireid}")
    public List<User> userevents(@PathVariable String fireid) {
        String searchTerm = fireid;
        return userRepository.finUserId(searchTerm);
    }
}
