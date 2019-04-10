package eventsapp.Repository;
import eventsapp.entity.Userpreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserPreferenceRepository extends JpaRepository<Userpreference, Integer> {

    @Query(value = "SELECT * FROM userpreference where userid = ?1", nativeQuery = true)
    List<Userpreference> findUserpreferenceByUserID(Integer text);

    /*Find all Userpreference*/
    @Query(value = "SELECT * FROM userpreference", nativeQuery = true)
    List<Userpreference> findAllUserPreference2();
}
