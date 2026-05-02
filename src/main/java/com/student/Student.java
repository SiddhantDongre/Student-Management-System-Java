package com.student;

public class Student {
    private int id;
    private String name;
    private double marks;
    private String mobile;
    private String address;
    private String branch;

    public Student() {}

    public Student(String name, double marks, String mobile, String address, String branch) {
        this.name = name;
        this.marks = marks;
        this.mobile = mobile;
        this.address = address;
        this.branch = branch;
    }

    public Student(int id, String name, double marks, String mobile, String address, String branch) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.mobile = mobile;
        this.address = address;
        this.branch = branch;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
}