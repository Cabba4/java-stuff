package com.ar21.anmolarora;
import java.util.Scanner;

public class ContactService {

    Scanner myObj = new Scanner(System.in);
    CustomerContact customerContact = new CustomerContact("JohnCena", "cena@mail.com", 1234);

    public void findContact(Contact contact){
        System.out.println("Enter email address to find contact ");
        //System.out.println("I have " + contact.getEmailAddress());
        String email = myObj.nextLine();
        if (email.equals(contact.getEmailAddress())){
            System.out.println("Contact found");
        }
        else {
            System.out.println("Not in database");
        }
    }

    public void addContact(Contact contact){
        System.out.println("Customer data added ");
        System.out.println(contact.getDisplayName());
    }

    public void modifyContact(){
        // later too sleepy
    }

}
