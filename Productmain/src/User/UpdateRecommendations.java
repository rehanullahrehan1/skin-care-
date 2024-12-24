package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateRecommendations extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpdateRecommendations() {
        setTitle("Skincare Product System");
        setSize(1300, 730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the content panel
        JPanel contentPane = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                // Creating a black gradient background
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Logo panel at the top middle
        JPanel logoPanel = new JPanel();
        logoPanel.setBounds(550, 15, 200, 60);
        logoPanel.setOpaque(false); // Transparent background for the logo panel

        // Logo image
        ImageIcon logoIcon = new ImageIcon("./Images/logo.PNG");
        JLabel lblLogo = new JLabel();
        lblLogo.setIcon(new ImageIcon(logoIcon.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH)));
        logoPanel.add(lblLogo);
        contentPane.add(logoPanel);

        // Categories panels with products and update buttons
     // Paths for product images in different categories
        String[] categories = {"Serum      ", "Moisturizer", "Sunscreen  ", "Cleanser     ", "Facewash   "};

        String[][] productPaths = {
                // Serum
                {
                    "./Images/serums/2.JPEG",
                    "./Images/serums/3.JPEG",
                    "./Images/serums/4.JPEG"
                },
                // Moisturizer
                {
                    "./Images/moisturizers/1.JPEG",
                    "./Images/moisturizers/2.JPEG",
                    "./Images/moisturizers/3.JPEG"
                },
                // Sunscreen
                {
                    "./Images/sunscreen/1.JPEG",
                    "./Images/sunscreen/2.JPEG",
                    "./Images/sunscreen/7.JPEG"
                },
                // Cleanser
                {
                    "./Images/cleansers/1.JPEG",
                    "./Images/cleansers/2.JPEG",
                    "./Images/cleansers/3.JPEG"
                },
                // Facewash
                {
                    "./Images/facewash/1.JPEG",
                    "./Images/facewash/2.JPEG",
                    "./Images/facewash/3.JPEG"
                }
        };
   
        // Iterate through categories and display product images
        int yPosition = 100; // Initial y position for categories
        for (int i = 0; i < productPaths.length; i++) {
            String[] categoryProductPaths = productPaths[i];

            JPanel categoryPanel = new JPanel();
            categoryPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
            categoryPanel.setBounds(120, yPosition, 1250, 140);
            categoryPanel.setOpaque(false); // Transparent background for the category panel

            JLabel categoryLabel = new JLabel(categories[i]);
            categoryLabel.setForeground(Color.WHITE);
            categoryPanel.add(categoryLabel);

        
            JButton updateButton = new JButton("Update");
            updateButton.addActionListener(new UpdateButtonListener(categories[i]));
            categoryPanel.add(updateButton);

            
            // Displaying product images for the current category
            for (String imagePath : categoryProductPaths) {
                ImageIcon productImage = new ImageIcon(imagePath);
                JLabel productLabel = new JLabel(new ImageIcon(productImage.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                categoryPanel.add(productLabel);
            }

            contentPane.add(categoryPanel);
            yPosition += 120; // Increase y position for the next category panel
        }

        // Add Article button outside the loop
        JButton addArticleButton = new JButton("Add Article");
        addArticleButton.setBounds(1050, 20, 120, 30); // Adjusted position and size
        addArticleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddArticles settingFrame = new AddArticles();
                settingFrame.setVisible(true);
                JOptionPane.showMessageDialog(null, "Add Article functionality to be implemented.");
            }
        });
        contentPane.add(addArticleButton);

        // Add Recommendation button outside the loop
        JButton addRecommendationButton = new JButton("Add Recommendation");
        addRecommendationButton.setBounds(1050, 70, 160, 30); // Adjusted position and size
        addRecommendationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddRecommendations settingFrame = new AddRecommendations();
                settingFrame.setVisible(true);
                JOptionPane.showMessageDialog(null, "Add Recommendation functionality to be implemented.");
            }
        });
        contentPane.add(addRecommendationButton);
    

    }

    // ActionListener for Update buttons
    class UpdateButtonListener implements ActionListener {
        private String category;

        public UpdateButtonListener(String category) {
            this.category = category;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (canAddNewProduct(category)) {
                // Show a file chooser dialog to add a new product with an image
               
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Choose Product Image");
                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    // Get the selected file (product image)
                    // File selectedFile = fileChooser.getSelectedFile();

                    
                }

                String dermatologistName = (String) JOptionPane.showInputDialog(null, "Choose Dermatologist:",
                        "Select Dermatologist", JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"Dr. Kim", "Dr. Smith", "Dr. Han"}, "Dr. Kim");

                // Add logic to update the UI with the new product information
                if (dermatologistName != null) {
                    // Add the new product to the category
                    System.out.println("New Product Added to " + category);
                    System.out.println("Dermatologist Name: " + dermatologistName);
                    // Update the UI or perform other necessary actions
                }
            } else {
                JOptionPane.showMessageDialog(null, "Maximum products reached for " + category);
            }
        }

        // Check if a new product can be added to a category (limiting to 5 products)
        private boolean canAddNewProduct(String category) {
            // Add logic to check if a new product can be added to the category
            // Here, assuming a maximum of 5 products per category
            return true; // Return your condition here
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UpdateRecommendations().setVisible(true));
    }
}
