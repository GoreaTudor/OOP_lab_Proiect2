package Data;

public class Account {
    private String secret;
    private String username;
    private String password;

    public Account (String username, String password, String secret) {
        this.username = username;
        this.password = password;
        this.secret = secret;
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
