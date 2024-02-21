import abstractfactory.*;
import abstractproduct.*;
import concretefactory.*;
import concreteproduct.*;

public class Test
{
    public static void main(String[] args)
    {
        ProductFactory artDeco=new ArtDecoFactory();
        ProductFactory victorian=new VictorianFactory();
        ProductFactory modern=new ModernFactory();

        // artDeco.createChair().printChair();
        // artDeco.createSofa().printSofa();
        // artDeco.createCoffeeTable().printCoffeeTable();
        victorian.createSofa().printSofa();
        // modern.createCoffeeTable().printCoffeeTable();
    }
}