package org.example.director;

import org.example.builders.Builder;
import org.example.cars.CarType;
import org.example.cars.Engine;
import org.example.cars.Transmission;

public class Director {
    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(6);
        builder.setEngine(Engine.Diesel);
        builder.setTransmission(Transmission.Manual);
    }

    public void constructVan(Builder builder){
        builder.setCarType(CarType.Van);
        builder.setSeats(24);
        builder.setEngine(Engine.Diesel);
        builder.setTransmission(Transmission.Automatic);
    }
    public void constructSports(Builder builder){
        builder.setCarType(CarType.Sports);
        builder.setSeats(2);
        builder.setEngine(Engine.Electric);
    }
}
