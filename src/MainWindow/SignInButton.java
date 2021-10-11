package MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInButton extends JButton implements ActionListener {

    SignInButton () {
        this.setText("Sign In");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ;
    }
}
