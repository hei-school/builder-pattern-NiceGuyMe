import org.example.builders.CarBuilder;
import org.example.cars.Car;
import org.example.director.Director;
import org.junit.Assert;
import org.junit.Test;

public class CarBuilderTest {
    @Test
    public void buildSportCar(){
        Director director = new Director();
        CarBuilder builder=new CarBuilder();
        director.constructSports(builder);

        Car car = builder.getResult();
        Assert.assertEquals("Sports",car.getCarType().toString());
    }
}
