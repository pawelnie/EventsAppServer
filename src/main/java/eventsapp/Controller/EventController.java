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


    /**Get all events**/
    @GetMapping("/event")
    public List<Event> index(){
        return eventRepository.findAllEvents();
    }

    @GetMapping("/eventALL")
    public List<Event> indexALL(){
        return eventRepository.findAll();
    }

    /**Get single event with {id}**/
    @GetMapping("/event/{id}")
    public Event show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return eventRepository.findById(blogId).get();
    }


    /**Get all events assigned to user {id}**/
    @PostMapping("/event/userevents/{id}")
    public List<Event> userevents(@PathVariable String id) {
        int searchTerm3 = Integer.parseInt(id);
        return eventRepository.findEventByUserID(searchTerm3);
    }

    /**CREATE NEW EVENT**/
    @PostMapping("/event")
    public Event create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String description = body.get("description");
        String location = body.get("location");
        String latitude = body.get("latitude");
        String longitude = body.get("longitude");
        String photoid = body.get("photoid");
        String date = body.get("date");
        String category1 = body.get("category1");
        String category2 = body.get("category2");
        String category3 = body.get("category3");
        return eventRepository.save(new Event(title, description, location, latitude,
                longitude, photoid, date, category1, category2, category3));
    }


    /**
     *OTHER QUERIES BELOW
     **/



    /**Query not prepared by me, probably not working**/
    @PostMapping("/event/search")
    public List<Event> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("title");
        String searchTerm2 = body.get("description");
        return eventRepository.findByTitleContainingOrDescriptionContaining(searchTerm, searchTerm2);
    }

    /**TESTOWE QUERY - wyszukuje obiekty z title = "new"
     * chyba nie dziala**/
    @PostMapping("/event/search2")
    public List<Event> search() {
        return eventRepository.findNewEvents();
    }


    /**Redundant, better one for finding EventByID is available above
     * Get all events assigned to user, user id provided in json**/
//    @PostMapping("/event/search4")
//    public List<Event> search3(@RequestBody Map<String, Integer> text) {
//        Integer searchTerm3 = text.get("text");
//        return eventRepository.findEventByUserID(searchTerm3);
//    }


    /**TESTOWE QUERY2
     * wyszukuje po slowie w title, dane serwowane w json**/

    @PostMapping("/event/search3")
    public List<Event> search2(@RequestBody Map<String, String> text) {
        String searchTerm3 = text.get("text");
        return eventRepository.findQueryWithParameter(searchTerm3);
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