package com.task.management.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tasks_table")
public class Tasks {
    private int id;
    private String title;
    private String description;
    private String due_date;
    private String priority;
    private String status;
    private String created_by;
    private String assigned_to;
    private String created_at;
    private String updated_at;
}
