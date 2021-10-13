package GUI.LogWindow;

import javax.swing.*;
import java.awt.*;

public class LogFrame extends JFrame {
    public static LogFrame logFrame;

    SignUpButtonLink signUpButton;
    SignInButtonLink signInButton;

    public LogFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setTitle("Accounts");

        signUpButton = new SignUpButtonLink();
        signInButton = new SignInButtonLink();

        this.add(signUpButton);
        this.add(signInButton);

        this.setVisible(true);
    }
}
