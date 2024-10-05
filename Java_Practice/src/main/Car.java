package main;

public class Car extends Vehicle {
    int speed;
    public Car(int speed){
        this.speed = speed;
    }
    
     public void printStatus(){
        System.out.println("Car Running Smooooth at speed "+speed+" MPH");
    }
}
