package director;

import builders.*;
import components.*;
import products.*;

public class Director 
{
    public void constructSportsCar(Builder builder)
    {
        builder.setCarType("Sports Car");
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0.0));
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder)
    {
        builder.setCarType("City Car");
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2,0.0));
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder)
    {
        builder.setCarType("SUV");
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5,0.0));
        builder.setGPSNavigator(new GPSNavigator());
    }
}
