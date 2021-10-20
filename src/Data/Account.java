package Data;

import java.util.ArrayList;

public class Account implements IAccount{

    public static ArrayList <Account> accounts = new ArrayList<>();

    private String secret;
    private String username;
    private String password;
    private int accountType;

    public Account (String username, String password, String secret, int type) {
        this.username = username;
        this.password = password;
        this.secret = secret;
        this.accountType = type;
    }

    public static Account usernameExists(String username){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).username.equals(username))
                return accounts.get(i);
        }

        return null;
    }

    @Override
    public String getSecret() {
        return secret;
    }
    @Override
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getAccountType() {
        return accountType;
    }
}
