/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alk_6
 */
public class DatabaseUtil {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static List<Appointment> getAppointments(YearMonth month) {
        List<Appointment> appointments = new ArrayList<>();
        String query = "SELECT ApptID, ApptSubject,ApptLocation, ApptNotes, Priority, ApptStart, ApptEnd FROM tblAppointments WHERE MONTH(ApptStart) = ? AND YEAR(ApptStart) = ? AND ApptLocation NOT IN ('Trades', 'Finance')";

        try (ResultSet rs = paramSelect.getData(query, month.getMonthValue(), month.getYear())) {
            while (rs.next()) {
                int id = rs.getInt("ApptID");
                String subject = rs.getString("ApptSubject");
                String location = rs.getString("ApptLocation");
                String notes = rs.getString("ApptNotes");
                String priority = rs.getString("Priority");
                LocalDateTime start = LocalDateTime.parse(rs.getString("ApptStart"), DATE_TIME_FORMATTER);
                LocalDateTime end = LocalDateTime.parse(rs.getString("ApptEnd"), DATE_TIME_FORMATTER);
                appointments.add(new Appointment(id, subject,location, notes, priority, start, end));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }
    
    public static List<Appointment> getAllAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        String query = "SELECT ApptID, ApptSubject,ApptLocation, ApptNotes, Priority, ApptStart, ApptEnd FROM tblAppointments WHERE ApptLocation NOT IN ('Finance', 'Trades')ORDER BY ApptID DESC";

        try (ResultSet rs = paramSelect.getData(query)) {
            while (rs.next()) {
                int id = rs.getInt("ApptID");
                String subject = rs.getString("ApptSubject");
                String location = rs.getString("ApptLocation");
                String notes = rs.getString("ApptNotes");
                String priority = rs.getString("Priority");
                LocalDateTime start = LocalDateTime.parse(rs.getString("ApptStart"), DATE_TIME_FORMATTER);
                LocalDateTime end = LocalDateTime.parse(rs.getString("ApptEnd"), DATE_TIME_FORMATTER);
                appointments.add(new Appointment(id, subject,location, notes, priority, start, end));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }

    public static List<Appointment> getAppointmentsForDay(LocalDate date) {
        List<Appointment> appointments = new ArrayList<>();
        String query = "SELECT ApptID, ApptSubject,ApptLocation, ApptNotes, Priority, ApptStart, ApptEnd FROM tblAppointments WHERE ApptStart <= ? AND ApptEnd >= ? AND ApptLocation NOT IN ('Trades', 'Finance')";

        try (ResultSet rs = paramSelect.getData(query, java.sql.Date.valueOf(date), java.sql.Date.valueOf(date))) {
            while (rs.next()) {
                int id = rs.getInt("ApptID");
                String subject = rs.getString("ApptSubject");
                String location = rs.getString("ApptLocation");
                String notes = rs.getString("ApptNotes");
                String priority = rs.getString("Priority");
                LocalDateTime start = rs.getTimestamp("ApptStart").toLocalDateTime(); // Get LocalDateTime directly from ResultSet
                LocalDateTime end = rs.getTimestamp("ApptEnd").toLocalDateTime(); // Get LocalDateTime directly from ResultSet
                appointments.add(new Appointment(id, subject, location, notes, priority, start, end));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }
}
