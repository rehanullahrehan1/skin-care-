package User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class manageusers extends JFrame {
    private JPanel contentPane;
    private JTable userTable;

    public manageusers() {
    	
        setTitle("Manage Users - Admin Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 700);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setBackground(Color.GRAY);
        JLabel titleLabel = new JLabel("Manage Users");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(titleLabel, BorderLayout.NORTH);

        // Sample user details, you should replace this with your actual data
        String[][] userData = {
                {"UserID1", "John Doe", "john@example.com", "1990-01-01", "123 Main St", "123-456-7890"},
                {"UserID2", "Jane Smith", "jane@example.com", "1985-05-15", "456 Oak St", "987-654-3210"},
                {"UserID3", "Bob Johnson", "bob@example.com", "1978-12-03", "789 Pine St", "555-123-4567"}
        };

        String[] columnNames = {"User ID", "User Name", "Email", "Date of Birth", "Address", "Phone Number"};

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
        JButton deleteUserButton = new JButton("Delete User");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the action to move back to the admin page
                JOptionPane.showMessageDialog(manageusers.this, "Back to Admin Page");
            }
        });

        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = userTable.getSelectedRow();
                if (selectedRow != -1) {
                    // Ask for confirmation before deleting the user
                    int choice = JOptionPane.showConfirmDialog(manageusers.this,
                            "Are you sure you want to delete this user?",
                            "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        // Delete the selected user
                        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                        model.removeRow(selectedRow);
                    }
                } else {
                    JOptionPane.showMessageDialog(manageusers.this, "Please select a user to delete.", "Error", JOptionPane.ERROR_MESSAGE);
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
        SwingUtilities.invokeLater(manageusers::new);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new manageusers().setVisible(true);
            }
        });
    }
}
