package com.task.management.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_role")
public class Roles {
   @Id
   private int id;
   private String name;
   private String description;
   private String created_at;
   private String update_at;
}
