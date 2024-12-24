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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserDashBoard extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JButton btnLogin;
    private JButton btnSetting;
    private JLabel label1;
    private JButton btnBlog;
    private JComboBox<String> categoryComboBox;
    private JComboBox<String> pricefilterComboBox;
    private JButton btnSearch;
    private JButton btnSortByPrice;
    private JLabel productLabel1;
    private JLabel productLabel2;
    private JLabel productLabel3;
    private JLabel productLabel4;

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

    public UserDashBoard() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300, 806);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        addHeader();
        addWelcomeImage();
        
        addLabelProduct();
        addProducts();
        ShowMore();
        
        Moisturizers();
        addMoisturizers();
        ShowMoreM();
        
        Cleanser();
        addCleanser();
        ShowMoreC();
        
        Serums();
        addSerums();
        ShowMoreE();
        
        sunScreen();
        addsunscreen();
        ShowMoreU();
        
        Facewash();
        addFacewash();
        ShowMoreF();

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
        btnLogin = new JButton("ViewCart");
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(new Color(0, 0, 0));
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 0;
        headerPanel.add(btnLogin, gbc);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the login button is clicked, open the Login.java window
                new ViewCart();
            }
        });

        btnSetting = new JButton("Setting");
        btnSetting.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnSetting.setForeground(Color.WHITE);
        btnSetting.setBackground(new Color(0, 0, 0));
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 0;
        headerPanel.add(btnSetting, gbc);
        btnSetting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the login button is clicked, open the Login.java window
                new Setting();
            }
        });
        contentPane.add(headerPanel);
    }

    private void addWelcomeImage() {
        ImageIcon welcomeImageIcon = new ImageIcon("./Images/welcomeImage.PNG");
        Image welcomeImage = welcomeImageIcon.getImage();

        int welcomeWidth = 1300;
        int welcomeHeight = 490;

        Image scaledImage1 = welcomeImage.getScaledInstance(welcomeWidth, welcomeHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledWelcome = new ImageIcon(scaledImage1);

        // Create a panel to hold the components below the welcome image
        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(Color.WHITE);
        welcomePanel.setLayout(new BoxLayout(welcomePanel, BoxLayout.X_AXIS));

        // Blog button on the left
        btnBlog = new JButton("Article");
        btnBlog.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnBlog.setForeground(Color.WHITE);
        btnBlog.setBackground(new Color(0, 0, 0));
        btnBlog.setAlignmentY(CENTER_ALIGNMENT);
        welcomePanel.add(btnBlog);
        btnBlog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the login button is clicked, open the Login.java window
                new Blog();
            }
        });
     

        // Search by Category combo box
        String[] categories = {"Cleansers", "Moisturizers", "Serums", "Sunscreen", "FaceWash"};
        categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        categoryComboBox.setForeground(new Color(0, 0, 0));
        categoryComboBox.setBackground(Color.WHITE);
        welcomePanel.add(categoryComboBox);
        
//        welcomePanel.add(Box.createRigidArea(new Dimension(20, 0)));
        btnSearch = new JButton("Search Category");
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnSearch.setBackground(new Color(0, 0, 0));
        btnSearch.setBounds(295, 545, 162, 38);
        welcomePanel.add(btnSearch);
        // Add some spacing between combo boxes
        welcomePanel.add(Box.createRigidArea(new Dimension(20, 0)));

        // Sort by Price combo box
        String[] priceFilters = {"Low to High", "High to Low"};
        pricefilterComboBox = new JComboBox<>(priceFilters);
        pricefilterComboBox.setForeground(new Color(0, 0, 0));
        pricefilterComboBox.setBackground(Color.WHITE);
        pricefilterComboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        welcomePanel.add(pricefilterComboBox);
        
        //welcomePanel.add(Box.createRigidArea(new Dimension(20, 0)));
        btnSortByPrice = new JButton("Sort by Price");
        btnSortByPrice.setForeground(Color.WHITE);
        btnSortByPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnSortByPrice.setBackground(new Color(0, 0, 0));
        btnSortByPrice.setBounds(874, 545, 162, 38);
        welcomePanel.add(btnSortByPrice);
        // Add the welcome image panel to the contentPane
        label1 = new JLabel(scaledWelcome);
        label1.setAlignmentX(CENTER_ALIGNMENT);
        contentPane.add(label1);

        // Add the welcome panel with the components below the welcome image
        contentPane.add(welcomePanel);
    }

private void addLabelProduct() {
	JPanel label2=new JPanel();
	label2.setBackground(Color.WHITE);
	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
	
	
	JLabel labelnew=new JLabel("New Products");
	labelnew.setFont(new Font("Tahoma", Font.BOLD, 30));
	labelnew.setForeground(Color.BLACK);
	label2.add(Box.createRigidArea(new Dimension(0, 100)));
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
        productLabel1.setIcon(new ImageIcon(new ImageIcon("./Images/product1.PNG").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
        btnViewProduct1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the login button is clicked, open the Login.java window
                new Viewproduct();
            }
        });

        // Product 2
        productLabel2 = new JLabel();
        productLabel2.setIcon(new ImageIcon(new ImageIcon("./Images/product2.PNG").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
        btnViewProduct2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the login button is clicked, open the Login.java window
                new Viewproduct();
            }
        });
        // Product 3
        productLabel3 = new JLabel();
        productLabel3.setIcon(new ImageIcon(new ImageIcon("./Images/product3.PNG").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
        btnViewProduct3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the login button is clicked, open the Login.java window
                new Viewproduct();
            }
        });
        // Product 4
        productLabel4 = new JLabel();
        productLabel4.setIcon(new ImageIcon(new ImageIcon("./Images/product4.PNG").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
    private void ShowMore() {
    	JPanel label2=new JPanel();
    	label2.setBackground(Color.WHITE);
    	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
    	
    	
    	JLabel labelnew=new JLabel("Show More...");
    	labelnew.setFont(new Font("Tahoma", Font.BOLD, 20));
    	labelnew.setForeground(Color.BLACK);
    	label2.add(Box.createRigidArea(new Dimension(0, 100)));
    	label2.add(labelnew);
    	label2.add(Box.createRigidArea(new Dimension(0, 60)));
    	labelnew.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	Allproducts allproducts = new Allproducts();
            	allproducts.setVisible(true);
            }
        });
    	contentPane.add(label2);

    }
    
    ///Moisturizers
    private void Moisturizers() {
    	JPanel label2=new JPanel();
    	label2.setBackground(Color.WHITE);
    	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
    	
    	
    	JLabel labelnew=new JLabel("Moisturizers");
    	labelnew.setFont(new Font("Tahoma", Font.BOLD, 30));
    	labelnew.setForeground(Color.BLACK);
    	label2.add(Box.createRigidArea(new Dimension(0, 100)));
    	label2.add(labelnew);
    	label2.add(Box.createRigidArea(new Dimension(0, 60)));

    	contentPane.add(label2);

    }
        private void addMoisturizers() {
            JPanel productPanel = new JPanel();
            productPanel.setBackground(Color.WHITE);
            productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.X_AXIS));

         // Product 1
            productLabel1 = new JLabel();
            productLabel1.setIcon(new ImageIcon(new ImageIcon("./Images/moisturizers/1.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
            btnViewProduct1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            
            // Product 2
            productLabel2 = new JLabel();
            productLabel2.setIcon(new ImageIcon(new ImageIcon("./Images/moisturizers/2.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
            btnViewProduct2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            // Product 3
            productLabel3 = new JLabel();
            productLabel3.setIcon(new ImageIcon(new ImageIcon("./Images/moisturizers/3.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
            btnViewProduct3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When the login button is clicked, open the Login.java window
                    new Viewproduct();
                }
            });
            // Product 4
            productLabel4 = new JLabel();
            productLabel4.setIcon(new ImageIcon(new ImageIcon("./Images/moisturizers/4.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
            btnViewProduct4 = new JButton("View Product");
            btnAddToCart4 = new JButton("Add to Cart");
            btnPrice4 = new JButton("Price");
            btnViewProduct4.setForeground(Color.WHITE);
            btnViewProduct4.setBackground(new Color(0, 0, 0));
            btnAddToCart4.setForeground(Color.WHITE);
            btnAddToCart4.setBackground(new Color(0, 0, 0));
            btnPrice4.setForeground(Color.WHITE);
            btnPrice4.setBackground(new Color(0, 0, 0));

            productPanel.add(createMoisturizersPanel(productLabel4, btnViewProduct4, btnAddToCart4, btnPrice4));
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

        private JPanel createMoisturizersPanel(JLabel productLabel, JButton btnViewProduct, JButton btnAddToCart,
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
       
        private void ShowMoreM() {
        	JPanel label2=new JPanel();
        	label2.setBackground(Color.WHITE);
        	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
        	
        	
        	JLabel labelnew=new JLabel("Show More...");
        	labelnew.setFont(new Font("Tahoma", Font.BOLD, 20));
        	labelnew.setForeground(Color.BLACK);
        	label2.add(Box.createRigidArea(new Dimension(0, 100)));
        	label2.add(labelnew);
        	label2.add(Box.createRigidArea(new Dimension(0, 60)));

        	contentPane.add(label2);
        	labelnew.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Open the Signup.java page when the label is clicked
                	Moisturizers moisturizers = new Moisturizers();
                    moisturizers.setVisible(true);
                }
            });
        }
        
        //Cleanser
        private void Cleanser() {
        	JPanel label2=new JPanel();
        	label2.setBackground(Color.WHITE);
        	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
        	
        	
        	JLabel labelnew=new JLabel("Cleansers");
        	labelnew.setFont(new Font("Tahoma", Font.BOLD, 30));
        	labelnew.setForeground(Color.BLACK);
        	label2.add(Box.createRigidArea(new Dimension(0, 100)));
        	label2.add(labelnew);
        	label2.add(Box.createRigidArea(new Dimension(0, 60)));

        	contentPane.add(label2);

        }
            private void addCleanser() {
                JPanel productPanel = new JPanel();
                productPanel.setBackground(Color.WHITE);
                productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.X_AXIS));

             // Product 1
                productLabel1 = new JLabel();
                productLabel1.setIcon(new ImageIcon(new ImageIcon("./Images/cleansers/1.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                btnViewProduct1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // When the login button is clicked, open the Login.java window
                        new Viewproduct();
                    }
                });
                // Product 2
                productLabel2 = new JLabel();
                productLabel2.setIcon(new ImageIcon(new ImageIcon("./Images/cleansers/2.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                btnViewProduct2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // When the login button is clicked, open the Login.java window
                        new Viewproduct();
                    }
                });
                // Product 3
                productLabel3 = new JLabel();
                productLabel3.setIcon(new ImageIcon(new ImageIcon("./Images/cleansers/3.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                btnViewProduct3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // When the login button is clicked, open the Login.java window
                        new Viewproduct();
                    }
                });
                // Product 4
                productLabel4 = new JLabel();
                productLabel4.setIcon(new ImageIcon(new ImageIcon("./Images/cleansers/4.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
                btnViewProduct4 = new JButton("View Product");
                btnAddToCart4 = new JButton("Add to Cart");
                btnPrice4 = new JButton("Price");
                btnViewProduct4.setForeground(Color.WHITE);
                btnViewProduct4.setBackground(new Color(0, 0, 0));
                btnAddToCart4.setForeground(Color.WHITE);
                btnAddToCart4.setBackground(new Color(0, 0, 0));
                btnPrice4.setForeground(Color.WHITE);
                btnPrice4.setBackground(new Color(0, 0, 0));

                productPanel.add(createCleanserPanel(productLabel4, btnViewProduct4, btnAddToCart4, btnPrice4));
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

            private JPanel createCleanserPanel(JLabel productLabel, JButton btnViewProduct, JButton btnAddToCart,
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
           
            private void ShowMoreC() {
            	JPanel label2=new JPanel();
            	label2.setBackground(Color.WHITE);
            	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
            	
            	
            	JLabel labelnew=new JLabel("Show More...");
            	labelnew.setFont(new Font("Tahoma", Font.BOLD, 20));
            	labelnew.setForeground(Color.BLACK);
            	label2.add(Box.createRigidArea(new Dimension(0, 100)));
            	label2.add(labelnew);
            	label2.add(Box.createRigidArea(new Dimension(0, 60)));

            	contentPane.add(label2);
            	labelnew.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // Open the Signup.java page when the label is clicked
                    	Cleansers cleansers = new Cleansers();
                    	cleansers.setVisible(true);
                    }
                });
            }
    
          ///Facewash
            private void Facewash() {
            	JPanel label2=new JPanel();
            	label2.setBackground(Color.WHITE);
            	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
            	
            	
            	JLabel labelnew=new JLabel("FaceWash");
            	labelnew.setFont(new Font("Tahoma", Font.BOLD, 30));
            	labelnew.setForeground(Color.BLACK);
            	label2.add(Box.createRigidArea(new Dimension(0, 100)));
            	label2.add(labelnew);
            	label2.add(Box.createRigidArea(new Dimension(0, 60)));

            	contentPane.add(label2);

            }
                private void addFacewash() {
                    JPanel productPanel = new JPanel();
                    productPanel.setBackground(Color.WHITE);
                    productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.X_AXIS));

                 // Product 1
                    productLabel1 = new JLabel();
                    productLabel1.setIcon(new ImageIcon(new ImageIcon("./Images/facewash/1.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                    btnViewProduct1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // When the login button is clicked, open the Login.java window
                            new Viewproduct();
                        }
                    });
                    // Product 2
                    productLabel2 = new JLabel();
                    productLabel2.setIcon(new ImageIcon(new ImageIcon("./Images/facewash/2.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                    btnViewProduct2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // When the login button is clicked, open the Login.java window
                            new Viewproduct();
                        }
                    });
                    // Product 3
                    productLabel3 = new JLabel();
                    productLabel3.setIcon(new ImageIcon(new ImageIcon("./Images/facewash/3.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                    btnViewProduct3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // When the login button is clicked, open the Login.java window
                            new Viewproduct();
                        }
                    });
                    // Product 4
                    productLabel4 = new JLabel();
                    productLabel4.setIcon(new ImageIcon(new ImageIcon("./Images/facewash/4.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
                    btnViewProduct4 = new JButton("View Product");
                    btnAddToCart4 = new JButton("Add to Cart");
                    btnPrice4 = new JButton("Price");
                    btnViewProduct4.setForeground(Color.WHITE);
                    btnViewProduct4.setBackground(new Color(0, 0, 0));
                    btnAddToCart4.setForeground(Color.WHITE);
                    btnAddToCart4.setBackground(new Color(0, 0, 0));
                    btnPrice4.setForeground(Color.WHITE);
                    btnPrice4.setBackground(new Color(0, 0, 0));

                    productPanel.add(createfacewashPanel(productLabel4, btnViewProduct4, btnAddToCart4, btnPrice4));
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

                private JPanel createfacewashPanel(JLabel productLabel, JButton btnViewProduct, JButton btnAddToCart,
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
                
                private void ShowMoreF() {
                	JPanel label2=new JPanel();
                	label2.setBackground(Color.WHITE);
                	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
                	
                	
                	JLabel labelnew=new JLabel("Show More...");
                	labelnew.setFont(new Font("Tahoma", Font.BOLD, 20));
                	labelnew.setForeground(Color.BLACK);
                	label2.add(Box.createRigidArea(new Dimension(0, 100)));
                	label2.add(labelnew);
                	label2.add(Box.createRigidArea(new Dimension(0, 60)));

                	contentPane.add(label2);
                	
                	labelnew.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            // Open the Signup.java page when the label is clicked
                        	FaceWash faceWash = new FaceWash();
                        	faceWash.setVisible(true);
                        }
                    });

                }
               
                //serums
                private void Serums() {
                	JPanel label2=new JPanel();
                	label2.setBackground(Color.WHITE);
                	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
                	
                	
                	JLabel labelnew=new JLabel("Serums");
                	labelnew.setFont(new Font("Tahoma", Font.BOLD, 30));
                	labelnew.setForeground(Color.BLACK);
                	label2.add(Box.createRigidArea(new Dimension(0, 100)));
                	label2.add(labelnew);
                	label2.add(Box.createRigidArea(new Dimension(0, 60)));

                	contentPane.add(label2);

                }
                    private void addSerums() {
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
                        btnViewProduct1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // When the login button is clicked, open the Login.java window
                                new Viewproduct();
                            }
                        });
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
                        btnViewProduct2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // When the login button is clicked, open the Login.java window
                                new Viewproduct();
                            }
                        });
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
                        btnViewProduct3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // When the login button is clicked, open the Login.java window
                                new Viewproduct();
                            }
                        });
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

                        productPanel.add(createserumsPanel(productLabel4, btnViewProduct4, btnAddToCart4, btnPrice4));
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

                    private JPanel createserumsPanel(JLabel productLabel, JButton btnViewProduct, JButton btnAddToCart,
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
                   
                    private void ShowMoreE() {
                    	JPanel label2=new JPanel();
                    	label2.setBackground(Color.WHITE);
                    	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
                    	
                    	
                    	JLabel labelnew=new JLabel("Show More...");
                    	labelnew.setFont(new Font("Tahoma", Font.BOLD, 20));
                    	labelnew.setForeground(Color.BLACK);
                    	label2.add(Box.createRigidArea(new Dimension(0, 100)));
                    	label2.add(labelnew);
                    	label2.add(Box.createRigidArea(new Dimension(0, 60)));

                    	contentPane.add(label2);

                    	
                    	labelnew.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                // Open the Signup.java page when the label is clicked
                            	Serums serums = new Serums();
                            	serums.setVisible(true);
                            }
                        });
                    }
                    
                  ///SunScreen
                    private void sunScreen() {
                    	JPanel label2=new JPanel();
                    	label2.setBackground(Color.WHITE);
                    	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
                    	
                    	
                    	JLabel labelnew=new JLabel("SunScreens");
                    	labelnew.setFont(new Font("Tahoma", Font.BOLD, 30));
                    	labelnew.setForeground(Color.BLACK);
                    	label2.add(Box.createRigidArea(new Dimension(0, 100)));
                    	label2.add(labelnew);
                    	label2.add(Box.createRigidArea(new Dimension(0, 60)));

                    	contentPane.add(label2);

                    }
                        private void addsunscreen() {
                            JPanel productPanel = new JPanel();
                            productPanel.setBackground(Color.WHITE);
                            productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.X_AXIS));

                         // Product 1
                            productLabel1 = new JLabel();
                            productLabel1.setIcon(new ImageIcon(new ImageIcon("./Images/sunscreen/1.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                            btnViewProduct1.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // When the login button is clicked, open the Login.java window
                                    new Viewproduct();
                                }
                            });
                            // Product 2
                            productLabel2 = new JLabel();
                            productLabel2.setIcon(new ImageIcon(new ImageIcon("./Images/sunscreen/2.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                            btnViewProduct2.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // When the login button is clicked, open the Login.java window
                                    new Viewproduct();
                                }
                            });
                            // Product 3
                            productLabel3 = new JLabel();
                            productLabel3.setIcon(new ImageIcon(new ImageIcon("./Images/sunscreen/3.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
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
                            btnViewProduct3.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // When the login button is clicked, open the Login.java window
                                    new Viewproduct();
                                }
                            });
                            // Product 4
                            productLabel4 = new JLabel();
                            productLabel4.setIcon(new ImageIcon(new ImageIcon("./Images/sunscreen/4.jpeg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
                            btnViewProduct4 = new JButton("View Product");
                            btnAddToCart4 = new JButton("Add to Cart");
                            btnPrice4 = new JButton("Price");
                            btnViewProduct4.setForeground(Color.WHITE);
                            btnViewProduct4.setBackground(new Color(0, 0, 0));
                            btnAddToCart4.setForeground(Color.WHITE);
                            btnAddToCart4.setBackground(new Color(0, 0, 0));
                            btnPrice4.setForeground(Color.WHITE);
                            btnPrice4.setBackground(new Color(0, 0, 0));

                            productPanel.add(createsunscreenPanel(productLabel4, btnViewProduct4, btnAddToCart4, btnPrice4));
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

                        private JPanel createsunscreenPanel(JLabel productLabel, JButton btnViewProduct, JButton btnAddToCart,
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
                       
                        
                        private void ShowMoreU() {
                        	JPanel label2=new JPanel();
                        	label2.setBackground(Color.WHITE);
                        	label2.setLayout(new BoxLayout(label2, BoxLayout.X_AXIS));
                        	
                        	
                        	JLabel labelnew=new JLabel("Show More...");
                        	labelnew.setFont(new Font("Tahoma", Font.BOLD, 20));
                        	labelnew.setForeground(Color.BLACK);
                        	label2.add(Box.createRigidArea(new Dimension(0, 100)));
                        	label2.add(labelnew);
                        	label2.add(Box.createRigidArea(new Dimension(0, 60)));

                        	contentPane.add(label2);
                        	
                        	labelnew.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    // Open the Signup.java page when the label is clicked
                                	Sunscreen sunscreen = new Sunscreen();
                                	sunscreen.setVisible(true);
                                }
                            });

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
