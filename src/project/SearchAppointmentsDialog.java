/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SearchAppointmentsDialog extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private CalendarPanel calendarPanel;
    private Point initialClick;
    private List<Appointment> allAppointments;

    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);

    public SearchAppointmentsDialog(CalendarPanel calendarPanel) {
        this.calendarPanel = calendarPanel;
        
        // Frame setup
        setTitle("Search Appointments");
        setSize(500, 500);
        setUndecorated(true); // Make the JFrame undecorated
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Create and add the top panel (title and close button)
        createTopPanel();
        
        // Create and add the table for displaying appointments
        createTable();
        
        // Create and add the button panel
        createButtonPanel();     
                
        // Load appointments into the table
        loadAppointments();
        
        setVisible(true);
    }

    private void createTopPanel() {
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("All Appointments", SwingConstants.CENTER);
        JButton closeButton = new JButton("X");

        // Set colors for the top panel and title label
        topPanel.setBackground(thirdColor);
        titleLabel.setForeground(Color.WHITE);

        // Action listener for the close button
        closeButton.addActionListener(e -> dispose());

        topPanel.add(titleLabel, BorderLayout.CENTER);
        topPanel.add(closeButton, BorderLayout.EAST);

        // Add mouse listeners to the top panel for dragging the window
        topPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        topPanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Get location of window
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Determine how much the mouse moved since the initial click
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Move window to this position
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);
            }
        });

        add(topPanel, BorderLayout.NORTH);
    }

    private void createTable() {
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"ID", "Subject", "Start", "End"});
        table = new JTable(tableModel);

        // Set preferred column widths
        table.getColumnModel().getColumn(0).setPreferredWidth(40); // ID column
        table.getColumnModel().getColumn(1).setPreferredWidth(200); // Subject column
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);

        // Custom cell renderer for alternating row colors and selection color
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (isSelected) {
                    c.setBackground(Color.GRAY);
                } else {
                    c.setBackground(row % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
                }
                return c;
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void createButtonPanel() {
        JButton selectButton = new JButton("Select Appointment");
        selectButton.setBackground(primaryColor);
        selectButton.setForeground(Color.WHITE);

        // Action listener for the select button
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    LocalDate selectedDate = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 2), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    calendarPanel.navigateToDate(selectedDate);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(SearchAppointmentsDialog.this, "Please select an appointment.");
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(selectButton);
        add(buttonPanel, BorderLayout.SOUTH);
        
        JTextField searchField = new JTextField(15);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterAppointments(searchField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterAppointments(searchField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterAppointments(searchField.getText());
            }
        });        
        buttonPanel.add(searchField);        
        add(buttonPanel, BorderLayout.SOUTH);        
    }

    private void loadAppointments() {
        List<Appointment> appointments = DatabaseUtil.getAllAppointments();
        tableModel.setRowCount(0); // Clear existing data

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (Appointment appt : appointments) {
            tableModel.addRow(new Object[]{appt.getId(), appt.getSubject(), appt.getStart().format(formatter), appt.getEnd().format(formatter)});
        }
        allAppointments = DatabaseUtil.getAllAppointments();
        filterAppointments("");
    }
    
    private void filterAppointments(String query) {
        List<Appointment> filteredAppointments = allAppointments.stream()
            .filter(appt -> appt.getSubject().toLowerCase().contains(query.toLowerCase()))
            .collect(Collectors.toList());

        tableModel.setRowCount(0); // Clear existing data

        for (Appointment appt : filteredAppointments) {
            tableModel.addRow(new Object[]{
                appt.getId(),
                appt.getSubject(),
                appt.getStart().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                appt.getEnd().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            });
        }
    }
}
