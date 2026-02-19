package classes;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage1 extends JFrame{
    JFrame hm1;
    JPanel hp;
    JLabel hl,hl1,hl2,hl3,hl4,hl5,hl6,hl7,hl8,hl9,hl10,hl11,hl12;
    ImageIcon icon;

    public HomePage1(){
        setSize(1600,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Image logo = new ImageIcon(getClass().getResource("/images/logo.png")).getImage();
        Image resizeLogo = logo.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
        icon = new ImageIcon(resizeLogo);
        this.setIconImage(icon.getImage());
        
        hp =new JPanel();
        hp.setBounds(0,0,1600,900);
        hp.setBackground(new Color(0x4c8866));
        hp.setLayout(null);

        ImageIcon icon = new ImageIcon("D:/java/Project/images/Logo KFC (Custom).png");
        Image image = icon.getImage();
        hl =new JLabel(new ImageIcon(image));
        hl.setBounds(15,35,260,260);
        hp.add(hl);

        ImageIcon icon6 = new ImageIcon("D:/java/Project/images/kfc label.png");
        Image image6 = icon6.getImage();
        hl1=new JLabel(new ImageIcon(image6));
        hl1.setBounds(1020,35,550,700);
        //hl1.setOpaque(true);
       // hl1.setBackground(new Color(0xa3080c));
        hl1.setVisible(false);
        hp.add(hl1);

        ImageIcon icon1 = new ImageIcon("D:/java/Project/images/Logo Burger King-modified (Custom).png");
        Image image1 = icon1.getImage();
        hl2 =new JLabel(new ImageIcon(image1));
        hl2.setBounds(350,35,260,260);
        hp.add(hl2);

        ImageIcon icon7 = new ImageIcon("D:/java/Project/images/burgerking label.png");
        Image image7 = icon7.getImage();
        hl3=new JLabel(new ImageIcon(image7));
        hl3.setBounds(1020,35,550,700);
        //hl3.setOpaque(true);
        //hl3.setBackground(new Color(0xf6822e));
        hl3.setVisible(false);
        hp.add(hl3);

        ImageIcon icon2 = new ImageIcon("D:/java/Project/images/logo chillox-modified (Custom).png");
        Image image2 = icon2.getImage();
        hl4 =new JLabel(new ImageIcon(image2));
        hl4.setBounds(700,35,260,260);
        hp.add(hl4);

        ImageIcon icon8 = new ImageIcon("D:/java/Project/images/chillox label.png");
        Image image8 = icon8.getImage();
        hl5=new JLabel(new ImageIcon(image8));
        hl5.setBounds(1020,35,550,700);
        //hl5.setOpaque(true);
       // hl5.setBackground(new Color(0xea2723));
        hl5.setVisible(false);
        hp.add(hl5);

        ImageIcon icon3 = new ImageIcon("D:/java/Project/images/logo pizza burg (Custom).png");
        Image image3 = icon3.getImage();
        hl6 =new JLabel(new ImageIcon(image3));
        hl6.setBounds(700,450,260,260);
        hp.add(hl6);

        ImageIcon icon11 = new ImageIcon("D:/java/Project/images/pizzaburg label.png");
        Image image11 = icon11.getImage();
        hl7=new JLabel(new ImageIcon(image11));
        hl7.setBounds(1020,35,550,700);
        //hl7.setOpaque(true);
        //hl7.setBackground(new Color(0xffcc5b));
        hl7.setVisible(false);
        hp.add(hl7);

        ImageIcon icon4 = new ImageIcon("D:/java/Project/images/logo sultans dine (Custom).png");
        Image image4 = icon4.getImage();
        hl8 =new JLabel(new ImageIcon(image4));
        hl8.setBounds(15,450,260,260);
        hp.add(hl8);

        ImageIcon icon9 = new ImageIcon("D:/java/Project/images/sultandine label.png");
        Image image9 = icon9.getImage();
        hl9=new JLabel(new ImageIcon(image9));
        hl9.setBounds(1020,35,550,700);
        //hl9.setOpaque(true);
        hl9.setBackground(Color.black);
        hl9.setVisible(false);
        hp.add(hl9);

        ImageIcon icon5 = new ImageIcon("D:/java/Project/images/Logo_waffle_up-modified__Custom___Custom_-removebg-preview.png");
        Image image5 = icon5.getImage();
        hl10 =new JLabel(new ImageIcon(image5));
        hl10.setBounds(350,450,260,260);
        hp.add(hl10);

        ImageIcon icon10 = new ImageIcon("D:/java/Project/images/waffleup label.png");
        Image image10 = icon10.getImage();
        hl11=new JLabel(new ImageIcon(image10));
        hl11.setBounds(1020,35,550,700);
        //hl11.setOpaque(true);
        //hl11.setBackground(Color.white);
        hl11.setVisible(false);
        hp.add(hl11);
    

        hl.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                hl.setBounds(15,35,250,250); 
                hl1.setVisible(true);
            }

            
            public void mouseExited(MouseEvent e) {
                hl.setBounds(15,35,260,260);
                hl1.setVisible(false);
            }

           public void mouseClicked(MouseEvent e) {
                setVisible(false);
                dispose();
                new KFCMenu();
                
            }
        });

        hl2.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                hl2.setBounds(350,35,250,250); 
                hl3.setVisible(true);
            }

            
            public void mouseExited(MouseEvent e) {
                hl2.setBounds(350,35,260,260);
                hl3.setVisible(false);
            }

           public void mouseClicked(MouseEvent e) {
                 
                 setVisible(false);
                 dispose();
                 new BurgerKingMenu();
                  
                
            }
        });

        hl4.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                hl4.setBounds(700,35,250,250); 
                hl5.setVisible(true);
            }

            
            public void mouseExited(MouseEvent e) {
                hl4.setBounds(700,35,260,260);
                hl5.setVisible(false);
            }

           public void mouseClicked(MouseEvent e) {
                
                setVisible(false);
                dispose();
                new ChilloxMenu();
            
            }
        });

        hl6.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                hl6.setBounds(700,450,250,250); 
                hl7.setVisible(true);
            }

            
            public void mouseExited(MouseEvent e) {
                hl6.setBounds(700,450,260,260);
                hl7.setVisible(false);
            }

           public void mouseClicked(MouseEvent e) {
                
                setVisible(false);
                dispose();
                new PizzaBurgMenu();
                
            }
        });

         hl8.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                hl8.setBounds(15,450,250,250);
                hl9.setVisible(true); 
            }

            
            public void mouseExited(MouseEvent e) {
                hl8.setBounds(15,450,260,260);
                hl9.setVisible(false);
            }

           public void mouseClicked(MouseEvent e) {
       
                setVisible(false);
                dispose();
                new SultansDineMenu();
            }
        });

        hl10.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                hl10.setBounds(350,450,250,250); 
                hl11.setVisible(true);
            }

            
            public void mouseExited(MouseEvent e) {
                hl10.setBounds(350,450,260,260);
                hl11.setVisible(false);
            }

           public void mouseClicked(MouseEvent e) {
                setVisible(false);
                dispose();
                new WaffleUpMenu();
            }
        });


        add(hp);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}