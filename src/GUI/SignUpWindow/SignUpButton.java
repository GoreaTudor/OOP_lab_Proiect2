package GUI.SignUpWindow;

import Data.Account;
import GUI.LogWindow.LogFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SignUpButton extends JButton implements ActionListener {

    SignUpButton () {
        this.setText("Sign up");
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        System.out.println(SignUpFrame.signUpFrame.usernameField.getText());
//        System.out.println(SignUpFrame.signUpFrame.passwordField.getText());
//        System.out.println(SignUpFrame.signUpFrame.secretField.getText());

        String username = SignUpFrame.signUpFrame.usernameField.getText();
        String password = String.valueOf(SignUpFrame.signUpFrame.passwordField.getPassword());
        String secret = SignUpFrame.signUpFrame.secretField.getText();
        int accountType = SignUpFrame.signUpFrame.typeSelect.getSelectedIndex();


        if (username.equals("")) {                                          // no username introduced
            JOptionPane.showMessageDialog(null,
                    "No username introduced!",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);

        } else if (username.length() < 5 || username.length() > 20) {       // username not valid
            JOptionPane.showMessageDialog(null,
                    "The username must be between 5 and 20 characters!",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);

        } else if (Account.usernameExists(username) != null) {              // the username already exists
            JOptionPane.showMessageDialog(null,
                    "The selected username already exists!",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);



        } else if (String.valueOf(password).equals("")) {                   // no password introduced
            JOptionPane.showMessageDialog(null,
                    "No password introduced!",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);

        } else if (password.length() < 5 || password.length() > 32) {       // invalid password
            JOptionPane.showMessageDialog(null,
                    "The password must be  between 5 and 32 characters!",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);



        } else if (secret.equals("") && accountType == 0) {                 // no secret introduced for User
            JOptionPane.showMessageDialog(null,
                    "No secret introduced, nothing to save!",
                    "Account creation failure",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            Account.accounts.add(new Account(username, password, secret, accountType));
            SignUpFrame.signUpFrame.dispose();

            JOptionPane.showMessageDialog(null,
                    "Account was successfully created!",
                    "Account creation successful",
                    JOptionPane.INFORMATION_MESSAGE);

            LogFrame.logFrame = new LogFrame();
        }


    }
}
