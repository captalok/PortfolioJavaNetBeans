/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;

public class CalendarAppInsert extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private LocalDate selectedDate;
    private Point initialClick;

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);

    public CalendarAppInsert(LocalDate date) {
        this.selectedDate = date;
        setTitle("Appointments for " + date.toString());
        setSize(700, 400);
        setUndecorated(true);
        setLocation(50, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Appointments for " + date.toString(), SwingConstants.CENTER);
        JButton closeButton = new JButton("X");

        topPanel.setBackground(thirdColor);
        titleLabel.setForeground(Color.WHITE);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        topPanel.add(titleLabel, BorderLayout.CENTER);
        topPanel.add(closeButton, BorderLayout.EAST);

        topPanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        topPanel.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);
            }
        });

        add(topPanel, BorderLayout.NORTH);

        // Initialize components
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"ID", "Subject", "Location", "Notes", "Priority", "Start", "End"});
        table = new JTable(tableModel);

        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setPreferredWidth(20);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (isSelected) {
                    c.setBackground(Color.GRAY);
                } else if (value == null || value.toString().isEmpty()) {
                    c.setBackground(Color.BLUE);
                } else {
                    c.setBackground(row % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
                }
                return c;
            }
        };
        table.setDefaultRenderer(Object.class, renderer);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        addButton.setBackground(Color.GREEN);
        updateButton.setBackground(Color.YELLOW);
        deleteButton.setBackground(Color.RED);

        addButton.setForeground(Color.BLACK);
        updateButton.setForeground(Color.BLACK);
        deleteButton.setForeground(Color.WHITE);

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);

        loadAppointments(date);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addOrUpdateAppointment(null, selectedDate);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int apptID = (int) tableModel.getValueAt(selectedRow, 0);
                    String currentSubject = (String) tableModel.getValueAt(selectedRow, 1);
                    String currentLocation = (String) tableModel.getValueAt(selectedRow, 2);
                    String currentNotes = (String) tableModel.getValueAt(selectedRow, 3);
                    String currentPriority = (String) tableModel.getValueAt(selectedRow, 4);
                    LocalDateTime currentStart = LocalDateTime.parse((String) tableModel.getValueAt(selectedRow, 5), DATE_TIME_FORMATTER);
                    LocalDateTime currentEnd = LocalDateTime.parse((String) tableModel.getValueAt(selectedRow, 6), DATE_TIME_FORMATTER);

                    Appointment appt = new Appointment(apptID, currentSubject, currentLocation, currentNotes, currentPriority, currentStart, currentEnd);
                    addOrUpdateAppointment(appt, selectedDate);
                } else {
                    JOptionPane.showMessageDialog(CalendarAppInsert.this, "Please select an appointment to update.");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteAppointment();
            }
        });

        setVisible(true);
    }

    private void loadAppointments(LocalDate date) {
        List<Appointment> appointments = DatabaseUtil.getAppointmentsForDay(date);
        tableModel.setRowCount(0);

        for (Appointment appt : appointments) {
            tableModel.addRow(new Object[]{appt.getId(), appt.getSubject(), appt.getLocation(), appt.getNotes(), appt.getPriority(), appt.getStart().format(DATE_TIME_FORMATTER), appt.getEnd().format(DATE_TIME_FORMATTER)});
        }
    }

    private void addOrUpdateAppointment(Appointment appt, LocalDate selectedDate) {
    JPanel panel = new JPanel(new GridLayout(12, 1));
    JTextField subjectField = new JTextField();
    JTextField locationField = new JTextField();
    JTextField notesField = new JTextField();
    JTextField priorityField = new JTextField();
    JTextField startDateField = new JTextField();
    JTextField endDateField = new JTextField();

    LocalDateTime now = LocalDateTime.of(selectedDate, LocalTime.MIDNIGHT);

    if (appt != null) {
        subjectField.setText(appt.getSubject());
        locationField.setText(appt.getLocation());
        notesField.setText(appt.getNotes());
        priorityField.setText(appt.getPriority());
        startDateField.setText(appt.getStart().format(DATE_TIME_FORMATTER));
        endDateField.setText(appt.getEnd().format(DATE_TIME_FORMATTER));
    } else {
        startDateField.setText(now.format(DATE_TIME_FORMATTER));
        endDateField.setText(now.format(DATE_TIME_FORMATTER));
    }

    panel.add(new JLabel("Subject:"));
    panel.add(subjectField);
    panel.add(new JLabel("Location:"));
    panel.add(locationField);
    panel.add(new JLabel("Notes:"));
    panel.add(notesField);
    panel.add(new JLabel("Priority:"));
    panel.add(priorityField);
    panel.add(new JLabel("Start Date and Time (yyyy-MM-dd HH:mm:ss):"));
    panel.add(startDateField);
    panel.add(new JLabel("End Date and Time (yyyy-MM-dd HH:mm:ss):"));
    panel.add(endDateField);

    int result = JOptionPane.showConfirmDialog(this, panel, (appt == null) ? "Add Appointment" : "Update Appointment", JOptionPane.OK_CANCEL_OPTION);
    if (result == JOptionPane.OK_OPTION) {
        String subject = subjectField.getText().trim();
        String location = locationField.getText().trim();
        String notes = notesField.getText().trim();
        String priority = priorityField.getText().trim();
        LocalDateTime startDate = LocalDateTime.parse(startDateField.getText().trim(), DATE_TIME_FORMATTER);
        LocalDateTime endDate = LocalDateTime.parse(endDateField.getText().trim(), DATE_TIME_FORMATTER);

        if (appt == null) {
            String query = "INSERT INTO tblAppointments (ApptSubject, ApptLocation, ApptNotes, Priority, ApptStart, ApptEnd) VALUES (?, ?, ?, ?, ?, ?)";
            paramInsertUpdateDelete.setData(query, "Appointment added successfully", subject, location, notes, priority, java.sql.Timestamp.valueOf(startDate), java.sql.Timestamp.valueOf(endDate));
        } else {
            String query = "UPDATE tblAppointments SET ApptSubject = ?, ApptLocation = ?, ApptNotes = ?, Priority = ?, ApptStart = ?, ApptEnd = ? WHERE ApptID = ?";
            paramInsertUpdateDelete.setData(query, "Appointment updated successfully", subject, location, notes, priority, java.sql.Timestamp.valueOf(startDate), java.sql.Timestamp.valueOf(endDate), appt.getId());
        }

        loadAppointments(selectedDate);
    }
}


    private void deleteAppointment() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int apptID = (int) tableModel.getValueAt(selectedRow, 0);
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this appointment?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String query = "DELETE FROM tblAppointments WHERE ApptID = ?";
                paramInsertUpdateDelete.setData(query, "Appointment deleted successfully", apptID);
                loadAppointments(selectedDate);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an appointment to delete.");
        }
    }
}
