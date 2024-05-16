package concretecreator;

import creator.*;
import product.*;
import concreteproduct.*;

public class TextApplication implements Application 
{
    public Document createDocument() 
    {
        return new TextDocument();
    }
}
