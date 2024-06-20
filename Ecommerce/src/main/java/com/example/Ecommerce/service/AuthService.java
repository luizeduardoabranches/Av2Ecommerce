package com.example.Ecommerce.service;

import com.example.Ecommerce.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String generateToken(String username, String password, String email) {
        String content = username +" / " +password + " / " +email;
        String token = JwtUtil.generateToken(content);
        return token;
    }

    public String extractUsername(String token) {
        String username = JwtUtil.extractUsername(token);
        return username;
    }
}

