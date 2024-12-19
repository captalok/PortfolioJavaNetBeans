/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import project.*;
/**
 *
 * @author alk_6
 */
public class CalendarApp extends javax.swing.JFrame {

    private YearMonth currentMonth;
    private CalendarPanel calendarPanel;
    private JLabel monthLabel;
    
    private static final Font BOLD_FONT = new Font("SansSerif", Font.BOLD, 13);
    
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);

    /**
     * Creates new form CalendarApp
     */
    public CalendarApp() {
        initComponents();       
        
        currentMonth = YearMonth.now();
        setTitle("Calendar Application");
        setSize(1250, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Set JFrame background color to Black
        getContentPane().setBackground(thirdColor);

        // Create and add the navigation panel
        JPanel navigationPanel = new JPanel();
        navigationPanel.setLayout(new BorderLayout());
        navigationPanel.setBackground(thirdColor); // Set navigation panel background to Black

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setBackground(thirdColor); // Set center panel background to Black

        JButton prevButton = new JButton("<");
        JButton nextButton = new JButton(">");
        JButton closeButton = new JButton("X");

        // Set buttons background color to Red
        prevButton.setBackground(secondaryColor);
        nextButton.setBackground(secondaryColor);
        closeButton.setBackground(secondaryColor);

        // Set buttons foreground color to White
        prevButton.setForeground(Color.WHITE);
        nextButton.setForeground(Color.WHITE);
        closeButton.setForeground(Color.WHITE);

        monthLabel = new JLabel(currentMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + currentMonth.getYear(), JLabel.CENTER);
        monthLabel.setForeground(Color.WHITE); // Set month label foreground to White

        centerPanel.add(prevButton);
        centerPanel.add(monthLabel);
        centerPanel.add(nextButton);
        //centerPanel.setBackground(thirdColor);

        navigationPanel.add(centerPanel, BorderLayout.CENTER);
        navigationPanel.add(closeButton, BorderLayout.EAST);

        add(navigationPanel, BorderLayout.NORTH);

        // Create a panel for header and calendar
        JPanel calendarContainerPanel = new JPanel();
        calendarContainerPanel.setLayout(new BorderLayout());
        calendarContainerPanel.setBackground(thirdColor); // Set calendar container panel background to Black

        // Create header panel with day names
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(1, 7));
        headerPanel.setBackground(primaryColor); // Set header panel background to Green

        // Add day labels (Sunday, Monday, ..., Saturday)
        DayOfWeek[] daysOfWeek = DayOfWeek.values();
        for (int i = 0; i < 7; i++) {
            DayOfWeek dayOfWeek = daysOfWeek[(i + 6) % 7]; // Adjust to start from Sunday
            JLabel label = new JLabel(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setForeground(Color.WHITE); // Set day labels foreground to White
            label.setFont(BOLD_FONT);
            headerPanel.add(label);
        }

        calendarContainerPanel.add(headerPanel, BorderLayout.NORTH);
        //calendarContainerPanel.setBackground(thirdColor);

        // Create and add the calendar panel
        calendarPanel = new CalendarPanel(currentMonth);
        calendarContainerPanel.add(calendarPanel, BorderLayout.CENTER);

        add(calendarContainerPanel, BorderLayout.CENTER);

        // Action listeners for the buttons
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMonth = currentMonth.minusMonths(1);
                monthLabel.setText(currentMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + currentMonth.getYear());
                updateCalendarPanel();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMonth = currentMonth.plusMonths(1);
                monthLabel.setText(currentMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + currentMonth.getYear());
                updateCalendarPanel();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Close the application
            }
        });

        setVisible(true);
    }

    private void updateCalendarPanel() {
        calendarPanel.updateCalendar(currentMonth);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 0));
        setLocation(new java.awt.Point(20, 50));
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalendarApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
