package eventsapp.Repository;

import eventsapp.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {


    /*Find all Events*/
    @Query(value = "SELECT * FROM event", nativeQuery = true)
    List<Event> findAllEvents();

    /*Find all Event for particular User by his id*/

    @Query(value = "SELECT id, title, description, category1, category2, category3, location, latitude, longitude, date," +
            " photoid, signup.signupid, signup.userid, signup.eventid FROM event INNER JOIN signup ON event.id = signup.eventid WHERE signup.userid = ?1", nativeQuery = true)
    List<Event> findEventByUserID(Integer text);




}


