package com.minal.app.model;

public class Student {

    String name;
    String rollNo;
    String std;
    String schoolName;

    public Student(String name, String rollNo, String std, String schoolName) {
        this.name = name;
        this.rollNo = rollNo;
        this.std = std;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getStd() {
        return std;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
