package User;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addproducts extends JFrame {
    private JPanel contentPane;

    public addproducts() {
        SwingUtilities.invokeLater(() -> {
            JFrame signupFrame = new JFrame("Signup");
            signupFrame.setSize(1300, 806);
            signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            contentPane = new JPanel() {
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
            JLabel lblTitle = new JLabel("Add Skincare Products");
            lblTitle.setForeground(Color.WHITE);
            lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
            lblTitle.setBounds(500, 50, 650, 30);
            contentPane.add(lblTitle);

            JPanel formPanel = new JPanel();
            formPanel.setLayout(null);
            formPanel.setBackground(new Color(255, 255, 255));
            formPanel.setBounds(200, 100, 900, 500);
            contentPane.add(formPanel);

            // Name label and text field
            JLabel lblName = new JLabel("ProductId");
            lblName.setBounds(50, 50, 100, 25);
            formPanel.add(lblName);

            JTextField txtName = new JTextField();
            txtName.setBounds(200, 50, 200, 25);
            formPanel.add(txtName);

           //product name field
            JLabel lblEmail = new JLabel("Product Name:");
            lblEmail.setBounds(50, 100, 100, 25);
            formPanel.add(lblEmail);

            JTextField txtEmail = new JTextField();
            txtEmail.setBounds(200, 100, 200, 25);
            formPanel.add(txtEmail);

            // Gender label and combo box
            JLabel lblGender = new JLabel("Product Categories");
            lblGender.setBounds(50, 150, 150, 25);
            formPanel.add(lblGender);

            String[] genders = {"Cleansers","Facewash","Moistureizers", "Serums", "Sunscreen"};
            JComboBox<String> cmbGender = new JComboBox<>(genders);
            cmbGender.setBounds(200, 150, 200, 25);
            formPanel.add(cmbGender);

            // Date of Birth label and text field
            JLabel lblDOB = new JLabel("Manufacture Date");
            lblDOB.setBounds(450, 50, 120, 25);
            formPanel.add(lblDOB);

            JTextField txtDOB = new JTextField();
            txtDOB.setBounds(600, 50, 200, 25);
            formPanel.add(txtDOB);

            // Phone label and text field
            JLabel lblPhone = new JLabel("Expiary Date");
            lblPhone.setBounds(450, 100, 100, 25);
            formPanel.add(lblPhone);

            JTextField txtPhone = new JTextField();
            txtPhone.setBounds(600, 100, 200, 25);
            formPanel.add(txtPhone);

            // Address label and text area
            JLabel lblAddress = new JLabel("Ingredients");
            lblAddress.setBounds(450, 150, 100, 25);
            formPanel.add(lblAddress);

            JTextField txtAddress = new JTextField();
            txtAddress.setBounds(600, 150, 200, 25);
            formPanel.add(txtAddress);

            JButton btnBack = new JButton("Back");
          btnBack.setForeground(Color.WHITE);
          btnBack.setBackground(new Color(0, 0, 0));
          btnBack.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
            	  // Create an instance of the adminhome JFrame
                  adminhome adminHomeFrame = new adminhome();
                  
                  
                  // Make the adminhome JFrame visible
                  adminHomeFrame.setVisible(true);
            	  JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(addproducts.this);
                  currentFrame.setVisible(false);
                 
                  
                  // Hide the current JFrame (if you want to close it, you can use setDefaultCloseOperation)
                  JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(addproducts.this);
                  topFrame.dispose();
                  
              }
          });
          btnBack.setBounds(300, 300, 130, 30);
          add(btnBack);
  

            setContentPane(contentPane);
            setVisible(true);
            // Signup button
            JButton btnsaveProduct = new JButton("Save Product");
            btnsaveProduct.setBounds(500, 300, 130, 30);
            btnsaveProduct.setForeground(Color.WHITE);
            btnsaveProduct.setBackground(new Color(0, 0, 0));
            btnsaveProduct.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Add your signup logic here
                    // You can access the input values using txtName.getText(), txtPassword.getPassword(), etc.
                }
            });

            formPanel.add(btnsaveProduct);
            formPanel.add(btnBack);
            signupFrame.add(contentPane);
            signupFrame.setVisible(true);
        });
        
    }

    public static void main(String[] args) {
        new addproducts();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new addproducts().setVisible(true);
            }
        });
    }
}
