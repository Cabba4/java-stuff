package com.ar21.anmolarora;

public class IDMService {

    Student newStudent = new Student();
    public void createIdentity(Identity idm) {
        newStudent.setFirstName(idm.displayName());
        newStudent.setEmail(idm.displayEmail());
    }

    public void getIdentity(Identity idm) {
        System.out.println("Email is " + idm.displayEmail());
        System.out.println("Name is " + idm.displayName());
    }

    public void modifyIdentity(){

    }
}
