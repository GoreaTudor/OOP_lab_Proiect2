package GUI.AdminWindow;

import Data.Account;
import GUI.LogWindow.LogFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteButtons implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        int option, i;
        Account adminAccount = AdminFrame.adminFrame.getAdminAccount();

        option = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete this account?",
                "Account deletion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (option == 0) { // YES
            for (i = 0; i < Account.accounts.size(); i++) {

                if (e.getSource() == AdminFrame.adminFrame.deleteButtons[i]) {
                    AdminFrame.adminFrame.dispose();

                    if (adminAccount.equals(Account.accounts.get(i))) {
                        Account.accounts.remove(i);
                        LogFrame.logFrame = new LogFrame();

                    } else {
                        Account.accounts.remove(i);
                        AdminFrame.adminFrame = new AdminFrame(adminAccount);
                    }

                }
            }
        }
    }
}
