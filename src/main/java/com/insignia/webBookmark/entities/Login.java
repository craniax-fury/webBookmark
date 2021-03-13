package com.insignia.webBookmark.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {

    @NotNull(message = "email cannot be empty")
    @Size(min = 1,message = "email cannot be empty")
    private String email;
    @NotNull(message = "password cannot be empty")
    @Size(min = 1, message = "password cannot be empty")
    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
