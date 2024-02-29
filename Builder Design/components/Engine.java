package components;

public class Engine 
{
    private double volume,mileage;

    public Engine(double volume,double mileage)
    {
        this.volume=volume;
        this.mileage=mileage;
    }

    public double getVolume()
    {
        return this.volume;
    }

    public double getMileage()
    {
        return this.mileage;
    }
}
