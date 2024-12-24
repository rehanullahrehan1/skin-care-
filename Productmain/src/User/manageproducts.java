package User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class manageproducts extends JFrame {
    private JPanel contentPane;
    private JTable userTable;

    public manageproducts() {
    	
        setTitle("Manage Products - Admin Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 700);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setBackground(Color.GRAY);
        JLabel titleLabel = new JLabel("Manage Products");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(titleLabel, BorderLayout.NORTH);

        // Sample user details, you should replace this with your actual data
        String[][] userData = {
                {"PID1", "Skinwhte herbal", "Facewash", "2023-11-11", "2025-11-11", "water,mint,herbs"},
                {"PID2","Vitamin-c", "Serum", "2023-11-11", "2025-11-11", "water,mint,herbs"},
                {"PID3", "Nivea Soft", "Moistureizer", "2023-11-11", "2025-11-11", "water,glycerin"}
        };

        String[] columnNames = {"Product Id","Product Name","Product Category","Manufacturing Date","Expiry Date","Ingredients"};

        DefaultTableModel model = new DefaultTableModel(userData, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        userTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(userTable);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Add buttons for moving back to the admin page and deleting a user
        JPanel buttonPanel = new JPanel();
        JButton backButton = new JButton("Back to Admin Page");
//        setSize(400, 200);
        setLocationRelativeTo(null);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the SecondPage
                adminhome AH = new adminhome();

                // Make the SecondPage visible
                AH.setVisible(true);

                // Hide the FirstPage (if you want to close it, you can use setDefaultCloseOperation)
                dispose();
            }
        });
        JButton deleteUserButton = new JButton("Delete Product");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the action to move back to the admin page
                JOptionPane.showMessageDialog(manageproducts.this, "Back to Admin Page");
            }
        });

        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = userTable.getSelectedRow();
                if (selectedRow != -1) {
                    // Ask for confirmation before deleting the user
                    int choice = JOptionPane.showConfirmDialog(manageproducts.this,
                            "Are you sure you want to delete this user?",
                            "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        // Delete the selected user
                        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                        model.removeRow(selectedRow);
                    }
                } else {
                    JOptionPane.showMessageDialog(manageproducts.this, "Please select a user to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonPanel.add(backButton);
        buttonPanel.add(deleteUserButton);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(contentPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(manageproducts::new);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new manageproducts().setVisible(true);
            }
        });
    }
}
