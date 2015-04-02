package db;

/**
 * Created by Bruno on 3/31/2015.
 */
public class Friendship {
    private String email1;
    private String email2;

    public Friendship(String email1, String email2) {
        this.email1 = email1;
        this.email2 = email2;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
}
