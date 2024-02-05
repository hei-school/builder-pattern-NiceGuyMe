import org.example.builders.CarManualBuilder;
import org.example.cars.Manual;
import org.example.director.Director;
import org.junit.Assert;
import org.junit.Test;

public class CarManualBuilderTest {
    @Test
    public void buildManualSportCar(){
        Director director = new Director();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSports(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        Assert.assertEquals("Manual{carType=Sports, seats=2, engine=Electric, transmission=null}",carManual.toString());
    }
}
