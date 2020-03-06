package com.example.firebasedatabasedemo;

public class Student {
    private String id;
    private String name;
    private String faculty;
    private String gender;

    public Student() {
    }

    public Student(String id, String name, String faculty, String gender) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
