package eventsapp.Controller;

import eventsapp.Event;
import eventsapp.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EventController {

//    The Controller handles all incoming HTTP request from the user
//    and returns an appropriate response. In some languages,
//    Route files map the HTTP requests to the appropriate Controller.

    @Autowired
    EventRepository eventRepository;

    @GetMapping("/event")
    public List<Event> index(){
        return eventRepository.findAll();
    }

    @GetMapping("/event/{id}")
    public Event show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return eventRepository.findById(blogId).get();
    }

    @PostMapping("/event/search")
    public List<Event> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return eventRepository.findByTitleContainingOrDescriptionContaining(searchTerm, searchTerm);
    }

    @PostMapping("/event")
    public Event create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String description = body.get("description");
        return eventRepository.save(new Event(title, description));
    }

    @PutMapping("/event/{id}")
    public Event update(@PathVariable String id, @RequestBody Map<String, String> body){
        int blogId = Integer.parseInt(id);
        // getting event
        Event event = eventRepository.findById(blogId).get();
        event.setTitle(body.get("title"));
        event.setDescription(body.get("description"));
        return eventRepository.save(event);
    }

    @DeleteMapping("event/delete/{id}")
    public boolean delete(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        eventRepository.delete(eventRepository.findById(blogId).get());
        return true;
    }


}