package com.photo.app.userrest.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserModel {
    @NotNull(message = "Cannot be null")
    @Size(min = 2, message = "Cannot be les than 2 characters")
    private String firstName;
    @NotNull(message = "Cannot be null")
    @Size(min = 2, message = "Cannot be les than 2 characters")
    private String lastName;
    @NotNull(message = "Cannot be null")
    @Size(min = 8, max = 16, message = "password must be grater or equal 8 characters")
    private String email;
    @Email
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
