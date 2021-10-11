package GUI.SignInWindow;

import javax.swing.*;
import java.awt.*;

public class SignInFrame extends JFrame {

    public static SignInFrame signInFrame;

    JLabel frameLabel;

    JLabel usernameLabel;
    JTextField usernameField;

    JLabel passwordLabel;
    JPasswordField passwordField;

    SignInButton signInButton;

    public SignInFrame () {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setSize(400, 500);
        this.setLayout(new GridLayout(10, 1, 0, 20));
        this.setTitle("Sign in");


        frameLabel = new JLabel("Introduce the username and password");
        frameLabel.setFont(new Font("Consolas", Font.BOLD, 15));

        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField();

        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();

        signInButton = new SignInButton();


        this.add(frameLabel);
        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(signInButton);


        this.pack();
        this.setVisible(true);
    }
}
