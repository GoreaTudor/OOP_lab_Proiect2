package Data;

public interface IAccount {
    int USER = 0;
    int ADMIN = 1;

    String getSecret();
    void setSecret(String secret);

    String getUsername();
    void setUsername(String username);

    String getPassword();
    void setPassword(String password);

    int getAccountType();
}
