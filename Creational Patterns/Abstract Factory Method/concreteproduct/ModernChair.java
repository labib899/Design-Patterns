package concreteproduct;

import abstractproduct.*;

public class ModernChair implements Chair
{
    public void printChair()
    {
        System.out.println("This is a modern Chair...");
    }
}