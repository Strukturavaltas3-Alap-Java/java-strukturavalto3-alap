package week19.day01.jdbc;

import java.time.LocalDate;

public class Person {

    private long id;

    private String name;

    private LocalDate dateOfBirth;
    // LocalDate - DATE
    // LocalDateTime - TIMESTAMP, DATETIME

    private int height;

    private double weight;

    private Gender gender;

    public Person(String name, LocalDate dateOfBirth, int height, double weight, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
