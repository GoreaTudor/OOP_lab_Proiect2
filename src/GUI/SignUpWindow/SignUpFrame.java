package GUI.SignUpWindow;

import GUI.LogWindow.LogFrame;
import GUI.SignInWindow.SignInFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpFrame extends JFrame implements ActionListener {

    public static SignUpFrame signUpFrame;

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem backItem;
    JMenuItem exitItem;

    JLabel frameLabel;

    JLabel usernameLabel;
    JTextField usernameField;

    JLabel passwordLabel;
    JPasswordField passwordField;

    JLabel typeLabel;
    JComboBox <String> typeSelect;

    JLabel secretLabel;
    JTextField secretField;

    SignUpButton signUpButton;

    public SignUpFrame () {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setSize(300, 300);
        this.setLayout(new GridLayout(12, 2, 10, 20));
        this.setTitle("Sign up");


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
        frameLabel = new JLabel("Introduce name, username and password");
        frameLabel.setFont(new Font("Consolas", Font.BOLD, 15));

        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField();

        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();

        typeLabel = new JLabel("Select account type: ");
        typeSelect = new JComboBox<>();
        typeSelect.addItem("User");
        typeSelect.addItem("Admin");
        typeSelect.setSelectedIndex(0);

        secretLabel = new JLabel("Secret: ");
        secretField = new JTextField();

        signUpButton = new SignUpButton();


        this.setJMenuBar(menuBar);
        this.add(frameLabel);
        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(typeLabel);
        this.add(typeSelect);
        this.add(secretLabel);
        this.add(secretField);
        this.add(signUpButton);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backItem) {
            SignUpFrame.signUpFrame.dispose();
            LogFrame.logFrame = new LogFrame();

        } else if (e.getSource() == exitItem){
            System.exit(0);
        }
    }
}
