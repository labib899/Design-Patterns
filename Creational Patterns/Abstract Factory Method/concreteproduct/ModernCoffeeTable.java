package concreteproduct;

import abstractproduct.*;

public class ModernCoffeeTable implements CoffeeTable
{
    public void printCoffeeTable()
    {
        System.out.println("This is a modern CoffeeTable...");
    }
}
