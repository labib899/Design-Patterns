package abstractfactory;

import abstractproduct.*;

public interface ProductFactory
{
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
