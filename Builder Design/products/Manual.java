package products;

import components.Engine;
import components.GPSNavigator;

public class Manual 
{
    private String carType;
    private int seats;
    private Engine engine;
    private GPSNavigator gpsNavigator;

    public Manual(String carType,int seats,Engine engine,GPSNavigator gpsNavigator)
    {
        this.carType=carType;
        this.seats=seats;
        this.engine=engine;
        this.gpsNavigator=gpsNavigator;
    }

    public String printInfo()
    {
        String info="";
        info+="Car Type: " + carType + "\n";
        info+="Seats: " + seats + "\n";
        info+="Engine: (volume: " + engine.getVolume() + ", mileage: " + engine.getMileage() + ")\n";
        if (this.gpsNavigator != null) info += "GPS Navigator: Functional" + "\n";
        else info += "GPS Navigator: N/A" + "\n";

        return info;
    }
}
