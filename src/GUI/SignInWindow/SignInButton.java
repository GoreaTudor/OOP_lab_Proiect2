package GUI.SignInWindow;

import Data.Account;
import GUI.MainWindow.MainFrame;

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
            JOptionPane.showMessageDialog(null,
                    account.getSecret(),
                    "Your secret is:",
                    JOptionPane.WARNING_MESSAGE);

            SignInFrame.signInFrame.dispose();
            MainFrame.mainFrame = new MainFrame();
        }
    }
}
