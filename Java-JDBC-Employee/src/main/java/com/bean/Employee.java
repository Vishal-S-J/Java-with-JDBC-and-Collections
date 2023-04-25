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


}
