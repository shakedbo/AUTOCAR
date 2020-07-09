package com.auto_car.repos;

import com.auto_car.model.User;


public class UserBuilder {
    int id;
    private String fistName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String password;

    private UserBuilder() {
    }

    public UserBuilder id(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder fistName(String fistName) {
        this.fistName = fistName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder phoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }


    public User build() {
        User user = new User();
        user.setEmail(this.email);
        user.setFistName(this.fistName);
        user.setLastName(this.lastName);
        user.setPassword(this.password);
        user.setPhoneNumber(this.phoneNumber);
        user.setId(this.id);
        return user;
    }

}

