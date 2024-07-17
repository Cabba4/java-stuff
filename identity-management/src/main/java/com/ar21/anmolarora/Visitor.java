package com.ar21.anmolarora;

public class Visitor implements Identity{
    String firstName, lastName, email;
    
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

    public Visitor() {
        this.firstName = "Jesse";
        this.lastName = "Pinkman";
        this.email = "jesse.pinkman@hackmail.com";
    }
    
    public String displayEmail() {
        return this.email;
    }

    public String displayName() {
       return this.firstName;
    }

}
