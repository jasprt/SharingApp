package com.example.sharingapp;

import java.util.UUID;

public class Contact {

    private String username;
    private String email;
    private String id;

    Contact(String username, String email, String id) {
        this.username = username;
        this.email = email;

        if (id == null || id.isEmpty()) {
            setId();
        } else {
            updateid(id);
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public void updateid(String id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

}
