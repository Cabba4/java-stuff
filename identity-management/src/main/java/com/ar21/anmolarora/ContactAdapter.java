package com.ar21.anmolarora;

public class ContactAdapter implements Identity {

    Contact contact;

    public ContactAdapter(Contact contact){
        this.contact = contact;
    }
    
    @Override
    public String displayName() {
        return contact.getDisplayName();
    }

    @Override
    public String displayEmail() {
        return contact.getEmailAddress();
    }
    
}
