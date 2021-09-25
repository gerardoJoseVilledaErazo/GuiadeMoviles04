package com.example.material_design.models;

import java.io.Serializable;

public class EmployeeModel implements Serializable {

    //Serializable lo que se busque es que me permita convertir el objeto a bytes
    private int imgEmployee;
    private String name, lastName;

    public EmployeeModel(int imgEmployee, String name, String lastName) {
        this.imgEmployee = imgEmployee;
        this.name = name;
        this.lastName = lastName;
    }

    public int getImgEmployee() {
        return imgEmployee;
    }

    public void setImgEmployee(int imgEmployee) {
        this.imgEmployee = imgEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "imgEmployee=" + imgEmployee +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}