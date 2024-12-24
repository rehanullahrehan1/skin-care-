package User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Viewproduct extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

    public Viewproduct() {
        SwingUtilities.invokeLater(() -> {
            JFrame Viewproduct = new JFrame("ViewProducts");
            Viewproduct.setSize(1300, 806);
            Viewproduct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
            contentPane.setOpaque(false);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(null);

            // Title
            JLabel lblTitle = new JLabel("Welcome to Skin Care Product System");
            lblTitle.setForeground(Color.WHITE);
            lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
            lblTitle.setBounds(400, 50, 650, 30);
            contentPane.add(lblTitle);
            
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
            lblMG.setBounds(450, 50, 100, 25);
            formPanel.add(lblMG);

            JTextField txtmg = new JTextField();
            txtmg.setBounds(600, 50, 200, 25);
            formPanel.add(txtmg);

            JLabel lblexp = new JLabel("Exp Date:");
            lblexp.setBounds(450, 100, 100, 25);
            formPanel.add(lblexp);

            JTextField txtexp = new JTextField();
            txtexp.setBounds(600, 100, 200, 25);
            formPanel.add(txtexp);

            // Date of Birth label and text field
            JLabel Ingredients = new JLabel("Ingredients:");
            Ingredients.setBounds(450, 150, 100, 25);
            formPanel.add(Ingredients);

            JTextField txtIngredients = new JTextField();
            txtIngredients.setBounds(600, 150, 200, 25);
            formPanel.add(txtIngredients);

            // Phone label and text field
            JLabel lblcategory = new JLabel("Category:");
            lblcategory.setBounds(275, 200, 100, 25);
            formPanel.add(lblcategory);

            JTextField txtcategory = new JTextField();
            txtcategory.setBounds(350, 200, 200, 25);
            formPanel.add(txtcategory);


            // Signup button
            JButton btnSignup = new JButton("Add To Cart");
            btnSignup.setBounds(400, 300, 150, 30);
            btnSignup.setForeground(Color.WHITE);
            btnSignup.setBackground(new Color(0, 0, 0));
            btnSignup.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            
            JButton btnBack = new JButton("Back To Home");
            btnBack.setBounds(400, 350, 150, 30);
            btnBack.setForeground(Color.WHITE);
            btnBack.setBackground(new Color(0, 0, 0));
            btnBack.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	new Home();
                	Viewproduct.dispose();
                	
                }
            });
            formPanel.add(btnSignup);
            formPanel.add(btnBack);

            Viewproduct.add(contentPane);
            Viewproduct.setVisible(true);
        });
    }

    
}
