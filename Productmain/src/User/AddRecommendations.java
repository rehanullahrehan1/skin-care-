package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AddRecommendations extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public AddRecommendations() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300, 730);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel(null) {
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

        int panelHeight = 200;
        int panelWidth = 650;

        JPanel panel1 = new JPanel(null){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                // Creating a black gradient background for panel 2
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel1.setBounds(10, 10, panelWidth, panelHeight);
        contentPane.add(panel1);

        JPanel panel2 = new JPanel(null){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                // Creating a black gradient background for panel 2
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel2.setBounds(panelWidth + 30, 10, panelWidth, panelHeight);
        contentPane.add(panel2);

        JPanel panel3 = new JPanel(null){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                // Creating a black gradient background for panel 2
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel3.setBounds(10, panelHeight + 30, panelWidth, panelHeight);
        contentPane.add(panel3);

        JPanel panel4 = new JPanel(null){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                // Creating a black gradient background for panel 2
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel4.setBounds(panelWidth + 30, panelHeight + 30, panelWidth, panelHeight);
        contentPane.add(panel4);

        JPanel panel5 = new JPanel(null){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                // Creating a black gradient background for panel 2
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel5.setBounds(10, (panelHeight * 2) + 50, 1300 - 30, panelHeight);
        contentPane.add(panel5);
     // Add logo at the rightmost side of panel5
        ImageIcon logoIconPanel5 = new ImageIcon("./Images/logo.PNG");
        JLabel logoLabelPanel5 = new JLabel();
        logoLabelPanel5.setIcon(new ImageIcon(logoIconPanel5.getImage().getScaledInstance(100, 60, Image.SCALE_SMOOTH)));
        int logoX = panel5.getWidth() - 120; // Positioning the logo at the rightmost side
        logoLabelPanel5.setBounds(logoX, 20, 300, 150);
        panel5.add(logoLabelPanel5);

        ImageIcon logoIcon = new ImageIcon("./Images/logo.PNG");
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon(logoIcon.getImage().getScaledInstance(100, 60, Image.SCALE_SMOOTH)));
        logoLabel.setBounds(100, 100, 100, 120);
        contentPane.add(logoLabel);

        String[] categories = {"Serums", "Moisturizer", "Sunscreen", "Cleanser", "Facewash"};

        for (int i = 0; i < categories.length; i++) {
            String category = categories[i];
            JLabel categoryLabel = new JLabel(category);
            categoryLabel.setForeground(Color.WHITE);
            categoryLabel.setFont(new Font("Arial", Font.BOLD, 18));
            categoryLabel.setBounds(20, 10, 200, 30);

            for (int j = 1; j <= 3; j++) {
                // Replace this line with the correct path to your product images
                String imagePath = "";
                switch (category) {
                    case "Serums":
                        imagePath = "./Images/serums/" + j + ".JPEG";
                        break;
                    case "Moisturizer":
                        imagePath = "./Images/moisturizers/" + j + ".JPEG";
                        break;
                    case "Sunscreen":
                        imagePath = "./Images/sunscreen/" + j + ".JPEG";
                        break;
                    case "Cleanser":
                        imagePath = "./Images/cleansers/" + j + ".JPEG";
                        break;
                    case "Facewash":
                        imagePath = "./Images/facewash/" + j + ".JPEG";
                        break;
                }
                
                

                ImageIcon productImage = new ImageIcon(imagePath);
                JLabel productLabel = new JLabel();
                productLabel.setIcon(new ImageIcon(productImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                productLabel.setBounds(20 + ((j - 1) * 120), 50, 100, 100);

                JLabel dermatologistLabel = new JLabel();
                dermatologistLabel.setForeground(Color.WHITE);
                dermatologistLabel.setBounds(20 + ((j - 1) * 120), 150, 300, 20);

                // Assign specific names to dermatologists based on the iteration
                String[] dermatologists = {"Dr. Kim", "Dr. Smith", "Dr. Han"};
                dermatologistLabel.setText(dermatologists[j - 1]);

                JLabel readArticleLabel = new JLabel("Read Article");
                readArticleLabel.setForeground(Color.BLUE);
                readArticleLabel.setBounds(20 + ((j - 1) * 120), 170, 100, 20);
                readArticleLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

              /*  // Add action listeners or mouse listeners for "Read Article" label if needed

                JLabel readArticleLabel = new JLabel("Read Article");
                readArticleLabel.setForeground(Color.BLUE);
                readArticleLabel.setBounds(20 + ((j - 1) * 120), 170, 100, 20);
                readArticleLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); */

                // Add action listeners or mouse listeners for "Read Article" label
                readArticleLabel.addMouseListener((MouseListener) new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openAddArticlePage();
                    }
                });
                
                // Add components to respective panels based on the category index
                if (i == 0) {
                    panel1.add(categoryLabel);
                    panel1.add(productLabel);
                    panel1.add(dermatologistLabel);
                    panel1.add(readArticleLabel);
                } else if (i == 1) {
                    panel2.add(categoryLabel);
                    panel2.add(productLabel);
                    panel2.add(dermatologistLabel);
                    panel2.add(readArticleLabel);
                } else if (i == 2) {
                    panel3.add(categoryLabel);
                    panel3.add(productLabel);
                    panel3.add(dermatologistLabel);
                    panel3.add(readArticleLabel);
                } else if (i == 3) {
                    panel4.add(categoryLabel);
                    panel4.add(productLabel);
                    panel4.add(dermatologistLabel);
                    panel4.add(readArticleLabel);
                } else if (i == 4) {
                    panel5.add(categoryLabel);
                    panel5.add(productLabel);
                    panel5.add(dermatologistLabel);
                    panel5.add(readArticleLabel);
                }
            }
        }
    }
	
	private void openAddArticlePage() {
        AddArticles addArticles = new AddArticles();
        addArticles.setVisible(true);
        dispose();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                AddRecommendations frame = new AddRecommendations();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
