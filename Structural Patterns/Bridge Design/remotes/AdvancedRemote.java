package remotes;

import devices.*;

public class AdvancedRemote extends BasicRemote
{
    public AdvancedRemote(Device device)
    {
        super(device);
    }    

    public void mute()
    {   
        System.out.println("Mute button pressed...");
        device.setVolume(0);
    }
}
