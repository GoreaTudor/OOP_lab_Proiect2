package GUI.MainWindow;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static MainFrame mainFrame;

    SignUpButtonLink signUpButton;
    SignInButtonLink signInButton;

    public MainFrame () {
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
