package Data;

import java.util.ArrayList;

public class Account {

    public static ArrayList <Account> accounts = new ArrayList<>();
    public static final int USER = 0;
    public static final int ADMIN = 1;

    private String secret;
    private String username;
    private String password;
    private int type;

    public Account (String username, String password, String secret, int type) {
        this.username = username;
        this.password = password;
        this.secret = secret;
        this.type = type;
    }

    public static Account usernameExists(String username){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).username.equals(username))
                return accounts.get(i);
        }

        return null;
    }

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
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

    public int getType() {
        return type;
    }
}
