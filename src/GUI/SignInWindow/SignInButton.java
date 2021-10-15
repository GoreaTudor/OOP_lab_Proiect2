package GUI.SignInWindow;

import Data.Account;
import GUI.AdminWindow.AdminFrame;
import GUI.LogWindow.LogFrame;
import GUI.UserWindow.UserFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SignInButton extends JButton implements ActionListener {

    SignInButton () {
        this.setText("Sign in");
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = SignInFrame.signInFrame.usernameField.getText();
        String password = String.valueOf(SignInFrame.signInFrame.passwordField.getPassword());
        Account account = Account.usernameExists(username);

        if (account == null) {                                      // the account does not exist
            JOptionPane.showMessageDialog(null,
                    "The username does not exist!",
                    "Sign in failure",
                    JOptionPane.ERROR_MESSAGE);


        } else if (password.equals(account.getPassword()) == false) {        // incorrect password
            JOptionPane.showMessageDialog(null,
                    "Incorrect password!",
                    "Sign in failure",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            SignInFrame.signInFrame.dispose();

            if (account.getAccountType() == 1) { // Admin window
                AdminFrame.adminFrame = new AdminFrame(account);

            } else { // User Window
                UserFrame.userFrame = new UserFrame(account);

            }
        }
    }
}
