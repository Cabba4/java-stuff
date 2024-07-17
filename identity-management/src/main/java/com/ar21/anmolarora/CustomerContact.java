package com.ar21.anmolarora;
import java.util.Scanner;

public class CustomerContact implements Contact {

    String displayName, emailAddress;
    Integer userID;

    Scanner myObj = new Scanner(System.in);

    public CustomerContact(String displayName, String emailAddress, Integer userID){
        this.displayName = displayName;
        this.emailAddress = emailAddress;
        this.userID = userID;
    }

    public CustomerContact(){
        
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public int getUserID() {
        return userID;
    }

    @Override
    public void showContact() {
        System.out.println("Custoemr Contact info is " + this.displayName + this.emailAddress + this.userID);
    }
    
}
