package User;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Serums extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btnBack;
    private JLabel label1;

    private JLabel productLabel1;
    private JLabel productLabel2;
    private JLabel productLabel3;
    private JLabel productLabel4;
    private JLabel productLabel5;
    private JLabel productLabel6;
    private JLabel productLabel7;
    private JLabel productLabel8;    
    private JLabel productLabel9;
    private JLabel productLabel10;
    
    private JButton btnViewProduct1;
    private JButton btnAddToCart1;
    private JButton btnPrice1;
    

    private JButton btnViewProduct2;
    private JButton btnAddToCart2;
    private JButton btnPrice2;

    private JButton btnViewProduct3;
    private JButton btnAddToCart3;
    private JButton btnPrice3;

    private JButton btnViewProduct4;
    private JButton btnAddToCart4;
    private JButton btnPrice4;
    
    private JButton btnViewProduct5;
    private JButton btnAddToCart5;
    private JButton btnPrice5;
    
    private JButton btnViewProduct6;
    private JButton btnAddToCart6;
    private JButton btnPrice6;
    
    private JButton btnViewProduct7;
    private JButton btnAddToCart7;
    private JButton btnPrice7;
    
    private JButton btnViewProduct8;
    private JButton btnAddToCart8;
    private JButton btnPrice8;
    
    private JButton btnViewProduct9;
    private JButton btnAddToCart9;
    private JButton btnPrice9;
    
    private JButton btnViewProduct10;
    private JButton btnAddToCart10;
    private JButton btnPrice10;
	private JTextField textField;

    public Serums() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1300, 806);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        addHeader();
        addLabelProduct();
        addProducts();
        addProducts1();
        addProducts2();

        addFooter();
        
        JScrollPane scrollpane = new JScrollPane(contentPane);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        setContentPane(scrollpane);
        setVisible(true);
    }

    private void addHeader() {
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.WHITE);
        headerPanel.setLayout(new GridBagLayout());
        headerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        // Logo on the top left
        ImageIcon originalLogoIcon = new ImageIcon("./Images/logo.jpeg");
        Image originalImage = originalLogoIcon.getImage();
        int logoWidth = 75;
        int logoHeight = 50;
        Image scaledImage = originalImage.getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledLogoIcon = new ImageIcon(scaledImage);
        label1 = new JLabel(scaledLogoIcon);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        headerPanel.add(label1, gbc);

        // Search bar in the middle
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 14));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        headerPanel.add(Box.createRigidArea(new Dimension(30, 0)), gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        headerPanel.add(textField, gbc);

        JButton btnNewButton = new JButton("Search");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(0, 0, 0));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        headerPanel.add(Box.createHorizontalGlue(), gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        headerPanel.add(btnNewButton, gbc);

        // Login and Setting buttons on the top right
        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnBack.setForeground(Color.WHITE);
        btnBack.setBackground(new Color(0, 0, 0));
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 0;
        headerPanel.add(btnBack, gbc);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home();
            }
        });


        contentPane.add(headerPanel);
    }
    private void addLabelProduct() {
    	JPanel label2=new JPanel();
    	label2.setBackground(Color.WHITE);
    	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
    	
    	
    	JLabel labelnew=new JLabel("Serums");
    	labelnew.setFont(new Font("Tahoma", Font.BOLD, 30));
    	labelnew.setForeground(Color.BLACK);
    	label2.add(Box.createRigidArea(new Dimension(0, 50)));
    	label2.add(labelnew);
    	label2.add(Box.createRigidArea(new Dimension(0, 60)));

    	contentPane.add(label2);

    }
        private void addProducts() {
            JPanel productPanel = new JPanel();
            productPanel.setBackground(Color.WHITE);
            productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.X_AXIS));

         // Product 1
            productLabel1 = new JLabel();
            productLabel1.setIcon(new ImageIcon(new ImageIcon("./Images/serums/1.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct1 = new JButton("View Product");
            btnAddToCart1 = new JButton("Add to Cart");
            btnPrice1 = new JButton("Price");
            btnViewProduct1.setForeground(Color.WHITE);
            btnViewProduct1.setBackground(new Color(0, 0, 0));
            btnAddToCart1.setForeground(Color.WHITE);
            btnAddToCart1.setBackground(new Color(0, 0, 0));
            btnPrice1.setForeground(Color.WHITE);
            btnPrice1.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel1, btnViewProduct1, btnAddToCart1, btnPrice1));

            // Product 2
            productLabel2 = new JLabel();
            productLabel2.setIcon(new ImageIcon(new ImageIcon("./Images/serums/2.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct2 = new JButton("View Product");
            btnAddToCart2 = new JButton("Add to Cart");
            btnPrice2 = new JButton("Price");
            btnViewProduct2.setForeground(Color.WHITE);
            btnViewProduct2.setBackground(new Color(0, 0, 0));
            btnAddToCart2.setForeground(Color.WHITE);
            btnAddToCart2.setBackground(new Color(0, 0, 0));
            btnPrice2.setForeground(Color.WHITE);
            btnPrice2.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel2, btnViewProduct2, btnAddToCart2, btnPrice2));

            // Product 3
            productLabel3 = new JLabel();
            productLabel3.setIcon(new ImageIcon(new ImageIcon("./Images/serums/3.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct3 = new JButton("View Product");
            btnAddToCart3 = new JButton("Add to Cart");
            btnPrice3 = new JButton("Price");
            btnViewProduct3.setForeground(Color.WHITE);
            btnViewProduct3.setBackground(new Color(0, 0, 0));
            btnAddToCart3.setForeground(Color.WHITE);
            btnAddToCart3.setBackground(new Color(0, 0, 0));
            btnPrice3.setForeground(Color.WHITE);
            btnPrice3.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel3, btnViewProduct3, btnAddToCart3, btnPrice3));

            // Product 4
            productLabel4 = new JLabel();
            productLabel4.setIcon(new ImageIcon(new ImageIcon("./Images/serums/4.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct4 = new JButton("View Product");
            btnAddToCart4 = new JButton("Add to Cart");
            btnPrice4 = new JButton("Price");
            btnViewProduct4.setForeground(Color.WHITE);
            btnViewProduct4.setBackground(new Color(0, 0, 0));
            btnAddToCart4.setForeground(Color.WHITE);
            btnAddToCart4.setBackground(new Color(0, 0, 0));
            btnPrice4.setForeground(Color.WHITE);
            btnPrice4.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel4, btnViewProduct4, btnAddToCart4, btnPrice4));
            btnViewProduct1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnViewProduct2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            }); 
            btnViewProduct3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnViewProduct4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnAddToCart1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            btnAddToCart2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            btnAddToCart3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            btnAddToCart4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            contentPane.add(productPanel);

        }
        private void addProducts1() {
            JPanel productPanel = new JPanel();
            productPanel.setBackground(Color.WHITE);
            productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.X_AXIS));
            // Product 5
            productLabel5 = new JLabel();
            productLabel5.setIcon(new ImageIcon(new ImageIcon("./Images/serums/5.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct5 = new JButton("View Product");
            btnAddToCart5 = new JButton("Add to Cart");
            btnPrice5 = new JButton("Price");
            btnViewProduct5.setForeground(Color.WHITE);
            btnViewProduct5.setBackground(new Color(0, 0, 0));
            btnAddToCart5.setForeground(Color.WHITE);
            btnAddToCart5.setBackground(new Color(0, 0, 0));
            btnPrice5.setForeground(Color.WHITE);
            btnPrice5.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel5, btnViewProduct5, btnAddToCart5, btnPrice5));

            // Product 6
            productLabel6 = new JLabel();
            productLabel6.setIcon(new ImageIcon(new ImageIcon("./Images/serums/6.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct6 = new JButton("View Product");
            btnAddToCart6 = new JButton("Add to Cart");
            btnPrice6 = new JButton("Price");
            btnViewProduct6.setForeground(Color.WHITE);
            btnViewProduct6.setBackground(new Color(0, 0, 0));
            btnAddToCart6.setForeground(Color.WHITE);
            btnAddToCart6.setBackground(new Color(0, 0, 0));
            btnPrice6.setForeground(Color.WHITE);
            btnPrice6.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel6, btnViewProduct6, btnAddToCart6, btnPrice6));

            // Product 7
            productLabel7 = new JLabel();
            productLabel7.setIcon(new ImageIcon(new ImageIcon("./Images/serums/7.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct7 = new JButton("View Product");
            btnAddToCart7 = new JButton("Add to Cart");
            btnPrice7 = new JButton("Price");
            btnViewProduct7.setForeground(Color.WHITE);
            btnViewProduct7.setBackground(new Color(0, 0, 0));
            btnAddToCart7.setForeground(Color.WHITE);
            btnAddToCart7.setBackground(new Color(0, 0, 0));
            btnPrice7.setForeground(Color.WHITE);
            btnPrice7.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel7, btnViewProduct7, btnAddToCart7, btnPrice7));

            // Product 8
            productLabel8 = new JLabel();
            productLabel8.setIcon(new ImageIcon(new ImageIcon("./Images/serums/8.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct8 = new JButton("View Product");
            btnAddToCart8 = new JButton("Add to Cart");
            btnPrice8 = new JButton("Price");
            btnViewProduct8.setForeground(Color.WHITE);
            btnViewProduct8.setBackground(new Color(0, 0, 0));
            btnAddToCart8.setForeground(Color.WHITE);
            btnAddToCart8.setBackground(new Color(0, 0, 0));
            btnPrice8.setForeground(Color.WHITE);
            btnPrice8.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel8, btnViewProduct8, btnAddToCart8, btnPrice8));
            btnViewProduct5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnViewProduct6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            }); 
            btnViewProduct7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnViewProduct8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnAddToCart5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            btnAddToCart6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            btnAddToCart7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            btnAddToCart8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            contentPane.add(productPanel);

        }
        private void addProducts2() {
            JPanel productPanel = new JPanel();
            productPanel.setBackground(Color.WHITE);
            productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.X_AXIS));
            // Product 9
            productLabel10 = new JLabel();
            productLabel10.setIcon(new ImageIcon(new ImageIcon("./Images/serums/9.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct10 = new JButton("View Product");
            btnAddToCart10 = new JButton("Add to Cart");
            btnPrice10 = new JButton("Price");
            btnViewProduct10.setForeground(Color.WHITE);
            btnViewProduct10.setBackground(new Color(0, 0, 0));
            btnAddToCart10.setForeground(Color.WHITE);
            btnAddToCart10.setBackground(new Color(0, 0, 0));
            btnPrice10.setForeground(Color.WHITE);
            btnPrice10.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel10, btnViewProduct10, btnAddToCart10, btnPrice10));

            // Product 10
            productLabel9 = new JLabel();
            productLabel9.setIcon(new ImageIcon(new ImageIcon("./Images/serums/10.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct9 = new JButton("View Product");
            btnAddToCart9 = new JButton("Add to Cart");
            btnPrice9= new JButton("Price");
            btnViewProduct9.setForeground(Color.WHITE);
            btnViewProduct9.setBackground(new Color(0, 0, 0));
            btnAddToCart9.setForeground(Color.WHITE);
            btnAddToCart9.setBackground(new Color(0, 0, 0));
            btnPrice9.setForeground(Color.WHITE);
            btnPrice9.setBackground(new Color(0, 0, 0));

            productPanel.add(createProductPanel(productLabel9, btnViewProduct9, btnAddToCart9, btnPrice9));
            btnViewProduct10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnViewProduct9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            btnAddToCart10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            btnAddToCart9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show a dialog box when the "Add to Cart" button is clicked
                    JOptionPane.showMessageDialog(null, "Added to cart successfully!");
                }
            });
            contentPane.add(productPanel);

        }
        private JPanel createProductPanel(JLabel productLabel, JButton btnViewProduct, JButton btnAddToCart,
                JButton btnPrice) {
            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            productLabel.setAlignmentX(CENTER_ALIGNMENT);
            panel.add(productLabel);

            btnViewProduct.setAlignmentX(CENTER_ALIGNMENT);
            panel.add(btnViewProduct);

            btnAddToCart.setAlignmentX(CENTER_ALIGNMENT);
            panel.add(btnAddToCart);

            btnPrice.setAlignmentX(CENTER_ALIGNMENT);
            panel.add(btnPrice);

            return panel;
        }
        private void addFooter() {
            JPanel footerPanel = new JPanel();
            footerPanel.setBackground(Color.BLACK);

            // Email labels
            JLabel email1Label = new JLabel("Email 1: example@email.com");
            JLabel email2Label = new JLabel("Email 2: info@email.com");
            email1Label.setForeground(Color.WHITE);
            email2Label.setForeground(Color.WHITE);

            // Contact Us and Address labels
            JLabel contactUsLabel = new JLabel("Contact Us");
            JLabel addressLabel = new JLabel("Address");
            contactUsLabel.setForeground(Color.WHITE);
            addressLabel.setForeground(Color.WHITE);

            // Quote label
            JLabel quoteLabel = new JLabel("Skin care is self care");
            quoteLabel.setHorizontalAlignment(JLabel.CENTER);
            quoteLabel.setFont(new Font("Tahoma", Font.BOLD, 20));

            quoteLabel.setForeground(Color.WHITE);

            // Set layout for the footerPanel
            footerPanel.setLayout(new BorderLayout());

            // Left side panel for contactUsLabel, email1Label, and email2Label
            JPanel leftPanel = new JPanel();
            leftPanel.setLayout(new GridLayout(3, 1));
            leftPanel.setBackground(Color.BLACK);
            leftPanel.add(contactUsLabel);
            leftPanel.add(email1Label);
            leftPanel.add(email2Label);

            // Right side panel for addressLabel and placeholder label
            JPanel rightPanel = new JPanel();
            rightPanel.setLayout(new GridLayout(2, 1));
            rightPanel.setBackground(Color.BLACK);
            rightPanel.add(addressLabel);
            rightPanel.add(new JLabel("ABC City, Country")); // Placeholder for address

            // Add components to the footerPanel
            footerPanel.add(leftPanel, BorderLayout.WEST);
            footerPanel.add(rightPanel, BorderLayout.EAST);
            footerPanel.add(quoteLabel, BorderLayout.SOUTH);

            contentPane.add(footerPanel);
        }

}
