package builders;

import components.*;
import products.*;

public class CarManualBuilder implements Builder
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

    public Manual getResult()
    {
        return new Manual(carType,seats,engine,gpsNavigator);
    }
}
