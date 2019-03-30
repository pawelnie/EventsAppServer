package eventsapp.entity;
import javax.persistence.*;

@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int signupid;
    private int userid;
    private int eventid;

    public Signup() {  }

    public Signup(int userid, int eventid) {
        this.userid = userid;
        this.eventid = eventid;
    }


    public int getSignupid() {
        return signupid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    @Override
    public String toString() {
        return "Signup{" +
                "signupid=" + signupid +
                ", userid=" + userid +
                ", eventid=" + eventid +
                '}';
    }
}
