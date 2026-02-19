package classes;

import javax.swing.*;
import java.awt.event.*;

import classes.HomePage;
import classes.viewPage;

import java.awt.*;

public class About extends JFrame {

    public About() {
        JFrame frame = new JFrame();
        frame.setSize(1600, 800);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logoIcon = new ImageIcon("images/logo.png");
        frame.setIconImage(logoIcon.getImage());

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(0x5aab28));

        ImageIcon image1 = new ImageIcon(new ImageIcon("images/About_BG.png")
        .getImage().getScaledInstance( 1300, 700, Image.SCALE_SMOOTH));
        JLabel imageLabel1 = new JLabel();
        imageLabel1.setIcon(image1);
        imageLabel1.setHorizontalAlignment(JLabel.CENTER);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(0x5aab28));

        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(0x99141e));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        topPanel.add(backButton, BorderLayout.WEST);
       

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(imageLabel1, BorderLayout.CENTER);

        frame.add(mainPanel);

        frame.setVisible(true);


         backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new HomePage();
                frame.setVisible(false);
                frame.dispose();
            }
        });
    
    }

}
