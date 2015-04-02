package db;

/**
 * Created by Bruno on 3/31/2015.
 */
public class File {
    private int id;
    private String URL;

    public File(int id, String URL) {
        this.id = id;
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public String getURL() {
        return URL;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
