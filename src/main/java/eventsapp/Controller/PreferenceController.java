package eventsapp.Controller;
import eventsapp.Repository.PreferenceRepository;
import eventsapp.entity.Preference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class PreferenceController {
    @Autowired
    PreferenceRepository preferenceRepository;

    @GetMapping("/preference")
    public List<Preference> index(){return preferenceRepository.findAll();
    }

    /**Get Unsubscribed Preferences by UserID**/
    @GetMapping("/preference/unsubscribed/{id}")
    public List<Preference> unsubscribedPreferences(@PathVariable String id) {
        int searchTerm = Integer.parseInt(id);
        return preferenceRepository.findUnsubscribedPreferencesByUserID(searchTerm);
    }

    @GetMapping("/preference/subscribed/{id}")
    public List<Preference> subscribedPreferences(@PathVariable String id) {
        int searchTerm = Integer.parseInt(id);
        return preferenceRepository.findSubscribedPreferencesByUserID(searchTerm);
    }

    /**Create new Preference**/
    @PostMapping("/preference")
    public Preference create (@RequestBody Map<String , String> body) {
        String title = body.get("title");
        String description = body.get("description");
        return preferenceRepository.save(new Preference(title, description));
    }

}
