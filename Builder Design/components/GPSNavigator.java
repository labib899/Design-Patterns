package components;

public class GPSNavigator 
{
    private String route;

    public GPSNavigator()
    {
        this.route="146 Baily Road,Dhaka";
    }

    public GPSNavigator(String manualRoute)
    {
        this.route=manualRoute;
    }

    public String getRoute()
    {
        return this.route;
    }
}
