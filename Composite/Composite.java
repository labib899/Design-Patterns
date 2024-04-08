//import javax.management.*;
import java.util.*;

public class Composite implements Component 
{
    String name;
    ArrayList<Component> components;

    public Composite() {}

    public Composite(String name)
    {
        this.name = name;
        components = new ArrayList<>();
    }

    public void showPrice()
    {
        for (Component comp: components) comp.showPrice();
    }

    public void add(Component subComponent)
    {
        components.add(subComponent);
    }

}