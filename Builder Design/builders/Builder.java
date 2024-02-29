package builders;

import components.*;

public interface Builder 
{
    public void setCarType(String carType);
    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
