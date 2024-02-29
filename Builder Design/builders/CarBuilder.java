package builders;

import components.*;
import products.*;

public class CarBuilder implements Builder
{
    private String carType;
    private int seats;
    private Engine engine;
    private GPSNavigator gpsNavigator;

    public void setCarType(String carType)
    {
        this.carType=carType;
    }

    public void setSeats(int seats)
    {
        this.seats=seats;
    }
    public void setEngine(Engine engine)
    {
        this.engine=engine;
    }
    public void setGPSNavigator(GPSNavigator gpsNavigator)
    {
        this.gpsNavigator=gpsNavigator;
    }

    public Car getResult()
    {
        return new Car(carType,seats,engine,gpsNavigator);
    }
}
