package com.kodilla.good.patterns.challenges.Food2Door;

public class Provider {
    private String firstName;
    private String lastName;
    private String email;

    public Provider(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
