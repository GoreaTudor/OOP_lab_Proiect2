package Data;

import java.util.ArrayList;

public class Account <T> {
    static ArrayList <Account> accounts = new ArrayList<>();

    private String username;
    private String password;
    private T otherData;

    public Account (String username, String password, T otherData) {
        this.username = username;
        this.password = password;
        this.otherData = otherData;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public T getOtherData() {
        return otherData;
    }
    public void setOtherData(T otherData) {
        this.otherData = otherData;
    }
}
