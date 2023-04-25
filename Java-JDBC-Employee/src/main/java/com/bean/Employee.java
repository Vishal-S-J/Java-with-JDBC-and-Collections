package com.bean;

public class Employee {
    private long EId;
    private String EFirstName;
    private String EMiddleName;
    private String ELastName;
    private String EPost;
    private double ESalary;
    private int EAge;

    public Employee() {
    }

    public Employee(long EId, String EFirstName, String EMiddleName, String ELastName, String EPost, double ESalary, int EAge) {
        this.EId = EId;
        this.EFirstName = EFirstName;
        this.EMiddleName = EMiddleName;
        this.ELastName = ELastName;
        this.EPost = EPost;
        this.ESalary = ESalary;
        this.EAge = EAge;
    }

    public long getEId() {
        return EId;
    }

    public void setEId(long EId) {
        this.EId = EId;
    }

    public String getEFirstName() {
        return EFirstName;
    }

    public void setEFirstName(String EFirstName) {
        this.EFirstName = EFirstName;
    }

    public String getEMiddleName() {
        return EMiddleName;
    }

    public void setEMiddleName(String EMiddleName) {
        this.EMiddleName = EMiddleName;
    }

    public String getELastName() {
        return ELastName;
    }

    public void setELastName(String ELastName) {
        this.ELastName = ELastName;
    }

    public String getEPost() {
        return EPost;
    }

    public void setEPost(String EPost) {
        this.EPost = EPost;
    }

    public double getESalary() {
        return ESalary;
    }

    public void setESalary(double ESalary) {
        this.ESalary = ESalary;
    }

    public int getEAge() {
        return EAge;
    }

    public void setEAge(int EAge) {
        this.EAge = EAge;
    }
}
