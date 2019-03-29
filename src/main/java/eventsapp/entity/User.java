package eventsapp.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fireid;
    private String lastname;
    private String firstname;
    private String username;
    private String birthdate;
    private String homelocation;
    private String email;
    private String phone;

    public User() {}

    public User(String fireid, String lastname, String firstname, String username, String birthdate, String homelocation, String email, String phone) {
        this.setFireid(fireid);
        this.setLastname(lastname);
        this.setFirstname(firstname);
        this.setUsername(username);
        this.setBirthdate(birthdate);
        this.setHomelocation(homelocation);
        this.setEmail(email);
        this.setPhone(phone);
    }

    public User(String fireid, String firstname, String username, String birthdate, String homelocation, String email, String phone) {
        this.setFireid(fireid);
        this.setFirstname(firstname);
        this.setUsername(username);
        this.setBirthdate(birthdate);
        this.setHomelocation(homelocation);
        this.setEmail(email);
        this.setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFireid() {
        return fireid;
    }

    public void setFireid(String fireid) {
        this.fireid = fireid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getHomelocation() {
        return homelocation;
    }

    public void setHomelocation(String homelocation) {
        this.homelocation = homelocation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fireid='" + fireid + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", username='" + username + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", homelocation='" + homelocation + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
