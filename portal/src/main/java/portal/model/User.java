package portal.model;

public class User {
    private int id;
    private String userid;
    private String userpw;

    public User() {}

    public User(int id, String userid, String userpw) {
        this.id = id;
        this.userid = userid;
        this.userpw = userpw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userid;
    }

    public void setUsername(String userid) {
        this.userid = userid;
    }

    public String getUserPw() {
        return userpw;
    }

    public void setEmail(String userpw) {
        this.userpw = userpw;
    }
}
