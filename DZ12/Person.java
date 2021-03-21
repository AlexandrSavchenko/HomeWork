package com.company;

public class Person {
    private String secondName;
    private String firstName;
    private String patronymic;
    private String dateOfBirth;

    public Person(String secondName, String firstName, String patronymic, String dateOfBirth) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String secondName, String firstName, String patronymic) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Person(String fio) {
    }

    public String fio() {
        String fio = secondName + " " + firstName + " " + patronymic;
        return fio;
    }

    public String shortFio() {
        char shortName = firstName.charAt(0);
        char shortPatronymic = patronymic.charAt(0);

        String shortFio = secondName + " " + shortName + ". " + shortPatronymic + ".";
        return shortFio;
    }
}
