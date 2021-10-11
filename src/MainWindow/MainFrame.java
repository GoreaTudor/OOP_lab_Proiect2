package MainWindow;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    SignUpButton signUpButton;
    SignInButton signInButton;

    public MainFrame () {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setTitle("Accounts");

        signUpButton = new SignUpButton();
        signInButton = new SignInButton();

        this.add(signUpButton);
        this.add(signInButton);

        this.setVisible(true);
    }
}
