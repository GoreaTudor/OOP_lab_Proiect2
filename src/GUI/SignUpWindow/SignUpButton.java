package GUI.SignUpWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpButton extends JButton implements ActionListener {

    SignUpButton () {
        this.setText("Sign up");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        System.out.println(SignUpFrame.signUpFrame.usernameField.getText());
//        System.out.println(SignUpFrame.signUpFrame.passwordField.getText());
//        System.out.println(SignUpFrame.signUpFrame.secretField.getText());

        if (SignUpFrame.signUpFrame.usernameField.getText().equals("")) { // no username introduced
            JOptionPane.showMessageDialog(null,
                    "No username introduced",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);

        } else if (SignUpFrame.signUpFrame.passwordField.getText().equals("")) { // no password introduced
            JOptionPane.showMessageDialog(null,
                    "No password introduced",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);

        } else if (SignUpFrame.signUpFrame.secretField.getText().equals("")) { // no secret introduced
            JOptionPane.showMessageDialog(null,
                    "No secret introduced",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);

        } else { // username, password, secret introduced
            ;

            SignUpFrame.signUpFrame.dispose();
        }

    }
}
