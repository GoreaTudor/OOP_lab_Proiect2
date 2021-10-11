package MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpButton extends JButton implements ActionListener {

    SignUpButton () {
        this.setText("Sign Up");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ;
    }
}
