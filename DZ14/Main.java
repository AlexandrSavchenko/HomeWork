package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Group group =
                new Group("Java", "Java for beginners",
                        LocalDate.of(2021, 1, 15), 5, 2);
        Student s1 = new Student("Boris", "Wild",
                LocalDate.of(2001, 1, 15), "067 987 65 43");
        Student s2 = new Student("Yaroslav", "Bold",
                LocalDate.of(2002, 2, 16), "067 987 65 44");
        Student s3 = new Student("Valentin", "White",
                LocalDate.of(2003, 3, 17), "067 987 65 45");
        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);

        group.showGroupInfo();
        group.showLastDate();
        group.printStudents();
        Student sF = group.searchStudentsBySecondName("Bold");
        if (sF != null) {
            System.out.println(sF.getFirstName() + " " + sF.getSecondName() + " is found.");
        } else {
            System.out.println("Student not found");
        }
        group.deleteStudentBySecondName("Bold");
        group.printStudents();
    }
}
