package com.beanModel;

public class Employee {
    private int E_Id, E_Age;
    private String E_FName, E_LName, E_Post;

    public Employee(int e_Id, int e_Age, String e_FName, String e_LName, String e_Post) {
        E_Id = e_Id;
        E_Age = e_Age;
        E_FName = e_FName;
        E_LName = e_LName;
        E_Post = e_Post;
    }

    public int getE_Id() {
        return E_Id;
    }

    public void setE_Id(int e_Id) {
        E_Id = e_Id;
    }

    public int getE_Age() {
        return E_Age;
    }

    public void setE_Age(int e_Age) {
        E_Age = e_Age;
    }

    public String getE_FName() {
        return E_FName;
    }

    public void setE_FName(String e_FName) {
        E_FName = e_FName;
    }

    public String getE_LName() {
        return E_LName;
    }

    public void setE_LName(String e_LName) {
        E_LName = e_LName;
    }

    public String getE_Post() {
        return E_Post;
    }

    public void setE_Post(String e_Post) {
        E_Post = e_Post;
    }
}
