package Data;

import java.util.ArrayList;

public class Account {

    public static ArrayList <Account> accounts = new ArrayList<>();

    private String secret;
    private String username;
    private String password;

    public Account (String username, String password, String secret) {
        this.username = username;
        this.password = password;
        this.secret = secret;
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
}
