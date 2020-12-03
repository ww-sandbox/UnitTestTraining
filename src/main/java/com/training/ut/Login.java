package com.training.ut;

public class Login {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";
    public boolean checkUserCredentials(String username, String password) {
        if(username.isEmpty() || password.isEmpty()){throw new IllegalArgumentException("login i hasło nie mogą być puste"); }
        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            return true;
        }
        return false;
    }
}
