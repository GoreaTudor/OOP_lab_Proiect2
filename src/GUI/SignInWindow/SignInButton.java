package GUI.SignInWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SignInButton extends JButton implements ActionListener {

    SignInButton () {
        this.setText("Sign in");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ;
        SignInFrame.signInFrame.dispose();
    }
}
