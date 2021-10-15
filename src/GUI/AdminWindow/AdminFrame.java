package GUI.AdminWindow;

import Data.Account;
import GUI.LogWindow.LogFrame;
import GUI.UserWindow.UserFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminFrame extends JFrame implements ActionListener {

    public static AdminFrame adminFrame;

    Account adminAccount;

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem exitItem;
    JMenu accountMenu;
    JMenuItem signOutItem;
    JMenuItem deleteAccountItem;

    JLabel[] accounts;
    JButton[] deleteButtons;


    public AdminFrame (Account adminAccount) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setSize(300, 300);
        this.setLayout(new GridLayout(0, 2, 10, 10));
        this.setTitle(adminAccount.getUsername());
        this.adminAccount = adminAccount;


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
        accounts = new JLabel[Account.accounts.size()];
        deleteButtons = new JButton[Account.accounts.size()];
        int i;

        for (i = 0; i < Account.accounts.size(); i++){
            accounts[i] = new JLabel(Account.accounts.get(i).getUsername());
            accounts[i].setVerticalAlignment(JLabel.CENTER);
            accounts[i].setHorizontalAlignment(JLabel.CENTER);
            accounts[i].setFont(new Font("Consolas", Font.PLAIN, 20));
            accounts[i].setPreferredSize(new Dimension(100, 50));

            deleteButtons[i] = new JButton("Delete");
            deleteButtons[i].setPreferredSize(new Dimension(100, 50));
            deleteButtons[i].setFocusable(false);
            deleteButtons[i].addActionListener(new DeleteButtons());

            this.add(accounts[i]);
            this.add(deleteButtons[i]);
        }


        this.setJMenuBar(menuBar);
        this.pack();
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
                AdminFrame.adminFrame.dispose();
                LogFrame.logFrame = new LogFrame();
            }


        } else if (e.getSource() == deleteAccountItem) {
            int option = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to Delete your account?",
                    "Delete Account",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (option == 0) { // YES
                AdminFrame.adminFrame.dispose();
                Account.accounts.remove(this.adminAccount);
                LogFrame.logFrame = new LogFrame();
            }

        }
    }

    public Account getAdminAccount() {
        return adminAccount;
    }
}
