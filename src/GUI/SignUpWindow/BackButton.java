package GUI.SignUpWindow;

import GUI.LogWindow.LogFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BackButton extends JButton implements ActionListener {

    BackButton () {
        this.setText("Back");
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SignUpFrame.signUpFrame.dispose();
        LogFrame.logFrame = new LogFrame();
    }
}
