package GUI.MainWindow;

import MainPackage.Main;
import GUI.SignInWindow.SignInFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInButtonLink extends JButton implements ActionListener {

    SignInButtonLink() {
        this.setText("Sign In");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SignInFrame.signInFrame = new SignInFrame();
        MainFrame.mainFrame.dispose();
    }
}
