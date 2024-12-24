package User;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class manageorders extends JFrame {
    private JPanel contentPane;
    private JTable orderTable;

    public manageorders() {
        setTitle("Manage Orders - Admin Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300, 700);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.GRAY);
        JLabel titleLabel = new JLabel("Manage Orders");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(titleLabel, BorderLayout.NORTH);

        // Sample order details, you should replace this with your actual data
        String[][] orderData = {
                {"User1", "UserID1", "Product1", "ProductID1", "5", "Processing",""},
                {"User2", "UserID2", "Product2", "ProductID2", "3", "Packed",""},
                {"User3", "UserID3", "Product3", "ProductID3", "2", "Shipped",""}
        };

        String[] columnNames = {"User Name", "User ID", "Product Name", "Product ID", "Quantity", "Status","Change Status"};
        
        orderTable = new JTable(orderData, columnNames);
        JScrollPane scrollPane = new JScrollPane(orderTable);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        setContentPane(contentPane);

        // Create a custom renderer to add the "Update Status" button in the last column
        orderTable.getColumnModel().getColumn(columnNames.length - 1).setCellRenderer(new ButtonRenderer());
        orderTable.getColumnModel().getColumn(columnNames.length - 1).setCellEditor(new ButtonEditor(new JTextField()));

        // Update Status Button Action
        orderTable.getColumnModel().getColumn(columnNames.length - 1).getCellEditor().addCellEditorListener(new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                int row = orderTable.getSelectedRow();
                updateOrderStatus(row);
            }

            @Override
            public void editingCanceled(ChangeEvent e) {
                // Do nothing
            }
        });

        setVisible(true);
        
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the adminhome JFrame
                adminhome adminHomeFrame = new adminhome();

                // Make the adminhome JFrame visible
                adminHomeFrame.setVisible(true);

                // Hide the current JFrame (if you want to close it, you can use setDefaultCloseOperation)
                dispose();
            }
        });
//         // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(backButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(contentPane);
        setVisible(true);
    }

    private void updateOrderStatus(int row) {
        if (row != -1) {
            // Fetch the order details from the selected row
            String userName = (String) orderTable.getValueAt(row, 0);
            String userId = (String) orderTable.getValueAt(row, 1);
            String productName = (String) orderTable.getValueAt(row, 2);
            String productId = (String) orderTable.getValueAt(row, 3);
            String quantity = (String) orderTable.getValueAt(row, 4);
            String currentStatus = (String) orderTable.getValueAt(row, 5);

            // Show a dropdown menu with different statuses
            String[] statuses = {"Processing", "Packed", "Shipped", "Delivered"};
            String selectedStatus = (String) JOptionPane.showInputDialog(this, "Select Status:", "Update Status",
                    JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);

            if (selectedStatus != null) {
                // Show a confirmation dialog
                int confirmResult = JOptionPane.showConfirmDialog(this,
                        "Update order status for:\nUser: " + userName +
                                "\nProduct: " + productName +
                                "\nQuantity: " + quantity +
                                "\nCurrent Status: " + currentStatus +
                                "\nNew Status: " + selectedStatus,
                        "Confirmation", JOptionPane.YES_NO_OPTION);

                if (confirmResult == JOptionPane.YES_OPTION) {
                    // Perform the actual update here
                    orderTable.setValueAt(selectedStatus, row, 5);
                    JOptionPane.showMessageDialog(this, "Order status updated successfully.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update the status.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(manageorders::new);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new manageorders().setVisible(true);
            }
        });
    }
}

class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(isSelected ? Color.BLUE : Color.WHITE);
        setText("Update Status");
        return this;
    }
}

class ButtonEditor extends DefaultCellEditor {
    private String label;
    private boolean isPushed;

    public ButtonEditor(JTextField textField) {
        super(textField);
        setClickCountToStart(1);

        // Button click action
        editorComponent = new JButton();
        ((JButton) editorComponent).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        if (isSelected) {
            ((JButton) editorComponent).setForeground(Color.BLUE);
        } else {
            ((JButton) editorComponent).setForeground(Color.BLACK);
        }

        label = (value == null) ? "" : value.toString();
        ((JButton) editorComponent).setText(label);
        isPushed = true;
        return editorComponent;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            // Button clicked
            JOptionPane.showMessageDialog(editorComponent, "Button clicked!");
        }
        isPushed = false;
        return label;
    }

    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }
}
