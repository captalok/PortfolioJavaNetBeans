/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.time.LocalDateTime;
/**
 *
 * @author alk_6
 */
public class Appointment {
    private int id;
    private String subject;
    private String location;
    private String notes;
    private String priority;
    private LocalDateTime start;
    private LocalDateTime end;

    public Appointment(int id, String subject,String location, String notes, String priority, LocalDateTime start, LocalDateTime end) {
        this.id = id;
        this.subject = subject;
        this.location = location;
        this.notes = notes;
        this.priority = priority;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public String getPriority() {
        return priority;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}
