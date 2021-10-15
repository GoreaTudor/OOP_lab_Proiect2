package GUI.UserWindow;

import javax.swing.*;

public class UserFrame extends JFrame {

    public static UserFrame userFrame;

    public UserFrame () {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(300, 300);
        this.setLayout(null);
        this.setTitle("User");

        ;

        this.setVisible(true);
    }
}
