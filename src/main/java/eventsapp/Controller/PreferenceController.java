package eventsapp.Controller;
import eventsapp.Repository.PreferenceRepository;
import eventsapp.entity.Preference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


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


}
