package com.task.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_table")
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private String email;
    private String created_at;
    private String update_at;


}
