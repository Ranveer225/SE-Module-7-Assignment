/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    // add in variables for gpa and address

    private double gpa;
    private String address;

    // create constructor

    public Student(String name, short age) {
        super(name,age);
    }


    public String getAddress() {
        return address;

    }
    // constructor for name and age

    // create field for GPA and setters and getters

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    // setters and getters

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
// ToDo 1: Make this class a child of Human

// ToDo 2: Fix the resulting errors

// ToDo 3: Add a field for GPA and create a setter and a getter

// ToDo 4: Add comments to your code
