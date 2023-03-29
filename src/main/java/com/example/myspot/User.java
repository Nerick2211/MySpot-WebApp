package com.example.myspot;

public class User {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean checkPassword(String password) {
        // code pour vérifier si le mot de passe est correct
        return false;
    }
}