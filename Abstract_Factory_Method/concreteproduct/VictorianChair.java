package concreteproduct;

import abstractproduct.*;

public class VictorianChair implements Chair
{
    public void printChair()
    {
        System.out.println("This is a victorian Chair...");
    }
}
