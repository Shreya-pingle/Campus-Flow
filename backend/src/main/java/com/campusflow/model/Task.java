package com.campusflow.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity @Table(name="tasks")
public class Task {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String title;
 private String description;
 private String priority="MEDIUM";
 private String status="TODO";
 private LocalDate dueDate;
 private String recurrence="NONE";
 public Long getId(){return id;}
 public String getTitle(){return title;} public void setTitle(String v){title=v;}
 public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public String getPriority(){return priority;} public void setPriority(String v){priority=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public LocalDate getDueDate(){return dueDate;} public void setDueDate(LocalDate v){dueDate=v;}
 public String getRecurrence(){return recurrence;} public void setRecurrence(String v){recurrence=v;}
}
