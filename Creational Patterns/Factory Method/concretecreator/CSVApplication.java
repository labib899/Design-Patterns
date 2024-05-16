package concretecreator;

import creator.*;
import product.*;
import concreteproduct.*;

public class CSVApplication implements Application 
{
    public Document createDocument() 
    {
        return new CSVDocument();
    }
}
