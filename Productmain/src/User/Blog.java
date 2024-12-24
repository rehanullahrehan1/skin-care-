package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Blog {

    private static JLabel productLabel1 = new JLabel();
    private static JLabel productLabel2 = new JLabel();
    private static JLabel productLabel3 = new JLabel();

   public Blog() {
            createAndShowGUI();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Skincare Products");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1300, 806);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        // Skincare Product 1
        productLabel1.setIcon(new ImageIcon(new ImageIcon("./Images/product2.PNG").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));

        JPanel productPanel1 = createProductPanel("Ponds", "Subject: Product Recommendation for Oily Skin\r\n"
        		+ "\r\n"
        		+ "Dear [Recipient],\r\n"
        		+ "\r\n"
        		+ "I hope this message finds you well. I wanted to share a skincare recommendation that I believe could greatly benefit individuals with oily skin, based on personal experience and positive feedback from others.\r\n"
        		+ "\r\n"
        		+ "I highly recommend [Product Name], a specialized skincare product designed to address the unique needs of oily skin types. Here are a few reasons why I believe this product is worth considering:\r\n"
        		+ "\r\n"
        		+ "1. **Mattifying Formula:** The product features a lightweight and mattifying formula that helps control excess oil production throughout the day, providing a matte finish without compromising hydration.\r\n"
        		+ "\r\n"
        		+ "2. **Non-Comedogenic Ingredients:** [Product Name] is formulated with non-comedogenic ingredients, which means it won't clog pores. This is crucial for individuals with oily skin, as it helps prevent the development of acne and breakouts.\r\n"
        		+ "\r\n"
        		+ "3. **Oil-Balancing Actives:** The active ingredients in this product are specifically chosen to regulate sebum production, keeping oily skin in check without over-drying or causing irritation.\r\n"
        		+ "\r\n"
        		+ "4. **Long-Lasting Results:** Users have reported long-lasting results with regular use, including a reduction in shine, minimized pores, and an overall improvement in skin texture.\r\n"
        		+ "\r\n"
        		+ "5. **Dermatologist-Tested:** [Product Name] has undergone dermatologist testing to ensure its safety and efficacy. It is suitable for daily use and is gentle enough for sensitive skin.\r\n"
        		+ "\r\n"
        		+ "I have personally seen positive changes in my skin since incorporating [Product Name] into my skincare routine, and I believe it could be a valuable addition to your regimen as well.\r\n"
        		+ "\r\n"
        		+ "Please note that individual results may vary, and it's always a good idea to perform a patch test before fully incorporating any new skincare product into your routine. If you have any specific concerns or questions about your skin type, I recommend consulting with a dermatologist for personalized advice.\r\n"
        		+ "\r\n"
        		+ "I hope you find this recommendation helpful, and I'm confident that [Product Name] can make a positive difference in managing oily skin. If you have any further questions or would like additional information, feel free to reach out.\r\n"
        		+ "\r\n"
        		+ "Best regards,\r\n"
        		+ "[Medi]", productLabel1);
        panel.add(productPanel1);

        // Skincare Product 2
        productLabel2.setIcon(new ImageIcon(new ImageIcon("./Images/product1.PNG").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));

        JPanel productPanel2 = createProductPanel("DerMi Oily 2", "Subject: Product Recommendation for Oily Skin\r\n"
        		+ "\r\n"
        		+ "Dear [Recipient],\r\n"
        		+ "\r\n"
        		+ "I hope this message finds you well. I wanted to share a skincare recommendation that I believe could greatly benefit individuals with oily skin, based on personal experience and positive feedback from others.\r\n"
        		+ "\r\n"
        		+ "I highly recommend [Product Name], a specialized skincare product designed to address the unique needs of oily skin types. Here are a few reasons why I believe this product is worth considering:\r\n"
        		+ "\r\n"
        		+ "1. **Mattifying Formula:** The product features a lightweight and mattifying formula that helps control excess oil production throughout the day, providing a matte finish without compromising hydration.\r\n"
        		+ "\r\n"
        		+ "2. **Non-Comedogenic Ingredients:** [Product Name] is formulated with non-comedogenic ingredients, which means it won't clog pores. This is crucial for individuals with oily skin, as it helps prevent the development of acne and breakouts.\r\n"
        		+ "\r\n"
        		+ "3. **Oil-Balancing Actives:** The active ingredients in this product are specifically chosen to regulate sebum production, keeping oily skin in check without over-drying or causing irritation.\r\n"
        		+ "\r\n"
        		+ "4. **Long-Lasting Results:** Users have reported long-lasting results with regular use, including a reduction in shine, minimized pores, and an overall improvement in skin texture.\r\n"
        		+ "\r\n"
        		+ "5. **Dermatologist-Tested:** [Product Name] has undergone dermatologist testing to ensure its safety and efficacy. It is suitable for daily use and is gentle enough for sensitive skin.\r\n"
        		+ "\r\n"
        		+ "I have personally seen positive changes in my skin since incorporating [Product Name] into my skincare routine, and I believe it could be a valuable addition to your regimen as well.\r\n"
        		+ "\r\n"
        		+ "Please note that individual results may vary, and it's always a good idea to perform a patch test before fully incorporating any new skincare product into your routine. If you have any specific concerns or questions about your skin type, I recommend consulting with a dermatologist for personalized advice.\r\n"
        		+ "\r\n"
        		+ "I hope you find this recommendation helpful, and I'm confident that [Product Name] can make a positive difference in managing oily skin. If you have any further questions or would like additional information, feel free to reach out.\r\n"
        		+ "\r\n"
        		+ "Best regards,\r\n"
        		+ "[Medi]", productLabel2);
        panel.add(productPanel2);

        // Skincare Product 3
        productLabel3.setIcon(new ImageIcon(new ImageIcon("./Images/product3.PNG").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));

        JPanel productPanel3 = createProductPanel("Tibet", "Subject: Product Recommendation for Oily Skin\r\n"
        		+ "\r\n"
        		+ "Dear [Recipient],\r\n"
        		+ "\r\n"
        		+ "I hope this message finds you well. I wanted to share a skincare recommendation that I believe could greatly benefit individuals with oily skin, based on personal experience and positive feedback from others.\r\n"
        		+ "\r\n"
        		+ "I highly recommend [Product Name], a specialized skincare product designed to address the unique needs of oily skin types. Here are a few reasons why I believe this product is worth considering:\r\n"
        		+ "\r\n"
        		+ "1. **Mattifying Formula:** The product features a lightweight and mattifying formula that helps control excess oil production throughout the day, providing a matte finish without compromising hydration.\r\n"
        		+ "\r\n"
        		+ "2. **Non-Comedogenic Ingredients:** [Product Name] is formulated with non-comedogenic ingredients, which means it won't clog pores. This is crucial for individuals with oily skin, as it helps prevent the development of acne and breakouts.\r\n"
        		+ "\r\n"
        		+ "3. **Oil-Balancing Actives:** The active ingredients in this product are specifically chosen to regulate sebum production, keeping oily skin in check without over-drying or causing irritation.\r\n"
        		+ "\r\n"
        		+ "4. **Long-Lasting Results:** Users have reported long-lasting results with regular use, including a reduction in shine, minimized pores, and an overall improvement in skin texture.\r\n"
        		+ "\r\n"
        		+ "5. **Dermatologist-Tested:** [Product Name] has undergone dermatologist testing to ensure its safety and efficacy. It is suitable for daily use and is gentle enough for sensitive skin.\r\n"
        		+ "\r\n"
        		+ "I have personally seen positive changes in my skin since incorporating [Product Name] into my skincare routine, and I believe it could be a valuable addition to your regimen as well.\r\n"
        		+ "\r\n"
        		+ "Please note that individual results may vary, and it's always a good idea to perform a patch test before fully incorporating any new skincare product into your routine. If you have any specific concerns or questions about your skin type, I recommend consulting with a dermatologist for personalized advice.\r\n"
        		+ "\r\n"
        		+ "I hope you find this recommendation helpful, and I'm confident that [Product Name] can make a positive difference in managing oily skin. If you have any further questions or would like additional information, feel free to reach out.\r\n"
        		+ "\r\n"
        		+ "Best regards,\r\n"
        		+ "Medi", productLabel3);
        panel.add(productPanel3);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static JPanel createProductPanel(String productName, String description, JLabel imageLabel) {
        JPanel productPanel = new JPanel(new BorderLayout());

        JLabel nameLabel = new JLabel(productName);
        JTextArea descriptionArea = new JTextArea(description);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);

        JButton readMoreButton = new JButton("Read More");
        readMoreButton.setBackground(Color.BLACK);
        readMoreButton.setForeground(Color.WHITE);
        readMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showReadMorePage(productName, description, imageLabel);
            }
        });

        productPanel.setBackground(Color.white);
        productPanel.add(nameLabel, BorderLayout.NORTH);
        productPanel.add(imageLabel, BorderLayout.WEST);
        productPanel.add(descriptionArea, BorderLayout.CENTER);
        productPanel.add(readMoreButton, BorderLayout.SOUTH);

        return productPanel;
    }

    private static void showReadMorePage(String productName, String description, JLabel productImageLabel) {
        JFrame readMoreFrame = new JFrame("Read More - " + productName);
        readMoreFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        readMoreFrame.setSize(1300, 806);

        JTextArea readMoreTextArea = new JTextArea(description);
        readMoreTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(readMoreTextArea);

        ImageIcon dermatologistImage = new ImageIcon("./Images/dermatologist.jpg");
        JLabel dermatologistLabel = new JLabel(dermatologistImage);
        dermatologistLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        dermatologistLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        JLabel dermatologistDetailsLabel = new JLabel("Dr. Medi\nQualification: MD in Dermatology");

        JPanel detailsPanel = new JPanel(new BorderLayout());

        // Left side (Product Image and Name)
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.WHITE);  // Set background color for better visibility
        leftPanel.add(productImageLabel, BorderLayout.NORTH);
        leftPanel.add(new JLabel(productName), BorderLayout.SOUTH);

        // Right side (Dermatologist Image, Name, and Description)
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBackground(Color.WHITE);  // Set background color for better visibility
        rightPanel.add(dermatologistLabel, BorderLayout.NORTH);
        rightPanel.add(new JLabel("Dermatologist"), BorderLayout.SOUTH);
        rightPanel.add(dermatologistDetailsLabel, BorderLayout.CENTER);

        // Combine left and right panels
        detailsPanel.add(leftPanel, BorderLayout.WEST);
        detailsPanel.add(rightPanel, BorderLayout.EAST);

        // Add the central text area
        detailsPanel.add(scrollPane, BorderLayout.CENTER);

        // Back to Home Page Button
        JButton backButton = new JButton("Back to Home Page");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> {
        	new UserDashBoard();
            readMoreFrame.dispose();  // Close the current frame
            
        });
        detailsPanel.add(backButton, BorderLayout.SOUTH);

        readMoreFrame.add(detailsPanel);
        readMoreFrame.setVisible(true);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}