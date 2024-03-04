package devices;

public class Radio implements Device
{
    private boolean on=false;
    private int volume=40,channel=1;

    public boolean isEnabled()
    {
        return this.on;
    }

    public void enable()
    {
        this.on=true;
    }

    public void disable()
    {
        this.on=false;
    }

    public int getVolume()
    {
        return this.volume;
    }

    public void setVolume(int volume)
    {
        this.volume=volume;
    }

    public int getChannel()
    {
        return this.channel;
    }

    public void setChannel(int channel)
    {
        this.channel=channel;
    }

    public void printStatus()
    {
        System.out.println("Device: Radio");
        System.out.println("Status: " + (on? "Enabled":"Disabled"));
        System.out.println("Volume: " + this.volume);
        System.out.println("Channel: " + this.channel + "\n");
    }
}
