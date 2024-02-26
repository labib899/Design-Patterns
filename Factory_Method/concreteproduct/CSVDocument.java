package concreteproduct;

import creator.*;
import product.*;
import concretecreator.*;

public class CSVDocument implements Document 
{
    public void open() 
    {
        System.out.println("Opening CSV document...");
    }

    public void close() 
    {
        System.out.println("Closing CSV document...");
    }

    public void save() 
    {
        System.out.println("Saving CSV document...");
    }

    public void revert() 
    {
        System.out.println("Reverting CSV document...");
    }
}