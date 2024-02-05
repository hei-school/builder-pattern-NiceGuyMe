package org.example.builders;

import org.example.cars.Car;
import org.example.cars.CarType;
import org.example.cars.Engine;
import org.example.cars.Transmission;

public class CarBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;


    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
    this.seats=seats;
    }

    @Override
    public void setEngine(Engine engine) {
    this.engine=engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
    this.transmission=transmission;
    }

    public Car getResult(){
        return new Car(carType,seats,engine,transmission);
    }
}
