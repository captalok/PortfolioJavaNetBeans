/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

public class CalendarPanel extends JPanel {
    private YearMonth currentMonth;
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);
    private JPanel headerPanel;
    private JButton searchButton;
    
    private static final Font REGULAR_FONT = new Font("SansSerif", Font.PLAIN, 12);
    private static final Font BOLD_FONT = new Font("SansSerif", Font.BOLD, 11);

    public CalendarPanel(YearMonth month) {
        this.currentMonth = month;
        initPanel();
    }

    private void initPanel() {
        setLayout(new BorderLayout());

        // Create header panel with navigation and search buttons
        headerPanel = new JPanel(new FlowLayout());
        headerPanel.setBackground(thirdColor);

        JButton prevButton = new JButton("<");
        JButton nextButton = new JButton(">");
        JLabel monthLabel = new JLabel(currentMonth.getMonth().toString() + " " + currentMonth.getYear());
        JButton todayButton = new JButton("Today");

        prevButton.setBackground(primaryColor);
        prevButton.setForeground(Color.WHITE);
        nextButton.setBackground(primaryColor);
        nextButton.setForeground(Color.WHITE);
        monthLabel.setForeground(Color.WHITE);
        todayButton.setBackground(primaryColor);
        todayButton.setForeground(Color.WHITE);

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToMonth(currentMonth.minusMonths(1));
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToMonth(currentMonth.plusMonths(1));
            }
        });
        
        todayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToDate(LocalDate.now());
            }
        });

        // Create the search button
        searchButton = new JButton("Search Appointments");
        searchButton.setBackground(primaryColor);
        searchButton.setForeground(Color.WHITE);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSearchAppointmentsDialog();
            }
        });

        headerPanel.add(prevButton);
        headerPanel.add(monthLabel);
        headerPanel.add(nextButton);
        headerPanel.add(todayButton);
        headerPanel.add(searchButton);

        add(headerPanel, BorderLayout.NORTH);

        // Create calendar grid
        JPanel calendarGrid = new JPanel(new GridLayout(0, 7));
        calendarGrid.setBackground(thirdColor);

        LocalDate firstOfMonth = currentMonth.atDay(1);
        int dayOfWeekValue = firstOfMonth.getDayOfWeek().getValue(); // 1=Monday, ..., 7=Sunday
        int shift = dayOfWeekValue % 7; // Adjust to make 0=Sunday, 1=Monday, ..., 6=Saturday

        // Add empty buttons for days of the previous month
        for (int i = 0; i < shift; i++) {
            JButton emptyButton = new JButton();
            emptyButton.setEnabled(true);
            emptyButton.setBackground(primaryColor); // Set blank buttons to blue color
            calendarGrid.add(emptyButton);
        }

        // Fetch appointments for the current month
        List<Appointment> appointments = DatabaseUtil.getAppointments(currentMonth);

        // Add buttons for each day of the current month
        for (int day = 1; day <= currentMonth.lengthOfMonth(); day++) {
            LocalDate date = currentMonth.atDay(day);
            JButton dayButton = new JButton();
            dayButton.setLayout(new BorderLayout());
            dayButton.setBorder(BorderFactory.createLineBorder(primaryColor));

            JLabel dayLabel = new JLabel(String.valueOf(day));
            dayLabel.setHorizontalAlignment(SwingConstants.LEFT);
            dayLabel.setVerticalAlignment(SwingConstants.TOP);
            dayLabel.setForeground(Color.WHITE); // Set day label foreground to White

            // Highlight today's date with a different color
            if (date.equals(LocalDate.now())) {
                dayButton.setBackground(primaryColor);
            } else {
                dayButton.setBackground(thirdColor); // Set background color of day buttons to third color
            }

            // Add day label to the button
            dayButton.add(dayLabel, BorderLayout.NORTH);

            // Add appointments to the button
            JPanel apptPanel = new JPanel();
            apptPanel.setLayout(new BoxLayout(apptPanel, BoxLayout.Y_AXIS));
            apptPanel.setOpaque(false); // Make the panel transparent

            for (Appointment appt : appointments) {
                LocalDate startDate = appt.getStart().toLocalDate();
                LocalDate endDate = appt.getEnd().toLocalDate();
                if (!startDate.isAfter(date) && !endDate.isBefore(date)) {
                    JLabel apptLabel = new JLabel(appt.getSubject());
                    apptLabel.setForeground(Color.WHITE); // Set appointment text color to White
                    apptPanel.add(apptLabel);
                }
            }

            dayButton.add(apptPanel, BorderLayout.CENTER);

            calendarGrid.add(dayButton);

            // Add MouseListener to change color on hover
            dayButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    dayButton.setBackground(primaryColor.darker());
                    dayLabel.setForeground(Color.GREEN); // Change text color to Green on hover
                    dayLabel.setFont(BOLD_FONT);
                    for (Component comp : apptPanel.getComponents()) {
                        if (comp instanceof JLabel) {
                            ((JLabel) comp).setForeground(Color.GREEN); // Change appointment text color to Green on hover
                            ((JLabel) comp).setFont(BOLD_FONT);
                        }
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (date.equals(LocalDate.now())) {
                        dayButton.setBackground(primaryColor);
                    } else {
                        dayButton.setBackground(thirdColor); // Revert background color to third color on exit
                    }
                    dayLabel.setForeground(Color.WHITE); // Revert text color to White on exit
                    dayLabel.setFont(REGULAR_FONT);
                    for (Component comp : apptPanel.getComponents()) {
                        if (comp instanceof JLabel) {
                            ((JLabel) comp).setForeground(Color.WHITE); // Revert appointment text color to White on exit
                            ((JLabel) comp).setFont(REGULAR_FONT);
                        }
                    }
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    openCalendarAppInsert(date);
                }
            });
        }

        // Fill the remaining cells of the last week with empty buttons
        int remainingDays = (7 - (shift + currentMonth.lengthOfMonth()) % 7) % 7;
        for (int i = 0; i < remainingDays; i++) {
            JButton emptyButton = new JButton();
            emptyButton.setEnabled(true);
            emptyButton.setBackground(primaryColor); // Set blank buttons to blue color
            calendarGrid.add(emptyButton);
        }

        add(calendarGrid, BorderLayout.CENTER);
    }

    private void navigateToMonth(YearMonth newMonth) {
        this.currentMonth = newMonth;
        removeAll();
        initPanel();
        revalidate();
        repaint();
    }

    private void openCalendarAppInsert(LocalDate date) {
        CalendarAppInsert appInsert = new CalendarAppInsert(date);
        appInsert.setVisible(true);
    }

    private void openSearchAppointmentsDialog() {
        new SearchAppointmentsDialog(this);
    }

    public void navigateToDate(LocalDate date) {
        updateCalendar(YearMonth.from(date));
    }

    public void updateCalendar(YearMonth newMonth) {
        this.currentMonth = newMonth;
        removeAll();
        initPanel();
        revalidate();
        repaint();
    }
}
