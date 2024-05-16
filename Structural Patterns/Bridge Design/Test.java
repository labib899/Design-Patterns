import devices.*;
import remotes.*;

public class Test
{
    public static void main(String[] args) 
    {   
        Device device1=new Radio();
        Device device2=new Tv();

        System.out.println("Test with basic remote...");
        BasicRemote basicRemote = new BasicRemote(device1);
        basicRemote.power();
        device1.printStatus();

        System.out.println("Test with advanced remote...");
        AdvancedRemote advancedRemote = new AdvancedRemote(device2);
        advancedRemote.power();
        advancedRemote.mute();
        device2.printStatus();
    }
}