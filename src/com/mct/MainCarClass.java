package com.mct;



class Vehicle{
    String make;
    String model;
    int year;
    public void displayInfo(){
        System.out.println("Make: " + make + ", Model: " + model + ", Year: "+ year);
    }
}
public class MainCarClass{
    public static void main(String[] args) {
          Vehicle myVehicle = new Vehicle();
          myVehicle.make = "Toyota";
        myVehicle.model = "xyz";
        myVehicle.year= 2020;

        myVehicle.displayInfo();
    }
}
