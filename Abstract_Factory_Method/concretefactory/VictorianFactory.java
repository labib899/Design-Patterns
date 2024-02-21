package concretefactory;

import abstractfactory.*;
import abstractproduct.*;
import concreteproduct.*;

public class VictorianFactory implements ProductFactory
{
    public Chair createChair()
    {
        return new VictorianChair();
    }

    public Sofa createSofa()
    {
        return new VictorianSofa();
    }

    public CoffeeTable createCoffeeTable()
    {
        return new VictorianCoffeeTable();
    }
}