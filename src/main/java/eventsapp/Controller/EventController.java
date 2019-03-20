package eventsapp.Controller;

import eventsapp.entity.Event;
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
        String searchTerm = body.get("title");
        String searchTerm2 = body.get("description");
        return eventRepository.findByTitleContainingOrDescriptionContaining(searchTerm, searchTerm2);
    }

    /**TESTOWE QUERY - wyszukuje obiekty z title = "new" **/
    @PostMapping("/event/search2")
    public List<Event> search() {
        return eventRepository.findNewEvents();
    }


    /**TESTOWE QUERY2**/

    @PostMapping("/event/search3")
    public List<Event> search2(@RequestBody Map<String, String> text) {
        String searchTerm3 = text.get("text");
        return eventRepository.findQueryWithParameter(searchTerm3);
    }

    /**TESTOWE QUERY3**/

    @PostMapping("/event/search4")
    public List<Event> search3(@RequestBody Map<String, Integer> text) {
        Integer searchTerm3 = text.get("text");
        return eventRepository.findEventByUserID(searchTerm3);
    }


//    @PostMapping("/event/search2")
//    public List<Event> search2(@RequestBody Map<String, String> body){
//        String searchTerm = body.get("title");
//        String searchTerm2 = body.get("description");
//        return eventRepository.findByTitleContaining(searchTerm, searchTerm2);
//    }



//    @PostMapping("/event/search2")
//    public List<Event> search2(@RequestBody Map<String, String> body){
//        String searchTerm = body.get("text");
//        return eventRepository.findByTitle(searchTerm, searchTerm);
//    }

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