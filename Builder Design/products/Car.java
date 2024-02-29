package products;

import components.*;

public class Car 
{
    private String carType;
    private int seats;
    private Engine engine;
    private GPSNavigator gpsNavigator;

    public Car(String carType,int seats,Engine engine,GPSNavigator gpsNavigator)
    {
        this.carType=carType;
        this.seats=seats;
        this.engine=engine;
        this.gpsNavigator=gpsNavigator;
    }

    public String getCarType()
    {
        return this.carType;
    }

    public int getSeats()
    {
        return this.seats;
    }

    public Engine getEngine()
    {
        return this.engine;
    } 

    public GPSNavigator getGPSNavigator()
    {
        return this.gpsNavigator;
    }
}
