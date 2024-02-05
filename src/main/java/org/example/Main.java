package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.CarManualBuilder;
import org.example.cars.Car;
import org.example.cars.Manual;
import org.example.director.Director;

public class Main {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
//        Computer comp = new Computer.ComputerBuilder(
//                "500 GB", "2 GB").setBluetoothEnabled(true)
//                .setGraphicsCardEnabled(true).build();
//        Computer comp1 = new Computer.ComputerBuilder(
//                "1 TB", "8 GB").setBluetoothEnabled(false).build();
//        Employee emp = new Employee.EmployeeBuilder(
//                "1","test"
//        ).build();
//        Employee emp1 = new Employee.EmployeeBuilder(
//                "1","test1"
//        ).setDead(false).build();
//        System.out.println(comp);
//        System.out.println(comp1);
//        System.out.println(emp);
//        System.out.println(emp1);


        Director director = new Director();
        CarBuilder builder=new CarBuilder();
        director.constructSports(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSports(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.toString());
    }
}