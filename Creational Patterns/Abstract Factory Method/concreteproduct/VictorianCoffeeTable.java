package concreteproduct;

import abstractproduct.*;

public class VictorianCoffeeTable implements CoffeeTable
{
    public void printCoffeeTable()
    {
        System.out.println("This is a victorian CoffeeTable...");
    }
}