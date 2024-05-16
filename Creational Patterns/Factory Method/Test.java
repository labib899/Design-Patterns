import creator.*;
import product.*;
import concretecreator.*;
import concreteproduct.*;

public class Test
{
    public static void main(String[] args) 
    {
        Application app1 = new TextApplication();
        app1.createDocument().open();

        Application app2 = new CSVApplication();
        app2.createDocument().close();
    }
}