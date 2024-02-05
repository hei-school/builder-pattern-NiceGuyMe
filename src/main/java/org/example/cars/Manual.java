package org.example.cars;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
