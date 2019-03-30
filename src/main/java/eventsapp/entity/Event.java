package eventsapp.entity;
import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
    private String location;
    private String latitude;
    private String longitude;
    private String photoid;
    private String date;
    private String category1;
    private String category2;
    private String category3;
    private String signup;
    private String userid;
    private String eventid;

    public Event() {  }

    public Event(String title, String description, String location, String latitude,
                 String longitude, String photoid, String date, String category1, String category2, String category3) {
        this.setTitle(title);
        this.setDescription(description);
        this.setLocation(location);
        this.setLatitude(latitude);
        this.setLongitude(longitude);
        this.setPhotoid(photoid);
        this.setDate(date);
        this.setCategory1(category1);
        this.setCategory2(category2);
        this.setCategory3(category3);
    }

    public Event(int id, String title, String description) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);

    }


    public void setSignup(String signup) {
        this.signup = signup;
    }
    public String getSignup() {
        return signup;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPhotoid() {
        return photoid;
    }

    public void setPhotoid(String photoid) {
        this.photoid = photoid;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
//getter i setter generowany przez intellij
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", location='" + date + '\'' +
                ", location='" + latitude + '\'' +
                ", location='" + longitude + '\'' +
                ", location='" + photoid + '\'' +
                ", category1='" + category1 + '\'' +
                ", category2='" + category2 + '\'' +
                ", category3='" + category3 + '\'' +
                ", signup'" + signup + '\'' +
                '}';
    }
}
