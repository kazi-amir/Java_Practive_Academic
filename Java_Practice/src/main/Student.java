//import java.util.*;
package main;

public class Student extends Person{
    private String id;
    private Double cgpa;
    public void setInfo(String id, String name, Double cgpa){
    	this.id = id;
    	this.name = name;
    	this.cgpa = cgpa;
    }
    public String getId(){
    	return this.id;
    }
    public Double getCGPA(){
    	return this.cgpa;
    }
    void print(){
        System.out.println("Student object created");
    }
    
}