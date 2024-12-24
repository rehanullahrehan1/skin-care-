package User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCart extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> paymentComboBox;

    public ViewCart() {
        SwingUtilities.invokeLater(() -> {
            JFrame signupFrame = new JFrame("View Cart");
            signupFrame.setSize(1300, 806);
            signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            contentPane = new JPanel() {
                /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    // Create a gradient background
                    Graphics2D g2d = (Graphics2D) g;
                    GradientPaint gradient = new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.BLACK);
                    g2d.setPaint(gradient);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            };
            

            // Title
            JLabel lblTitle = new JLabel("Welcome to Skin Care Product System");
            lblTitle.setForeground(Color.WHITE);
            lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
            lblTitle.setBounds(400, 50, 650, 30);
            contentPane.add(lblTitle);
            
//            JLabel cart = new JLabel("CART");
//            cart.setForeground(Color.WHITE);
//            cart.setFont(new Font("Arial", Font.BOLD, 30));
//            cart.setBounds(500, 100, 650, 30);
//            contentPane.add(cart);
            
            JPanel formPanel = new JPanel();
            formPanel.setLayout(null);
            formPanel.setBackground(new Color(255, 255, 255));
            formPanel.setBounds(200, 100, 900, 500);
            contentPane.add(formPanel);
         // Name label and text field
            JLabel lblName = new JLabel("Product Name:");
            lblName.setBounds(50, 50, 100, 25);
            formPanel.add(lblName);

            JTextField txtName = new JTextField();
            txtName.setBounds(200, 50, 200, 25);
            formPanel.add(txtName);

            // Password label and password fields
            JLabel lblPrice = new JLabel("Price:");
            lblPrice.setBounds(50, 100, 100, 25);
            formPanel.add(lblPrice);

            JTextField txtPrice = new JTextField();
            txtPrice.setBounds(200, 100, 200, 25);
            formPanel.add(txtPrice);

            // Confirm Password label and password fields
            JLabel lblQuantity = new JLabel("Quantity:");
            lblQuantity.setBounds(50, 150, 100, 25);
            formPanel.add(lblQuantity);

            JTextField txtquantity = new JTextField();
            txtquantity.setBounds(200, 150, 200, 25);
            formPanel.add(txtquantity);
            
         // Email label and text field
            JLabel lblMG = new JLabel("Mfg Date:");
            lblMG.setBounds(50, 200, 100, 25);
            formPanel.add(lblMG);

            JTextField txtmg = new JTextField();
            txtmg.setBounds(200, 200, 200, 25);
            formPanel.add(txtmg);

            JLabel lblexp = new JLabel("Exp Date:");
            lblexp.setBounds(50, 250, 100, 25);
            formPanel.add(lblexp);

            JTextField txtexp = new JTextField();
            txtexp.setBounds(200, 250, 200, 25);
            formPanel.add(txtexp);

            // Date of Birth label and text field
            JLabel Ingredients = new JLabel("Ingredients:");
            Ingredients.setBounds(50, 300, 100, 25);
            formPanel.add(Ingredients);

            JTextField txtIngredients = new JTextField();
            txtIngredients.setBounds(200, 300, 200, 25);
            formPanel.add(txtIngredients);

            // Phone label and text field
            JLabel lblcategory = new JLabel("Category:");
            lblcategory.setBounds(50, 350, 100, 25);
            formPanel.add(lblcategory);

            JTextField txtcategory = new JTextField();
            txtcategory.setBounds(200, 350, 200, 25);
            formPanel.add(txtcategory);

            // Email label and text field
            JLabel name = new JLabel("Name");
            name.setBounds(450, 50, 100, 25);
            formPanel.add(name);

            JTextField txtname = new JTextField();
            txtname.setBounds(600, 50, 200, 25);
            formPanel.add(txtname);

            JLabel account = new JLabel("Acc. No");
            account.setBounds(450, 100, 100, 25);
            formPanel.add(account);

            JTextField txtaccount = new JTextField();
            txtaccount.setBounds(600, 100, 200, 25);
            formPanel.add(txtaccount);

            // Date of Birth label and text field
            JLabel cvc = new JLabel("CVC:");
            cvc.setBounds(450, 150, 100, 25);
            formPanel.add(cvc);

            JTextField txtcvc = new JTextField();
            txtcvc.setBounds(600, 150, 200, 25);
            formPanel.add(txtcvc);

            // Phone label and text field
            JLabel payment = new JLabel("Payment Method:");
            payment.setBounds(450, 200, 150, 25);
            formPanel.add(payment);

            String[] paymentOptions = {"Cash on Delivery (COD)", "Online Payment"};
            paymentComboBox = new JComboBox<>(paymentOptions);
            paymentComboBox.setForeground(Color.BLACK);
            paymentComboBox.setBackground(new Color(255, 255, 255));
            paymentComboBox.setBounds(600, 200, 200, 25);
            formPanel.add(paymentComboBox);
            
          
            // Address label and text area
            JLabel lblAddress = new JLabel("Address:");
            lblAddress.setBounds(450, 250, 100, 25);
            formPanel.add(lblAddress);

            JTextField txtAddress = new JTextField();
            txtAddress.setBounds(600, 250, 200, 25);
            formPanel.add(txtAddress);
            
            JLabel charges = new JLabel("Charges:");
            charges.setBounds(450, 300, 100, 25);
            formPanel.add(charges);

            JTextField txtcharges = new JTextField();
            txtcharges.setBounds(600, 300, 200, 25);
            formPanel.add(txtcharges);
            
            JLabel tcharges = new JLabel("Total Amount:");
            tcharges.setBounds(450, 350, 100, 25);
            formPanel.add(tcharges);

            JTextField txttcharges = new JTextField();
            txttcharges.setBounds(600, 350, 200, 25);
            formPanel.add(txttcharges);

            // Signup button
            JButton btnSignup = new JButton("Place Order");
            btnSignup.setBounds(400, 400, 150, 30);
            btnSignup.setForeground(Color.WHITE);
            btnSignup.setBackground(new Color(0, 0, 0));
            btnSignup.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Thanks for Shopping here!");
                }
            });
            formPanel.add(btnSignup);
            Cart cart = new Cart();
            // ... existing code ...
            
            // In the action of a button or event, populate the text fields with the product data
            Product aloeVeraFacewash = cart.getProduct("Aloe Vera Facewash");

            txtName.setText(aloeVeraFacewash.getName());
            txtPrice.setText(String.valueOf(aloeVeraFacewash.getPrice())); // Convert double to String
            txtquantity.setText(String.valueOf(aloeVeraFacewash.getQuantity())); // Convert int to String
            txtmg.setText(aloeVeraFacewash.getMfgDate().toString()); // Assuming getManufacturingDate returns LocalDate
            txtexp.setText(aloeVeraFacewash.getExpiryDate().toString()); // Assuming getExpiryDate returns LocalDate
            txtIngredients.setText(aloeVeraFacewash.getIngredients());
            txtcategory.setText(aloeVeraFacewash.getCategory());

            contentPane.setOpaque(false);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(null);
            // Login button
            JButton btnLogin = new JButton("Login");
            btnLogin.setBounds(600, 400, 150, 30);
            btnLogin.setForeground(Color.WHITE);
            btnLogin.setBackground(new Color(0, 0, 0));
            btnLogin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Open the Signup.java page when the label is clicked
                    Signup signupPage = new Signup();
                    signupPage.setVisible(true);
                    signupFrame.dispose(); // Close the login page if needed
                }
            });
            formPanel.add(btnLogin);

            signupFrame.add(contentPane);
            signupFrame.setVisible(true);
        });
    }

    
}
