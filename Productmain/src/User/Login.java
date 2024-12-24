package User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Login extends JFrame {
	    private JPanel contentPane;

	    public Login() {
	        SwingUtilities.invokeLater(() -> {
	            JFrame loginFrame = new JFrame("Login TO SCPS");
	            loginFrame.setSize(1300, 806);
	            loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	            setLocationRelativeTo(null);

	            // Create a transparent content pane
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

	            // Create a new panel for the form elements
	            JPanel formPanel = new JPanel();
	            formPanel.setLayout(null);
	            formPanel.setBackground(new Color(255, 255, 255));
	            formPanel.setBounds(400, 150, 550, 400);

	            // Username label and text field
	            JLabel lblUsername = new JLabel("Username:");
	            lblUsername.setForeground(Color.BLACK);
	            lblUsername.setBounds(100, 50, 100, 25);
	            formPanel.add(lblUsername);

	            JTextField txtUsername = new JTextField();
	            txtUsername.setBounds(210, 50, 300, 25);
	            formPanel.add(txtUsername);

	            // Password label and text field
	            JLabel lblPassword = new JLabel("Password:");
	            lblPassword.setForeground(Color.BLACK);
	            lblPassword.setBounds(100, 100, 100, 25);
	            formPanel.add(lblPassword);

	            JPasswordField txtPassword = new JPasswordField();
	            txtPassword.setBounds(210, 100, 300, 25);
	            formPanel.add(txtPassword);

	            // Radio buttons for user type
	            JRadioButton rdbUser = new JRadioButton("User");
	            rdbUser.setBounds(100, 150, 100, 25);
	            rdbUser.setForeground(Color.BLACK);
	            rdbUser.setBackground(new Color(255, 255, 255));
	            formPanel.add(rdbUser);

	            JRadioButton rdbAdmin = new JRadioButton("Admin");
	            rdbAdmin.setBounds(220, 150, 100, 25);
	            rdbAdmin.setForeground(Color.BLACK);
	            rdbAdmin.setBackground(new Color(255, 255, 255));
	            formPanel.add(rdbAdmin);

	            JRadioButton rdbDermatologist = new JRadioButton("Dermatologist");
	            rdbDermatologist.setBounds(340, 150, 150, 25);
	            rdbDermatologist.setForeground(Color.BLACK);
	            rdbDermatologist.setBackground(new Color(255, 255, 255));
	            formPanel.add(rdbDermatologist);

	            ButtonGroup userTypeGroup = new ButtonGroup();
	            userTypeGroup.add(rdbUser);
	            userTypeGroup.add(rdbAdmin);
	            userTypeGroup.add(rdbDermatologist);

	            // Login button
	            JButton btnLogin = new JButton("Login");
	            btnLogin.setBounds(200, 200, 150, 30);
	            btnLogin.setForeground(Color.WHITE);
	            btnLogin.setBackground(new Color(0, 0, 0));
	            btnLogin.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    // Add your login logic here
	                }
	            });
	            formPanel.add(btnLogin);

	            JLabel lblSignUp = new JLabel("Do Not Have Account? Sign up");
	            lblSignUp.setForeground(Color.BLUE);
	            lblSignUp.setBounds(200, 250, 200, 25);
	            lblSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	            lblSignUp.addMouseListener(new MouseAdapter() {
	                @Override
	                public void mouseClicked(MouseEvent e) {
	                    // Open the Signup.java page when the label is clicked
	                    Signup signupPage = new Signup();
	                    signupPage.setVisible(true);
	                    loginFrame.dispose(); // Close the login page if needed
	                }
	            }); btnLogin.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                         String username = txtUsername.getText();
	                         String password = String.valueOf(txtPassword.getPassword());
	                        

	                         boolean loginSuccessful = false;

	                         // JDBC connection variables
	                         Connection conn = null;
	                         PreparedStatement stmt = null;
	                         ResultSet rs = null;

	                         try {
	                             // JDBC connection settings (change accordingly)
	                             String url = "jdbc:mysql://localhost:3306/skincareproduct";
	                             String dbUsername = "root";
	                             String dbPassword = "";

	                             // Establish the connection to the database
	                             conn = DriverManager.getConnection(url, dbUsername, dbPassword);

	                             // Create a SQL query based on user type
	                             String query = "";
	                             if (rdbUser.isSelected()) {
	                                 query = "SELECT * FROM users WHERE username=? AND password=?";
	                             } else if (rdbAdmin.isSelected()) {
	                                 query = "SELECT * FROM admins WHERE username=? AND password=?";
	                             } else if (rdbDermatologist.isSelected()) {
	                                 query = "SELECT * FROM dermatologists WHERE username=? AND password=?";
	                             }

	                             // Prepare the SQL statement
	                             stmt = conn.prepareStatement(query);
	                             stmt.setString(1, username);
	                             stmt.setString(2, password);

	                             // Execute the query
	                             rs = stmt.executeQuery();

	                             // Check if the query returned any rows
	                             loginSuccessful = rs.next();
	                         } catch (SQLException ex) {
	                             ex.printStackTrace();
	                         } finally {
	                             // Close the resources
	                             try {
	                                 if (rs != null) rs.close();
	                                 if (stmt != null) stmt.close();
	                                 if (conn != null) conn.close();
	                             } catch (SQLException ex) {
	                                 ex.printStackTrace();
	                             }
	                         }
	                         boolean loginSuccessful1 = false;

	                         if (rdbUser.isSelected()) {
	                             // Dummy validation for user
	                             loginSuccessful1 = username.equals("user") && password.equals("123");
	                         } else if (rdbAdmin.isSelected()) {
	                             // Dummy validation for admin
	                             loginSuccessful1 = username.equals("admin") && password.equals("admin");
	                         } else if (rdbDermatologist.isSelected()) {
	                             // Dummy validation for dermatologist
	                             loginSuccessful1 = username.equals("der") && password.equals("123");
	                         }

	                         if (loginSuccessful1) {
	                             // Navigate based on user type
	                             if (rdbAdmin.isSelected()) {
                                   adminhome settingFrame=new adminhome();
	                                 settingFrame.setVisible(true);
	                             } else if (rdbDermatologist.isSelected()) {
	                            	 UpdateRecommendations settingFrame=new UpdateRecommendations();
	                                 settingFrame.setVisible(true);
	                             } else {
	                                 // Open user's home page
	                                 UserDashBoard homeFrame = new UserDashBoard();
	                                 homeFrame.setVisible(true);
	                             }
	                             dispose(); // Close the login page if needed
	                         } else {
	                             JOptionPane.showMessageDialog(null, "Invalid username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
	                         }
	                     }
	                 });
	            formPanel.add(lblSignUp);
	            contentPane.add(formPanel);

	            loginFrame.add(contentPane);
	            loginFrame.setVisible(true);
	        });
	    }
	}