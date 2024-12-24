package User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Signup extends JFrame {
    private JPanel contentPane;

    public Signup() {
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
            JLabel lblName = new JLabel("Name:");
            lblName.setBounds(50, 50, 100, 25);
            formPanel.add(lblName);

            JTextField txtName = new JTextField();
            txtName.setBounds(200, 50, 200, 25);
            formPanel.add(txtName);

            // Password label and password fields
            JLabel lblPassword = new JLabel("Password:");
            lblPassword.setBounds(50, 100, 100, 25);
            formPanel.add(lblPassword);

            JPasswordField txtPassword = new JPasswordField();
            txtPassword.setBounds(200, 100, 200, 25);
            formPanel.add(txtPassword);

            // Confirm Password label and password fields
            JLabel lblConfirmPassword = new JLabel("Confirm Password:");
            lblConfirmPassword.setBounds(50, 150, 150, 25);
            formPanel.add(lblConfirmPassword);

            JPasswordField txtConfirmPassword = new JPasswordField();
            txtConfirmPassword.setBounds(200, 150, 200, 25);
            formPanel.add(txtConfirmPassword);

            // Email label and text field
            JLabel lblEmail = new JLabel("Email:");
            lblEmail.setBounds(50, 200, 100, 25);
            formPanel.add(lblEmail);

            JTextField txtEmail = new JTextField();
            txtEmail.setBounds(200, 200, 200, 25);
            formPanel.add(txtEmail);

            // Gender label and combo box
            JLabel lblGender = new JLabel("Gender:");
            lblGender.setBounds(450, 100, 100, 25);
            formPanel.add(lblGender);

            String[] genders = {"Male", "Female", "Prefer not to say"};
            JComboBox<String> cmbGender = new JComboBox<>(genders);
            cmbGender.setBounds(600, 100, 200, 25);
            formPanel.add(cmbGender);

            // Date of Birth label and text field
            JLabel lblDOB = new JLabel("Date of Birth:");
            lblDOB.setBounds(450, 50, 100, 25);
            formPanel.add(lblDOB);

            JTextField txtDOB = new JTextField();
            txtDOB.setBounds(600, 50, 200, 25);
            formPanel.add(txtDOB);

            // Phone label and text field
            JLabel lblPhone = new JLabel("Phone:");
            lblPhone.setBounds(450, 150, 100, 25);
            formPanel.add(lblPhone);

            JTextField txtPhone = new JTextField();
            txtPhone.setBounds(600, 150, 200, 25);
            formPanel.add(txtPhone);

            // Address label and text area
            JLabel lblAddress = new JLabel("Address:");
            lblAddress.setBounds(450, 200, 100, 25);
            formPanel.add(lblAddress);

            JTextField txtAddress = new JTextField();
            txtAddress.setBounds(600, 200, 200, 25);
            formPanel.add(txtAddress);

            // Signup button
            JButton btnSignup = new JButton("Sign up");
            btnSignup.setBounds(400, 300, 100, 30);
            btnSignup.setForeground(Color.WHITE);
            btnSignup.setBackground(new Color(0, 0, 0));
            btnSignup.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String password = new String(txtPassword.getPassword());
                String confirmPassword = new String(txtConfirmPassword.getPassword());
                String email = txtEmail.getText();
                // Get other user details similarly

                // Perform password validation (e.g., match passwords)
                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(contentPane, "Passwords do not match. Please re-enter.");
                    // Clear password fields
                    txtPassword.setText("");
                    txtConfirmPassword.setText("");
                    return;
                }

             
                UserDashBoard homeFrame = new UserDashBoard();
                homeFrame.setVisible(true);
                }
            });
            
            JLabel lbllogin = new JLabel("Already Have An Account? Log In");
            lbllogin.setForeground(Color.BLUE);
            lbllogin.setBounds(375, 350, 200, 25);
            lbllogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lbllogin.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Open the Signup.java page when the label is clicked
                    Login login = new Login();
                    login.setVisible(true);
                    signupFrame.dispose(); // Close the login page if needed
                }
            });
            formPanel.add(lbllogin);
            formPanel.add(btnSignup);

            signupFrame.add(contentPane);
            signupFrame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        new Signup();
    }
}