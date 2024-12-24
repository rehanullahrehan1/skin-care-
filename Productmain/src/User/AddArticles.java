package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddArticles extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel panel;
    private JLabel logoLabel;
    private JButton[] dermatologistButtons;
    private JTextArea articlesTextArea;

    public AddArticles() {
        setTitle("Add Articles");
        setSize(1300, 730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window on screen

        panel = new JPanel();
        panel.setLayout(null);

        // Black gradient background
        GradientPanel background = new GradientPanel();
        background.setLayout(new BorderLayout());
        panel.add(background);

        // Logo in the upper-left corner
        ImageIcon logoIcon = new ImageIcon("./Images/logo.PNG");
        logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(10, 10, 100, 50);
        panel.add(logoLabel);

        // Creating 3 dermatologist buttons
        dermatologistButtons = new JButton[3];
        String[] dermatologists = {"Dr. Kim", "Dr. Smith", "Dr. Han"};
        for (int i = 0; i < 3; i++) {
            dermatologistButtons[i] = new JButton(dermatologists[i]);
            dermatologistButtons[i].addActionListener(new DermatologistButtonListener());
            panel.add(dermatologistButtons[i]);
        }

        dermatologistButtons[0].setBounds(550, 250, 200, 40);
        dermatologistButtons[0].setForeground(Color.BLACK);
        dermatologistButtons[0].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dermatologistButtons[0].setBackground(Color.WHITE);
        dermatologistButtons[1].setBounds(550, 300, 200, 40);
        dermatologistButtons[1].setForeground(Color.BLACK);
        dermatologistButtons[1].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dermatologistButtons[1].setBackground(Color.WHITE);
        dermatologistButtons[2].setBounds(550, 350, 200, 40);
        dermatologistButtons[2].setForeground(Color.BLACK);
        dermatologistButtons[2].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dermatologistButtons[2].setBackground(Color.WHITE);

        // TextArea to display articles
        articlesTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(articlesTextArea);
        scrollPane.setBounds(50, 400, 1160, 200);
        panel.add(scrollPane);

        add(panel); // Add the main panel to the frame
        setVisible(true);
    }

    // ActionListener for dermatologist buttons
    class DermatologistButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<String> productCombo = new JComboBox<>(new String[]{"Serum", "Moisturizer", "Sunscreen", "Cleanser", "Facewash"});
            int choice = JOptionPane.showOptionDialog(null, productCombo, "Select a product category", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

            if (choice == JOptionPane.OK_OPTION) {
                String selectedProduct = (String) productCombo.getSelectedItem();
                String dermatologistName = ((JButton) e.getSource()).getText();
                String article = getArticleForDermatologist(dermatologistName, selectedProduct);
                articlesTextArea.setText(article);
            }
        }

        private String getArticleForDermatologist(String dermatologistName, String product) {
            // Simulated articles for demonstration
            return dermatologistName + "'s article on " + product + ":\nSkincare is a vital aspect of maintaining healthy and radiant skin. \nIt involves a routine that encompasses various practices and products aimed at nourishing, protecting, and rejuvenating the skin. \nAn effective skincare regimen typically starts with cleansing to remove impurities, excess oil, and makeup residue. \nThis is followed by toning to balance the skin's pH levels and preparing it for better absorption of subsequent products. \nMoisturizing is essential to keep the skin hydrated and prevent moisture loss. Additionally, using sunscreen daily helps shield the skin from harmful UV rays, minimizing the risk of sun damage and premature aging. \nFurthermore, incorporating serums, eye creams, and exfoliation into the routine can address specific concerns like wrinkles, dark spots, and uneven texture. \nBesides using quality skincare products suitable for one's skin type, a healthy lifestyle involving a balanced diet, regular hydration, adequate sleep, \nand minimizing stress also contributes significantly to achieving glowing and healthy skin.";
        }
    }

    // Custom JPanel for gradient background
    class GradientPanel extends JPanel {
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
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddArticles());
    }
}
