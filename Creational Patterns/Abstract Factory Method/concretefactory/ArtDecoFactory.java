package concretefactory;

import abstractfactory.*;
import abstractproduct.*;
import concreteproduct.*;

public class ArtDecoFactory implements ProductFactory
{
    public Chair createChair()
    {
        return new ArtDecoChair();
    }

    public Sofa createSofa()
    {
        return new ArtDecoSofa();
    }

    public CoffeeTable createCoffeeTable()
    {
        return new ArtDecoCoffeeTable();
    }
}