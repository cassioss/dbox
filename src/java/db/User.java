package db;

/**
 * Created by Bruno on 3/31/2015.
 */
public class User {
    private String email;
    private String name;
    private String password;
    private int idFolder;

    public User(String email, String name, String password, int idFolder) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.idFolder = idFolder;
    }

    public int getIdFolder() {
        return idFolder;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setIdFolder(int idFolder) {
        this.idFolder = idFolder;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
