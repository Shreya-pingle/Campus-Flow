package com.campusflow.dto;
import java.time.LocalDate;
public record TaskRequest(String title,String description,String priority,String status,LocalDate dueDate,String recurrence) {}
