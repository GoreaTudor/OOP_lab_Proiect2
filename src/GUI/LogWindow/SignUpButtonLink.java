package GUI.LogWindow;

import GUI.SignUpWindow.SignUpFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpButtonLink extends JButton implements ActionListener {

    SignUpButtonLink() {
        this.setText("Sign Up");
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SignUpFrame.signUpFrame = new SignUpFrame();
        LogFrame.logFrame.dispose();
    }
}
