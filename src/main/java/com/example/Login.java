package com.example;

public class Login {
    public boolean login(String user, String password) {
        if (user.equals("admin") && password.equals("admin123")
                || user.equals("alumno") && password.equals("alumno123")) {
            return true;
        } else {
            return false;
        }
    }
}
