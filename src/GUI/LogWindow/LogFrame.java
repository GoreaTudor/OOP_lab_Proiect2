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

    SignUpButtonLink signUpButton;
    SignInButtonLink signInButton;

    public LogFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setTitle("Accounts");

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);

        fileMenu.add(exitItem);
        menuBar.add(fileMenu);


        signUpButton = new SignUpButtonLink();
        signInButton = new SignInButtonLink();

        this.setJMenuBar(menuBar);
        this.add(signUpButton);
        this.add(signInButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
