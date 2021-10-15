package GUI.UserWindow;

import Data.Account;
import GUI.LogWindow.LogFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserFrame extends JFrame implements ActionListener {

    public static UserFrame userFrame;

    Account account;

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem exitItem;
    JMenu accountMenu;
    JMenuItem signOutItem;
    JMenuItem deleteAccountItem;

    JLabel secretLabel;


    public UserFrame (Account account) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());
        this.setTitle("User");
        this.account = account;


        ///// MENU BAR /////
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        accountMenu = new JMenu("Account");

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);
        signOutItem = new JMenuItem("Sign out");
        signOutItem.addActionListener(this);
        deleteAccountItem = new JMenuItem("Delete Account");
        deleteAccountItem.addActionListener(this);

        fileMenu.add(exitItem);
        accountMenu.add(signOutItem);
        accountMenu.add(deleteAccountItem);
        menuBar.add(fileMenu);
        menuBar.add(accountMenu);


        ///// FRAME /////
        secretLabel = new JLabel(this.account.getSecret());
        secretLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));


        this.setJMenuBar(menuBar);
        this.add(secretLabel);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitItem){
            System.exit(0);


        } else if (e.getSource() == signOutItem) {
            int option = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to Sign out?",
                    "Sign Out",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (option == 0) { // YES
                UserFrame.userFrame.dispose();
                LogFrame.logFrame = new LogFrame();
            }


        } else if (e.getSource() == deleteAccountItem) {
            int option = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to Delete your account?",
                    "Delete Account",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (option == 0) { // YES
                UserFrame.userFrame.dispose();
                Account.accounts.remove(this.account);
                LogFrame.logFrame = new LogFrame();
            }

        }
    }
}
