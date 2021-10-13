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

    JLabel typeLabel;
    JComboBox <String> typeSelect;

    JLabel secretLabel;
    JTextField secretField;

    SignUpButton signUpButton;
    BackButton backButton;

    public SignUpFrame () {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setSize(300, 300);
        this.setLayout(new GridLayout(12, 2, 10, 20));
        this.setTitle("Sign up");


        frameLabel = new JLabel("Introduce name, username and password");
        frameLabel.setFont(new Font("Consolas", Font.BOLD, 15));

        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField();

        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();

        typeLabel = new JLabel("Select account type: ");
        typeSelect = new JComboBox<>();
        typeSelect.addItem("User");
        typeSelect.addItem("Admin");
        typeSelect.setSelectedIndex(0);

        secretLabel = new JLabel("Secret: ");
        secretField = new JTextField();

        signUpButton = new SignUpButton();
        backButton = new BackButton();


        this.add(frameLabel);
        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(typeLabel);
        this.add(typeSelect);
        this.add(secretLabel);
        this.add(secretField);
        this.add(signUpButton);
        this.add(backButton);


        this.pack();
        this.setVisible(true);
    }
}
