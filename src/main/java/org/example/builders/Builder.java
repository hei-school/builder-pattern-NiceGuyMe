package org.example.builders;

import org.example.cars.CarType;
import org.example.cars.Engine;
import org.example.cars.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}
