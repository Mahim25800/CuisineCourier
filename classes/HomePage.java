package classes;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class HomePage extends JFrame{

 
    JLabel HomeLabel,l1,l2,l3,l4,l5,l6,l7;
    JPanel HomePanel,HomePanel1;
    ImageIcon icon;
    File cartFile = new File("Data\\cart.txt");


    public HomePage(){
        
        
        setSize(1600,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        icon = new ImageIcon("images/logo.png");
        setIconImage(icon.getImage());




        HomePanel =new JPanel();
        HomePanel.setBackground(new Color(0,0,0,10));
        HomePanel.setBounds(0,0,1600,100);
        HomePanel.setLayout(null);

        ImageIcon icon = new ImageIcon("images/button_home.png");
        Image image = icon.getImage();
        l1 =new JLabel(new ImageIcon(image));
        l1.setBounds(15,35,85,35);
        HomePanel.add(l1);

        ImageIcon icon1 = new ImageIcon("images/button_restaurants.png");
        Image image1 = icon1.getImage();
        l2 =new JLabel(new ImageIcon(image1));
        l2.setBounds(120,35,210,35);
        HomePanel.add(l2);

        ImageIcon icon2 = new ImageIcon("images/button_about.png");
        Image image2 = icon2.getImage();
        l3 =new JLabel(new ImageIcon(image2));
        l3.setBounds(350,35,105,35);
        HomePanel.add(l3);

        ImageIcon icon3 = new ImageIcon("images/button_contact.png");
        Image image3 = icon3.getImage();
        l4 =new JLabel(new ImageIcon(image3));
        l4.setBounds(450,35,175,35);
        HomePanel.add(l4);

        ImageIcon icon4 = new ImageIcon("images/button_login.png");
        Image image4 = icon4.getImage();
        l5 =new JLabel(new ImageIcon(image4));
        l5.setBounds(1250,35,100,35);
        HomePanel.add(l5);

        ImageIcon icon5 = new ImageIcon("images/button_sign-up.png");
        Image image5 = icon5.getImage();
        l6 =new JLabel(new ImageIcon(image5));
        l6.setBounds(1370,35,150,35);
        HomePanel.add(l6);

        
        ImageIcon icon6 = new ImageIcon("images/button_view-restaurents.png");
        Image image6 = icon6.getImage();
        l7 =new JLabel(new ImageIcon(image6));
        l7.setBounds(620,450,380,70);
        l7.setOpaque(false);
        l7.setBackground(new Color(0, 0, 0, 0)); 
        

        ImageIcon Homebg= new ImageIcon("images/Background.png");
        Image img =Homebg.getImage();
        Image temp_img= img.getScaledInstance(1600,900,Image.SCALE_SMOOTH);
        Homebg= new ImageIcon(temp_img);
        HomeLabel =new JLabel("",Homebg,JLabel.CENTER);
        HomeLabel.setBounds(0,0,1600,900);
        HomeLabel.add(HomePanel);
        //HomeLabel.add(HomePanel1);


        HomeLabel.add(l7);
        add(HomeLabel);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);


        l1.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_home1.png");
                Image newImage = newIcon.getImage();
                l1.setIcon(new ImageIcon(newImage)); 
            }

            
            public void mouseExited(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_home.png");
                Image newImage = newIcon.getImage();
                l1.setIcon(new ImageIcon(newImage));
            }

           /*public void mouseClicked(MouseEvent e) {
       
                
            }*/
        });

        l2.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_restaurants1.png");
                Image newImage = newIcon.getImage();
                l2.setIcon(new ImageIcon(newImage)); 
            }

            
            public void mouseExited(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_restaurants.png");
                Image newImage = newIcon.getImage();
                l2.setIcon(new ImageIcon(newImage));
            }

            public void mouseClicked(MouseEvent e) {
       
                viewPage view = new viewPage();
                view.setVisible(true);
                dispose();
            }
        });

        l3.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_about1.png");
                Image newImage = newIcon.getImage();
                l3.setIcon(new ImageIcon(newImage)); 
            }

            
            public void mouseExited(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_about.png");
                Image newImage = newIcon.getImage();
                l3.setIcon(new ImageIcon(newImage));
            }

            public void mouseClicked(MouseEvent e) {
       
                new About();
                setVisible(false);
                dispose();
            }
        });

        l4.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_contact1.png");
                Image newImage = newIcon.getImage();
                l4.setIcon(new ImageIcon(newImage)); 
            }

            
            public void mouseExited(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_contact.png");
                Image newImage = newIcon.getImage();
                l4.setIcon(new ImageIcon(newImage));
            }

            public void mouseClicked(MouseEvent e) {
       
                new contact();
                setVisible(false);
                dispose();
            }
        });

        l5.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_login1.png");
                Image newImage = newIcon.getImage();
                l5.setIcon(new ImageIcon(newImage)); 
            }

            
            public void mouseExited(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_login.png");
                Image newImage = newIcon.getImage();
                l5.setIcon(new ImageIcon(newImage));
            }

            public void mouseClicked(MouseEvent e) {

                        LoginPage loginPage = new LoginPage();
                        loginPage.setVisible(true);
                        dispose();
                   
            }
        });

        l6.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_sign-up1.png");
                Image newImage = newIcon.getImage();
                l6.setIcon(new ImageIcon(newImage)); 
            }

            
            public void mouseExited(MouseEvent e) {
                ImageIcon newIcon = new ImageIcon("images/button_sign-up.png");
                Image newImage = newIcon.getImage();
                l6.setIcon(new ImageIcon(newImage));
            }

            public void mouseClicked(MouseEvent e) {
       
                new SignPage();
                setVisible(false);
                dispose();
            }
        });

        l7.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                //l7.setForeground(Color.yellow);
                l7.setBackground(new Color(0, 0, 0, 0));
                ImageIcon newIcon = new ImageIcon("images/button_view-restaurents3.png");
                Image newImage = newIcon.getImage();
                l7.setIcon(new ImageIcon(newImage));
            }

            
            public void mouseExited(MouseEvent e) {
                l7.setBackground(new Color(0, 0, 0, 0));
                ImageIcon newIcon = new ImageIcon("images/button_view-restaurents.png");
                Image newImage = newIcon.getImage();
                l7.setIcon(new ImageIcon(newImage));
            }

            public void mouseClicked(MouseEvent e) {
       
                new viewPage();
                setVisible(true);
                dispose();
            }
        });

         addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                clearCartFile();
                super.windowClosing(e);
            }
        });

        

    } 

     private void clearCartFile() {
        try {
            FileWriter writer = new FileWriter(cartFile);
            writer.write("");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}