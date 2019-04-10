package eventsapp.Controller;
import eventsapp.Repository.UserPreferenceRepository;
import eventsapp.entity.Userpreference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserPreferenceController {

    @Autowired
    UserPreferenceRepository userPreferenceRepository;


    @GetMapping("/userpreference")
    public List<Userpreference> index(){
        return userPreferenceRepository.findAll();
    }

    /**Create Userpreference**/
    @PostMapping("/userpreference")
    public Userpreference create (@RequestBody Map<String , Integer> body) {
        Integer userid = body.get("userid");
        Integer preferenceid = body.get("preferenceid");
        return userPreferenceRepository.save(new Userpreference(userid, preferenceid));
    }
    /**Delete Userpreference**/
    @DeleteMapping("/userpreference/delete/{id}")
    public boolean delete(@PathVariable String id){
        int userpreferenceid = Integer.parseInt(id);
        userPreferenceRepository.delete(userPreferenceRepository.findById(userpreferenceid).get());
        return true;
    }

    @GetMapping("/userpreference/{id}")
     public List<Userpreference> userpreferences(@PathVariable String id) {
        int searchTerm = Integer.parseInt(id);
        return userPreferenceRepository.findUserpreferenceByUserID(searchTerm);
    }

}
