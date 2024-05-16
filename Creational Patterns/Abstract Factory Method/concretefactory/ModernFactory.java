package concretefactory;

import abstractfactory.*;
import abstractproduct.*;
import concreteproduct.*;

public class ModernFactory implements ProductFactory
{
    public Chair createChair()
    {
        return new ModernChair();
    }

    public Sofa createSofa()
    {
        return new ModernSofa();
    }

    public CoffeeTable createCoffeeTable()
    {
        return new ModernCoffeeTable();
    }
}