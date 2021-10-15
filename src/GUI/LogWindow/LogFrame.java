package GUI.LogWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogFrame extends JFrame implements ActionListener {
    public static LogFrame logFrame;

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem exitItem;

    JPanel northPanel;
    JPanel centerPanel;

    JLabel welcomeLabel;
    JLabel logLabel;

    SignUpButtonLink signUpButton;
    SignInButtonLink signInButton;

    public LogFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new BorderLayout(0, 20));
        this.setTitle("Secrets Keeper");


        ///// MENU BAR /////
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);

        fileMenu.add(exitItem);
        menuBar.add(fileMenu);


        ///// NORTH PANEL /////
        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 1, 0, 10));

        welcomeLabel = new JLabel("Welcome to Secrets Keeper!");
        welcomeLabel.setVerticalAlignment(JLabel.CENTER);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        logLabel = new JLabel("Create a new account or use an existing one");
        logLabel.setVerticalAlignment(JLabel.CENTER);
        logLabel.setHorizontalAlignment(JLabel.CENTER);
        logLabel.setFont(new Font("Arial", Font.ITALIC, 15));

        northPanel.add(welcomeLabel);
        northPanel.add(logLabel);


        ///// CENTER PANEL /////
        centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER,15, 15));

        signUpButton = new SignUpButtonLink();
        signInButton = new SignInButtonLink();

        centerPanel.add(signUpButton);
        centerPanel.add(signInButton);


        this.setJMenuBar(menuBar);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
