package concreteproduct;

import abstractproduct.*;

public class ArtDecoChair implements Chair
{
    public void printChair()
    {
        System.out.println("This is an art deco Chair...");
    }
}