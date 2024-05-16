package remotes;

import devices.*;

public class BasicRemote implements Remote
{   
    public Device device;

    public BasicRemote() {}

    public BasicRemote(Device device)
    {
        this.device=device;
    }



    public void power()
    {
        System.out.println("Power button pressed...");
        if(device.isEnabled()) device.disable();
        else device.enable();
    }

    public void volumeUp()
    {
        System.out.println("Volume up...");
        device.setVolume(device.getVolume()+1);
    }

    public void volumeDown()
    {
        System.out.println("Volume down...");
        device.setVolume(device.getVolume()-1);
    }

    public void channelUp()
    {
        System.out.println("Channel up...");
        device.setChannel(device.getChannel()+1);
    }

    public void channelDown()
    {
        System.out.println("Channel down...");
        device.setChannel(device.getChannel()-1);
    }
}
