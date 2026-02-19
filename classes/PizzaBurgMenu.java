package classes;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

import classes.usarseeButton;
import java.io.*;

public class PizzaBurgMenu {


    JFrame frame;
    JButton backButton, signupButton, loginButton, logoutButton;
    File cartFile = new File("Data\\cart.txt");

        private boolean isButton1Clicked = false;
        private boolean isButton2Clicked = false;
        private boolean isButton3Clicked = false;
        private boolean isButton4Clicked = false;
        private boolean isButton5Clicked = false;
        private boolean isButton6Clicked = false;


    public PizzaBurgMenu() {
    
        frame = new JFrame("Pizza Burg Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        ImageIcon logoIcon = new ImageIcon("images/logo.png");
        frame.setIconImage(logoIcon.getImage());

        frame.setLayout(new BorderLayout());

        //Top panel

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(0xdba24a));
        frame.add(topPanel, BorderLayout.NORTH);

        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.setBackground(new Color(0xdba24a));

        //Back Button

        backButton = new JButton("Back");
        backButton.setBackground(new Color(0x99141e));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButtonPanel.add(backButton);
        topPanel.add(backButtonPanel, BorderLayout.WEST);

        //signupLoginLogoutPanel

        JPanel signupLoginLogoutPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signupLoginLogoutPanel.setBackground(new Color(0xdba24a));

         signupButton = new JButton("Signup");
         loginButton = new JButton("Login");
        //JButton logoutButton = new JButton("Log Out");  
        signupButton.setFocusPainted(false);
        loginButton.setFocusPainted(false);
        //logoutButton.setFocusPainted(false);

        signupButton.setBackground(new Color(0x99141e));
        signupButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0x336699));
        loginButton.setForeground(Color.WHITE);
        // logoutButton.setBackground(new Color(0x992e2e));
        // logoutButton.setForeground(Color.WHITE);

        logoutButton = new JButton("Logout");
        logoutButton.setBackground(new Color(0x992e2e));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setFocusPainted(false);
        signupLoginLogoutPanel.add(logoutButton);

        signupLoginLogoutPanel.add(signupButton);
        signupLoginLogoutPanel.add(loginButton);
        //signupLoginLogoutPanel.add(logoutButton);  

        topPanel.add(signupLoginLogoutPanel, BorderLayout.EAST);

        //Bottom Panel

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(0xdba24a));
        frame.add(bottomPanel, BorderLayout.SOUTH);

        //CheckOut Button
        
        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.setPreferredSize(new Dimension(150, 40));
        checkoutButton.setBackground(new Color(0x413016));
        checkoutButton.setForeground(Color.WHITE);
        checkoutButton.setFocusPainted(false);
        checkoutButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        checkoutButton.setVisible(false);

        bottomPanel.add(checkoutButton, BorderLayout.CENTER);

        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        frame.add(gridPanel, BorderLayout.CENTER);

        Color panelColor = new Color(0xdba24a);

        //panel 1

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setBackground(panelColor);

        ImageIcon image1 = new ImageIcon(new ImageIcon("images/BBQ Meat Machine Pizza (315).jpg").getImage().getScaledInstance(
        400, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel1 = new JLabel();
        imageLabel1.setIcon(image1);
        imageLabel1.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(imageLabel1);


        JTextField textBox1= new JTextField("BBQ Meat Machine Pizza,315");
        textBox1.setEditable(false);
        textBox1.setHorizontalAlignment(JTextField.CENTER);
        textBox1.setFont(new Font("Tahoma", Font.BOLD, 12));
        textBox1.setBackground(new Color(0x413016));
        textBox1.setForeground(Color.WHITE);
        textBox1.setBorder(null);
        panel1.add(textBox1, BorderLayout.NORTH);


        JButton addToCartButton1 = new JButton("Add to Cart");
        addToCartButton1.setPreferredSize(new Dimension(75, 30));
        addToCartButton1.setBackground(new Color(0x8e6930));
        addToCartButton1.setForeground(Color.WHITE);
        addToCartButton1.setFocusPainted(false);
        addToCartButton1.setFont(new Font("Tahoma", Font.BOLD, 12));

        
        JButton orderNowButton1 = new JButton("Order Now");
        orderNowButton1.setPreferredSize(new Dimension(75, 30));
        orderNowButton1.setBackground(new Color(0xe06506));
        orderNowButton1.setForeground(Color.WHITE);
        orderNowButton1.setFocusPainted(false);
        orderNowButton1.setFont(new Font("Tahoma", Font.BOLD, 12));


        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new GridLayout(1, 3, 0, 0));
        buttonPanel1.add(addToCartButton1);
        buttonPanel1.add(orderNowButton1);


        panel1.add(buttonPanel1, BorderLayout.SOUTH);
        gridPanel.add(panel1);

        //panel 2

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.setBackground(panelColor);

        ImageIcon image2 = new ImageIcon(new ImageIcon("images/Chedder Cream Pizza (275).jpg").getImage().getScaledInstance(
        400, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel2 = new JLabel();
        imageLabel2.setIcon(image2);
        imageLabel2.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(imageLabel2);


        JTextField textBox2= new JTextField("Chedder Cream Pizza,275");
        textBox2.setEditable(false);
        textBox2.setHorizontalAlignment(JTextField.CENTER);
        textBox2.setFont(new Font("Tahoma", Font.BOLD, 12));
        textBox2.setBackground(new Color(0x413016));
        textBox2.setForeground(Color.WHITE);
        textBox2.setBorder(null);
        panel2.add(textBox2, BorderLayout.NORTH);


        JButton addToCartButton2 = new JButton("Add to Cart");
        addToCartButton2.setPreferredSize(new Dimension(75, 30));
        addToCartButton2.setBackground(new Color(0x8e6930));
        addToCartButton2.setForeground(Color.WHITE);
        addToCartButton2.setFocusPainted(false);
        addToCartButton2.setFont(new Font("Tahoma", Font.BOLD, 12));

        
        JButton orderNowButton2 = new JButton("Order Now");
        orderNowButton2.setPreferredSize(new Dimension(75, 30));
        orderNowButton2.setBackground(new Color(0xe06506));
        orderNowButton2.setForeground(Color.WHITE);
        orderNowButton2.setFocusPainted(false);
        orderNowButton2.setFont(new Font("Tahoma", Font.BOLD, 12));


        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new GridLayout(1, 3, 0, 0));
        buttonPanel2.add(addToCartButton2);
        buttonPanel2.add(orderNowButton2);


        panel2.add(buttonPanel2, BorderLayout.SOUTH);
        gridPanel.add(panel2);

        //panel 3

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.setBackground(panelColor);


        ImageIcon image3 = new ImageIcon(new ImageIcon("images/Deep Sea Fantasy pizza (295).jpg").getImage().getScaledInstance(
        400, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel3 = new JLabel();
        imageLabel3.setIcon(image3);
        imageLabel3.setHorizontalAlignment(JLabel.CENTER);
        panel3.add(imageLabel3);


        JTextField textBox3= new JTextField("Deep Sea Fantasy pizza,295");
        textBox3.setEditable(false);
        textBox3.setHorizontalAlignment(JTextField.CENTER);
        textBox3.setFont(new Font("Tahoma", Font.BOLD, 12));
        textBox3.setBackground(new Color(0x413016));
        textBox3.setForeground(Color.WHITE);
        textBox3.setBorder(null);
        panel3.add(textBox3, BorderLayout.NORTH);


        JButton addToCartButton3 = new JButton("Add to Cart");
        addToCartButton3.setPreferredSize(new Dimension(75, 30));
        addToCartButton3.setBackground(new Color(0x8e6930));
        addToCartButton3.setForeground(Color.WHITE);
        addToCartButton3.setFocusPainted(false);
        addToCartButton3.setFont(new Font("Tahoma", Font.BOLD, 12));


        JButton orderNowButton3 = new JButton("Order Now");
        orderNowButton3.setPreferredSize(new Dimension(75, 30));
        orderNowButton3.setBackground(new Color(0xe06506));
        orderNowButton3.setForeground(Color.WHITE);
        orderNowButton3.setFocusPainted(false);
        orderNowButton3.setFont(new Font("Tahoma", Font.BOLD, 12));


        JPanel buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(new GridLayout(1, 3, 0, 0));
        buttonPanel3.add(addToCartButton3);
        buttonPanel3.add(orderNowButton3);

        panel3.add(buttonPanel3, BorderLayout.SOUTH);
        gridPanel.add(panel3);


        //panel 4

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout());
        panel4.setBackground(panelColor);


        ImageIcon image4 = new ImageIcon(new ImageIcon("images/Four Flavours Pizza (325).jpg").getImage().getScaledInstance(
        400, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel4 = new JLabel();
        imageLabel4.setIcon(image4);
        imageLabel4.setHorizontalAlignment(JLabel.CENTER);
        panel4.add(imageLabel4);


        JTextField textBox4= new JTextField("Four Flavours Pizza,325");
        textBox4.setEditable(false);
        textBox4.setHorizontalAlignment(JTextField.CENTER);
        textBox4.setFont(new Font("Tahoma", Font.BOLD, 12));
        textBox4.setBackground(new Color(0x413016));
        textBox4.setForeground(Color.WHITE);
        textBox4.setBorder(null);
        panel4.add(textBox4, BorderLayout.NORTH);


        JButton addToCartButton4 = new JButton("Add to Cart");
        addToCartButton4.setPreferredSize(new Dimension(75, 30));
        addToCartButton4.setBackground(new Color(0x8e6930));
        addToCartButton4.setForeground(Color.WHITE);
        addToCartButton4.setFocusPainted(false);
        addToCartButton4.setFont(new Font("Tahoma", Font.BOLD, 12));

        
        JButton orderNowButton4 = new JButton("Order Now");
        orderNowButton4.setPreferredSize(new Dimension(75, 30));
        orderNowButton4.setBackground(new Color(0xe06506));
        orderNowButton4.setForeground(Color.WHITE);
        orderNowButton4.setFocusPainted(false);
        orderNowButton4.setFont(new Font("Tahoma", Font.BOLD, 12));


        JPanel buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(new GridLayout(1, 3, 0, 0));
        buttonPanel4.add(addToCartButton4);
        buttonPanel4.add(orderNowButton4);


        panel4.add(buttonPanel4, BorderLayout.SOUTH);
        gridPanel.add(panel4);

        //panel 5
        
        JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout());
        panel5.setBackground(panelColor);

        
        ImageIcon image5 = new ImageIcon(new ImageIcon("images/Kebab Cocktail (325).jpeg").getImage().getScaledInstance(
        400, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel5 = new JLabel();
        imageLabel5.setIcon(image5);
        imageLabel5.setHorizontalAlignment(JLabel.CENTER);
        panel5.add(imageLabel5);


        JTextField textBox5= new JTextField("Kebab Cocktail,325");
        textBox5.setEditable(false);
        textBox5.setHorizontalAlignment(JTextField.CENTER);
        textBox5.setFont(new Font("Tahoma", Font.BOLD, 12));
        textBox5.setBackground(new Color(0x413016));
        textBox5.setForeground(Color.WHITE);
        textBox5.setBorder(null);
        panel5.add(textBox5, BorderLayout.NORTH);


        JButton addToCartButton5 = new JButton("Add to Cart");
        addToCartButton5.setPreferredSize(new Dimension(75, 30));
        addToCartButton5.setBackground(new Color(0x8e6930));
        addToCartButton5.setForeground(Color.WHITE);
        addToCartButton5.setFocusPainted(false);
        addToCartButton5.setFont(new Font("Tahoma", Font.BOLD, 12));

        
        JButton orderNowButton5 = new JButton("Order Now");
        orderNowButton5.setPreferredSize(new Dimension(75, 30));
        orderNowButton5.setBackground(new Color(0xe06506));
        orderNowButton5.setForeground(Color.WHITE);
        orderNowButton5.setFocusPainted(false);
        orderNowButton5.setFont(new Font("Tahoma", Font.BOLD, 12));


        JPanel buttonPanel5 = new JPanel();
        buttonPanel5.setLayout(new GridLayout(1, 3, 0, 0));
        buttonPanel5.add(addToCartButton5);
        buttonPanel5.add(orderNowButton5);


        panel5.add(buttonPanel5, BorderLayout.SOUTH);
        gridPanel.add(panel5);


        //panel 6

        JPanel panel6 = new JPanel();
        panel6.setLayout(new BorderLayout());
        panel6.setBackground(panelColor);


        ImageIcon image6 = new ImageIcon(new ImageIcon("images/Meat Mashala  Pizza (315).jpeg")
        .getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel6 = new JLabel();
        imageLabel6.setIcon(image6);
        imageLabel6.setHorizontalAlignment(JLabel.CENTER);
        panel6.add(imageLabel6);


        JTextField textBox6= new JTextField("Meat Mashala Pizza,315");
        textBox6.setEditable(false);
        textBox6.setHorizontalAlignment(JTextField.CENTER);
        textBox6.setFont(new Font("Tahoma", Font.BOLD, 12));
        textBox6.setBackground(new Color(0x413016));
        textBox6.setForeground(Color.WHITE);
        textBox6.setBorder(null);
        panel6.add(textBox6, BorderLayout.NORTH);


        JButton addToCartButton6 = new JButton("Add to Cart");
        addToCartButton6.setPreferredSize(new Dimension(75, 30));
        addToCartButton6.setBackground(new Color(0x8e6930));
        addToCartButton6.setForeground(Color.WHITE);
        addToCartButton6.setFocusPainted(false);
        addToCartButton6.setFont(new Font("Tahoma", Font.BOLD, 12));

        
        JButton orderNowButton6 = new JButton("Order Now");
        orderNowButton6.setPreferredSize(new Dimension(75, 30));
        orderNowButton6.setBackground(new Color(0xe06506));
        orderNowButton6.setForeground(Color.WHITE);
        orderNowButton6.setFocusPainted(false);
        orderNowButton6.setFont(new Font("Tahoma", Font.BOLD, 12));


        JPanel buttonPanel6 = new JPanel();
        buttonPanel6.setLayout(new GridLayout(1, 3, 0, 0));
        buttonPanel6.add(addToCartButton6);
        buttonPanel6.add(orderNowButton6);


        panel6.add(buttonPanel6, BorderLayout.SOUTH);
        gridPanel.add(panel6);

        
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

         //add to cart button
         addToCartButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isButton1Clicked) {
                addToCart(textBox1.getText());
                isButton1Clicked = true;
                     }
                     checkoutButton.setVisible(true);
            }
        });

        addToCartButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (!isButton2Clicked) {
                addToCart(textBox2.getText());
                isButton2Clicked = true;
                     }
                     checkoutButton.setVisible(true);
                 
            }
        });

         addToCartButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isButton3Clicked) {
                addToCart(textBox3.getText());
                isButton3Clicked = true;
                     }
                     checkoutButton.setVisible(true);
            }
        });

        addToCartButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isButton4Clicked) {
                addToCart(textBox4.getText());
                isButton4Clicked = true;
                     }
                     checkoutButton.setVisible(true);
            }
        });

         addToCartButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isButton5Clicked) {
                addToCart(textBox5.getText());
                isButton5Clicked = true;
                     }
                     checkoutButton.setVisible(true);
            }
        });

        addToCartButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isButton6Clicked) {
                addToCart(textBox6.getText());
                isButton6Clicked = true;
                     }
                     checkoutButton.setVisible(true);
            }
        });

        //ordernow button

        orderNowButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usarseeButton.isLoggedIn()) {
                    clearCartFile();
                    addToCart1(textBox1.getText());
                    new CheckOut( WaffleUpMenu.class);
                    frame.setVisible(false);
                    frame.dispose();
                }
                else {
                    showLoginDialog();
                }
            }
        });

        orderNowButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usarseeButton.isLoggedIn()) {
                    clearCartFile();
                    addToCart1(textBox2.getText());
                    new CheckOut( WaffleUpMenu.class);
                    frame.setVisible(false);
                    frame.dispose();
                }
                else {
                    showLoginDialog();
                }
            }
        });

         orderNowButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usarseeButton.isLoggedIn()) {
                    clearCartFile();
                    addToCart1(textBox3.getText());
                    new CheckOut( WaffleUpMenu.class);
                    frame.setVisible(false);
                    frame.dispose();  
                }
                else {
                    showLoginDialog();
                }
            }
        });

        orderNowButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usarseeButton.isLoggedIn()) {
                    clearCartFile();
                    addToCart1(textBox4.getText());
                    new CheckOut( WaffleUpMenu.class);
                    frame.setVisible(false);
                    frame.dispose();
                }
                else {
                    showLoginDialog();
                }
            }
        });

         orderNowButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usarseeButton.isLoggedIn()) {
                    clearCartFile();
                    addToCart1(textBox5.getText());
                    new CheckOut( WaffleUpMenu.class);
                    frame.setVisible(false);
                    frame.dispose();
                }
                else {
                    showLoginDialog();
                }
            }
        });

        orderNowButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usarseeButton.isLoggedIn()) {
                    clearCartFile();
                    addToCart1(textBox6.getText());
                    new CheckOut( WaffleUpMenu.class);
                    frame.setVisible(false);
                    frame.dispose();
                }
                else {
                    showLoginDialog();
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backButton) {
                clearCartFile();
                new viewPage();
                frame.setVisible(false);
                frame.dispose();

                }
            }
        });
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == signupButton) {
                   new SignPage();
                    frame.setVisible(false);
                    frame.dispose();

                }
            }
        });
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginButton) {
                   new LoginPage();
                   frame.setVisible(false);
                    frame.dispose();

                }
            }
        });

    
    logoutButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == logoutButton) {
                new HomePage();
                frame.dispose();
                usarseeButton.setLoggedIn(false); // Set login status to false
                updateButtonVisibility();// Hide or show buttons based on the login status
            }
        }
    }); 

    checkoutButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (usarseeButton.isLoggedIn()) {
                new CheckOut(PizzaBurgMenu.class);
                frame.setVisible(false);
                frame.dispose();
            } else {
                showLoginDialog();
            }
        }
    });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                clearCartFile();
                super.windowClosing(e);
            }
        });

    updateButtonVisibility();
}

        private void showLoginDialog() {
        int option = JOptionPane.showConfirmDialog(
            frame,
            "You need to log in to proceed. Do you want to log in?",
            "Login Required",
            JOptionPane.YES_NO_OPTION
        );
    
        if (option == JOptionPane.YES_OPTION) {
            new LoginPage();
            frame.setVisible(false);
            frame.dispose();
        }
    }
        
        private void updateButtonVisibility() {
            if (usarseeButton.isLoggedIn()) {
                // User is logged in, show logoutButton, hide signupButton and loginButton
                logoutButton.setVisible(true);
                signupButton.setVisible(false);
                loginButton.setVisible(false);
            } else {
                // User is not logged in, show signupButton and loginButton, hide logoutButton
                logoutButton.setVisible(false);
                signupButton.setVisible(true);
                loginButton.setVisible(true);
            }
        }

        private void addToCart(String item) {
        try {
            FileWriter writer = new FileWriter(cartFile, true);
            writer.write(item + "\n");
            writer.close();
            String confirmationMessage = "Item added to your cart.\nGo to checkout to confirm your order.";
            JOptionPane.showMessageDialog(null, confirmationMessage);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void addToCart1(String item) {
        try {
            FileWriter writer = new FileWriter(cartFile, true);
            writer.write(item + "\n");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
