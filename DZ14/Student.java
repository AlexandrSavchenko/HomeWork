package com.company;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String secondName;
    private LocalDate dob;
    private String contacts;

    public Student(String firstName, String secondName, LocalDate dob, String contacts) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dob = dob;
        this.contacts = contacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
