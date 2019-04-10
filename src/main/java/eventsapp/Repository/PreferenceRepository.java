package eventsapp.Repository;

import eventsapp.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PreferenceRepository extends JpaRepository <Preference, Integer> {


    @Query(value = "SELECT *\n" +
            "FROM preference\n" +
            "WHERE preference.id NOT IN (SELECT  preferenceid from userpreference where userid = ?1)", nativeQuery = true)
    List<Preference> findUnsubscribedPreferencesByUserID(Integer text);

    @Query(value = "SELECT *\n" +
            "FROM preference\n" +
            "WHERE preference.id IN (SELECT  preferenceid from userpreference where userid = ?1)", nativeQuery = true)
    List<Preference> findSubscribedPreferencesByUserID(Integer text);



}
