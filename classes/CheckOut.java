package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import classes.usarseeButton;
import java.io.*;

public class CheckOut extends JFrame {
    JFrame frame;
    JPanel panel, panel1;
    JLabel l,l1,l2;
    JButton backButton;
    List<String> itemNames = new ArrayList<>();
    List<Double> itemPrices = new ArrayList<>();
    List<JTextField> quantityFields = new ArrayList<>();
    JTextField totalAmountField;
    private boolean orderConfirmed = false;
    private Class<?> menuClassType;
  

    File cartFile = new File("Data\\cart.txt");

    public CheckOut( Class<?> menuClassType) {
        this.menuClassType = menuClassType;  
        setSize(1600, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("images/logo.png");
        setIconImage(icon.getImage());
        

        panel = new JPanel();
        panel.setBackground(new Color(0x4c8866));
        panel.setLayout(null);
        add(panel);


        backButton = new JButton("Back");
        backButton.setBackground(new Color(0x992e2e));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setBounds(10, 5, 80, 30);
        panel.add(backButton); 
    
        
        ImageIcon icon1 = new ImageIcon("images/5569552_2903544-removebg-preview.png");
        Image image1 = icon1.getImage();
        l =new JLabel(new ImageIcon(image1));
        l.setBounds(0,200,500,500);
        panel.add(l);

        ImageIcon icon2 = new ImageIcon("images/5569552_2903544-removebg-preview.png");
        Image image2 = icon2.getImage();
        l1 =new JLabel(new ImageIcon(image1));
        l1.setBounds(1050,200,500,500);
        panel.add(l1);

        ImageIcon icon3 = new ImageIcon("images/logo (1).png");
        Image image3 = icon3.getImage();
        l2 =new JLabel(new ImageIcon(image3));
        l2.setBounds(600,0,150,130);
        panel.add(l2);

        // Read item names and prices from a file (modify file path accordingly)
        readItemsFromFile("Data\\cart.txt");

        // Create transparent text boxes to display item names and prices
        panel1 = new JPanel(null);
        panel1.setBounds(400, 150, 700, 700);
        panel1.setBackground(new Color(0xbbd0ff));
        panel.add(panel1);

        //ordernow button
        JButton orderNowButton = new JButton("Confirm Order");
        orderNowButton.setBackground(new Color(0xf3b366));
        orderNowButton.setBounds(50, 500, 150, 30);
        panel1.add(orderNowButton); 
        panel1.setVisible(true);

        int yPos = 50;
        for (int i = 0; i < itemNames.size(); i++) {
            JTextField itemNameField = new JTextField(itemNames.get(i));
            itemNameField.setBounds(50, yPos, 200, 30);
            itemNameField.setOpaque(false);
            itemNameField.setBorder(null);
            itemNameField.setEditable(false);
            itemNameField.setFont(new Font("Tahoma", Font.BOLD, 20));
            panel1.add(itemNameField);

            JTextField itemPriceField = new JTextField(String.valueOf(itemPrices.get(i)));
            itemPriceField.setBounds(300, yPos, 100, 30);
            itemPriceField.setOpaque(false);
            itemPriceField.setBorder(null);
            itemPriceField.setEditable(false);
            itemPriceField.setFont(new Font("Tahoma", Font.BOLD, 20));
            panel1.add(itemPriceField);

            JTextField quantityField = new JTextField("1");
            quantityField.setBounds(420, yPos, 50, 30);
            quantityField.setOpaque(false);
            quantityField.setBorder(null);
            quantityField.setEditable(false);
            quantityField.setFont(new Font("Tahoma", Font.BOLD, 20));
            panel1.add(quantityField);
            quantityFields.add(quantityField);

            JButton increaseButton = new JButton("+");
            increaseButton.setBackground(Color.GREEN);
            increaseButton.setFocusPainted(false);
            increaseButton.setBounds(520, yPos, 50, 30);
            panel1.add(increaseButton);

            JButton decreaseButton = new JButton("-");
            decreaseButton.setBackground(Color.RED);
            decreaseButton.setFocusPainted(false);
            decreaseButton.setBounds(580, yPos, 50, 30);
            panel1.add(decreaseButton);

            yPos += 50;

            increaseButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Implement logic to increase the quantity
                    int index = quantityFields.indexOf(quantityField);
                    int quantity = Integer.parseInt(quantityFields.get(index).getText());
                    quantity++;
                    quantityFields.get(index).setText(Integer.toString(quantity));
                    updateTotalAmount();
                }
            });

            decreaseButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Implement logic to decrease the quantity
                    int index = quantityFields.indexOf(quantityField);
                    int quantity = Integer.parseInt(quantityFields.get(index).getText());
                    if (quantity > 0) {
                    quantity--;
                    quantityFields.get(index).setText(Integer.toString(quantity));
                 updateTotalAmount();
                }
                }
            });
            
            

        }
        orderNowButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        if (isTotalAmountZero()) {
            JOptionPane.showMessageDialog(frame, "Please select an item first.");
        } else if (!isTotalAmountZero()) {
            confirmOrder();
        }
    }
});
backButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {

            openMenu();
          setVisible(false);
           dispose();

        }
    }
});

        totalAmountField = new JTextField();
        totalAmountField.setBounds(225, yPos + 20, 200, 30);
        totalAmountField.setOpaque(false);
        totalAmountField.setBorder(null);
        totalAmountField.setFont(new Font("Tahoma", Font.BOLD, 20));
        totalAmountField.setEditable(false);
        panel1.add(totalAmountField);

        updateTotalAmount();

        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void updateTotalAmount() {
        double totalAmount = 0.0;
        for (int i = 0; i < itemNames.size(); i++) {
            int quantity = Integer.parseInt(quantityFields.get(i).getText());
            totalAmount += quantity * itemPrices.get(i);
        }
        totalAmountField.setText(String.format("TOTAL: %.2f", totalAmount));
    }

    // Function to read item names and prices from a file
    private void readItemsFromFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    itemNames.add(parts[0]);
                    itemPrices.add(Double.parseDouble(parts[1]));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void confirmOrder() {
        if (!orderConfirmed) {
            JOptionPane.showMessageDialog(this, "Order Confirmed!");
            orderConfirmed = true;
            clearCartFile();
            openMenu();  // Show the KFCMenu frame
            dispose();  // Close the CheckOut frame
        }
    }
    
    
    private boolean isTotalAmountZero() {
    double totalAmount = 0.0;
    for (int i = 0; i < itemNames.size(); i++) {
        int quantity = Integer.parseInt(quantityFields.get(i).getText());
        totalAmount += quantity * itemPrices.get(i);
    }
    return totalAmount == 0.0;
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
    private void openMenu() {
        try {
            JFrame menuFrame = (JFrame) menuClassType.getDeclaredConstructor().newInstance();
            menuFrame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private void updateButtonVisibility() {
    //     System.out.println("UpdateButtonVisibility called");
    //     if (!usarseeButton.isLoggedIn()) {
    //         System.out.println("User is logged in");
    //         logoutButton.setVisible(true);
    //          backButton.setVisible(false);
            
    //     } else {
    //         System.out.println("User is not logged in");
    //         logoutButton.setVisible(false);
    //         backButton.setVisible(true);
    //     }
    // }
}