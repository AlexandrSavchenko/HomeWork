package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Group {
    private String groupName;
    private String courseName;
    private LocalDate startDate;
    private int countClass;
    private int countClassAtWeek;
    private List<Student> studentsList = new ArrayList<>();

    public Group(String groupName, String courseName, LocalDate startDate, int countClass, int countClassAtWeek) {
        this.groupName = groupName;
        this.courseName = courseName;
        this.startDate = startDate;
        this.countClass = countClass;
        this.countClassAtWeek = countClassAtWeek;
    }

    public void showGroupInfo() {
        System.out.println("Group Name: " + getGroupName());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Start Date: " + getStartDate().format(DateTimeFormatter.ofPattern("dd.MM.YYYY")));
    }

    public void showLastDate() {
        System.out.println("Last Date: "
                + getStartDate().plusDays((getCountClass() / getCountClassAtWeek()) * 7).format(DateTimeFormatter.ofPattern("dd.MM.YYYY")));
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getCountClass() {
        return countClass;
    }

    public void setCountClass(int countClass) {
        this.countClass = countClass;
    }

    public int getCountClassAtWeek() {
        return countClassAtWeek;
    }

    public void setCountClassAtWeek(int countClassAtWeek) {
        this.countClassAtWeek = countClassAtWeek;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudent(Student student) {
        this.studentsList.add(student);
    }

    public void printStudents() {
        int count = 0;
        for (Student student : getStudentsList()) {
            System.out.println(++count + ". " + student.getFirstName().substring(0, 1) + ". " + student.getSecondName());
        }
    }

    public Student searchStudentsBySecondName(String secondName) {
        for (Student student : getStudentsList()) {
            if (student.getSecondName().toLowerCase().contains(secondName.toLowerCase()))
                return student;
        }
        return null;
    }

    public void deleteStudentBySecondName(String secondName) {
        for (Student student : getStudentsList()) {
            if (student.getSecondName().toLowerCase().contains(secondName.toLowerCase()))
                this.studentsList.remove(student);
        }
    }
}

