package eventsapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userpreference {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private int userid;
        private int preferenceid;

        public int getId() {
            return id;
        }

        public int getUserid() {
            return userid;
        }

        public void setUserid(int userid) {
            this.userid = userid;
        }

        public int getPreferenceid() {
            return preferenceid;
        }

        public void setPreferenceid(int preferenceid) {
            this.preferenceid = preferenceid;
        }


        public Userpreference() {  }

        public Userpreference(int userid, int preferenceid) {
            this.userid = userid;
            this.preferenceid = preferenceid;
        }

    public Userpreference(int id, int userid, int preferenceid) {
        this.id = id;
        this.userid = userid;
        this.preferenceid = preferenceid;
    }


        @Override
        public String toString() {
            return "Userpreference{" +
                    "id=" + id + '\'' +
                    ", userid=" + userid + '\'' +
                    ", preferenceid=" + preferenceid + '\'' +
                    '}';
        }
}
