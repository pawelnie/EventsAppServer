package eventsapp.Controller;


import eventsapp.Repository.SignupRepository;
import eventsapp.entity.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class SignupController {

    @Autowired
    SignupRepository signupRepository;

    /**Create signup**/
    @PostMapping("/signup")
    public Signup create (@RequestBody Map<String , Integer> body) {
        Integer userid = body.get("userid");
        Integer eventid = body.get("eventid");
        return signupRepository.save(new Signup(userid, eventid));
    }

    @DeleteMapping("/signup/{signupid}")
    public boolean delete(@PathVariable String signupid){
        int id = Integer.parseInt(signupid);
        signupRepository.delete(signupRepository.findById(id).get());
        return true;
    }


}
