package GUI.SignUpWindow;

import javax.swing.*;
import java.awt.*;

public class SignUpFrame extends JFrame {

    public static SignUpFrame signUpFrame;

    JLabel frameLabel;

    JLabel usernameLabel;
    JTextField usernameField;

    JLabel passwordLabel;
    JPasswordField passwordField;

    JLabel secretLabel;
    JTextField secretField;

    SignUpButton signUpButton;

    public SignUpFrame () {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setSize(300, 300);
        this.setLayout(new GridLayout(10, 1, 0, 20));
        this.setTitle("Sign up");


        frameLabel = new JLabel("Introduce name, username and password");
        frameLabel.setFont(new Font("Consolas", Font.BOLD, 15));

        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField();

        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();

        secretLabel = new JLabel("Secret: ");
        secretField = new JTextField();

        signUpButton = new SignUpButton();


        this.add(frameLabel);
        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(secretLabel);
        this.add(secretField);
        this.add(signUpButton);


        this.pack();
        this.setVisible(true);
    }
}
