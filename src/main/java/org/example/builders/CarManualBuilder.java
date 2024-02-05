package org.example.builders;

import org.example.cars.CarType;
import org.example.cars.Engine;
import org.example.cars.Manual;
import org.example.cars.Transmission;

public class CarManualBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    @Override
    public void setCarType(CarType carType) {
        this.carType=carType;
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
    public Manual getResult(){
        return new Manual(carType,seats,engine,transmission);
    }
}
