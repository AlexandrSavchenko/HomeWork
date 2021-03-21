package com.company;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private int weight;
    private int height;

    public Person(String firstName, String secondName, int age, int weight, int height) throws Exception {
        if (firstName == null || firstName.trim().length() < 1
                || secondName == null || secondName.trim().length() < 1) {
            throw new Exception("Отсутствует имя или фамилия");
        }

        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
