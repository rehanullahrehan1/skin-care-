package User;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class adminhome extends JFrame {

    private static final long serialVersionUID = 1L;
    private static JPanel contentPane;
    private JTextField textField;
    private JLabel label;
    private JButton btnLogin;
    private JButton btnSetting;
    private JLabel label1;
    private JScrollPane scrollpane;
    private JButton btnAddUsers;
    private JButton btnManageOrders;
    private JButton btnAddProducts;
    private JButton btnAllUsers;
    private JButton btnAllProducts;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    adminhome frame = new adminhome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public adminhome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300, 806);
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
        JLabel lblTitle = new JLabel("Welcome Admin!");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitle.setBounds(550, 50, 650, 30);
        contentPane.add(lblTitle);
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBackground(new Color(255, 255, 255));
        formPanel.setBounds(200, 100, 900, 500);
        contentPane.add(formPanel);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);

        scrollpane = new JScrollPane(contentPane);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setBounds(0, 0, 0, 0);    
        getContentPane().add(scrollpane);
        
        //allign buttons 3x2
        int frameWidth = 1300;

        JPanel buttonPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        buttonPanel.setBounds((frameWidth - (120 * 3 + 10 * 2)) / 2, 550, 120 * 3 + 10 * 2, 60);
        contentPane.add(buttonPanel);
        
        btnAddUsers = new JButton("Add Users");
        btnAddUsers.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAddUsers.setBounds(170, 120, 150, 120);
        btnAddUsers.setForeground(Color.WHITE);
        btnAddUsers.setBackground(new Color(0, 0, 0));
        formPanel.add(btnAddUsers);
        btnAddUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the addusers JFrame
                addusers addUsersFrame = new addusers();

                // Make the addusers JFrame visible
                addUsersFrame.setVisible(true);
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                currentFrame.setVisible(false);

                // Hide the current JFrame (if you want to close it, you can use setDefaultCloseOperation)
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                topFrame.dispose();
            }
        });

        btnManageOrders = new JButton("Manage Orders");
        btnManageOrders.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnManageOrders.setBounds(350, 120, 150, 120);
        btnManageOrders.setForeground(Color.WHITE);
        btnManageOrders.setBackground(new Color(0, 0, 0));
        formPanel.add(btnManageOrders);
        btnManageOrders.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the manageorders JFrame
                manageorders manageOrdersFrame = new manageorders();

                // Make the manageorders JFrame visible
                manageOrdersFrame.setVisible(true);
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                currentFrame.setVisible(false);

                // Hide the current JFrame (if you want to close it, you can use setDefaultCloseOperation)
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                topFrame.dispose();
            }
        });

        btnAddProducts = new JButton("Add Products");
        btnAddProducts.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAddProducts.setBounds(530, 120, 150, 120);
        btnAddProducts.setForeground(Color.WHITE);
        btnAddProducts.setBackground(new Color(0, 0, 0));
        formPanel.add(btnAddProducts);
        btnAddProducts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the addproducts JFrame
                addproducts addProductsFrame = new addproducts();

                // Make the addproducts JFrame visible
                addProductsFrame.setVisible(true);
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                currentFrame.setVisible(false);

                // Hide the current JFrame (if you want to close it, you can use setDefaultCloseOperation)
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                topFrame.dispose();
            }
        });

        btnAllUsers = new JButton("Manage Users");
        btnAllUsers.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAllUsers.setBounds(250, 270, 150, 120);
        btnAllUsers.setForeground(Color.WHITE);
        btnAllUsers.setBackground(new Color(0, 0, 0));
        formPanel.add(btnAllUsers);
        btnAllUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the addproducts JFrame
                manageusers addProductsFrame = new manageusers();

                // Make the addproducts JFrame visible
                addProductsFrame.setVisible(true);
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                currentFrame.setVisible(false);

                // Hide the current JFrame (if you want to close it, you can use setDefaultCloseOperation)
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                topFrame.dispose();
            }
        });

        btnAllProducts = new JButton("Manage Products");
        btnAllProducts.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAllProducts.setBounds(430, 270, 150, 120);
        btnAllProducts.setForeground(Color.WHITE);
        btnAllProducts.setBackground(new Color(0, 0, 0));
        formPanel.add(btnAllProducts);
        btnAllProducts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the addproducts JFrame
                manageproducts addProductsFrame = new manageproducts();

                // Make the addproducts JFrame visible
                addProductsFrame.setVisible(true);
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                currentFrame.setVisible(false);

                // Hide the current JFrame (if you want to close it, you can use setDefaultCloseOperation)
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(adminhome.this);
                topFrame.dispose();
            }
        });

        ImageIcon originalLogoIcon = new ImageIcon("./Images/logo.PNG");
        Image originalImage = originalLogoIcon.getImage();

        int logoWidth = 70;
        int logoHeight = 45;

        Image scaledImage = originalImage.getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledLogoIcon = new ImageIcon(scaledImage);
        label = new JLabel(scaledLogoIcon);
        label.setBackground(new Color(255, 255, 0));
        label.setBounds(5, 5, logoWidth, logoHeight);
        contentPane.add(label);

        btnLogin = new JButton("Logout");
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(new Color(0, 0, 0));
        btnLogin.setBounds(1069, 10, 89, 38);
        contentPane.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to close this window?", "Close Window", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    dispose(); // Close the current window
                }
            }
        });

        btnSetting = new JButton("Setting");
        btnSetting.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnSetting.setForeground(Color.WHITE);
        btnSetting.setBackground(new Color(0, 0, 0));
        btnSetting.setBounds(1155, 10, 98, 38);
        contentPane.add(btnSetting);
        btnSetting.addActionListener(e -> {
            Setting settingFrame=new Setting();
            settingFrame.setVisible(true);
             System.out.println("Setting button clicked");
         });
    }
}
