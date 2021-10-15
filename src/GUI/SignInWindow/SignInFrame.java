package GUI.SignInWindow;

import GUI.LogWindow.LogFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInFrame extends JFrame implements ActionListener {

    public static SignInFrame signInFrame;

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem backItem;
    JMenuItem exitItem;

    JLabel frameLabel;

    JLabel usernameLabel;
    JTextField usernameField;

    JLabel passwordLabel;
    JPasswordField passwordField;

    SignInButton signInButton;

    public SignInFrame () {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setSize(400, 500);
        this.setLayout(new GridLayout(7, 1, 0, 20));
        this.setTitle("Sign in");


        ///// MENU BAR /////
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");

        backItem = new JMenuItem("Back");
        backItem.addActionListener(this);
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);

        fileMenu.add(backItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);


        ///// FRAME /////
        frameLabel = new JLabel("Introduce the username and password");
        frameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frameLabel.setPreferredSize(new Dimension(400, 30));
        frameLabel.setVerticalAlignment(JLabel.CENTER);
        frameLabel.setHorizontalAlignment(JLabel.CENTER);

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setVerticalAlignment(JLabel.BOTTOM);
        usernameField = new JTextField();

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setVerticalAlignment(JLabel.BOTTOM);
        passwordField = new JPasswordField();

        signInButton = new SignInButton();


        this.setJMenuBar(menuBar);
        this.add(frameLabel);
        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(signInButton);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backItem) {
            SignInFrame.signInFrame.dispose();
            LogFrame.logFrame = new LogFrame();

        } else if (e.getSource() == exitItem){
            System.exit(0);
        }
    }
}
