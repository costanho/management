package com.task.management.security;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="authentication_tokens")
public class Tokens {
    private int token_id;
    private int token;
    private String expiry_date;
    private String created_at;



}
