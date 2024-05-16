package concreteproduct;

import abstractproduct.*;

public class ArtDecoCoffeeTable implements CoffeeTable
{
    public void printCoffeeTable()
    {
        System.out.println("This is an art deco CoffeeTable...");
    }
}
