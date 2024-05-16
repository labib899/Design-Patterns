import builders.*;
import components.*;
import director.*;
import products.*;

public class Test 
{
    public static void main(String[] args)
    {
        Director director=new Director();
        
        CarBuilder carBuilder=new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car=carBuilder.getResult();
        System.out.println("...Car built... ");
        System.out.println("Car Type: " + car.getCarType());
        System.out.println("Seats: " + car.getSeats() + "\n");
        
        CarManualBuilder carManualBuilder=new CarManualBuilder();
        director.constructSUV(carManualBuilder);
        Manual manual=carManualBuilder.getResult();
        System.out.println("...Car Manual built...\n" + manual.printInfo());
    }
}
