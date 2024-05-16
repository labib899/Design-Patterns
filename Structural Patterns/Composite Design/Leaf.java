public class Leaf implements Component
{
    String name;
    int price;

    public Leaf() {}

    public Leaf(String name,int price)
    {
        this.name = name;
        this.price = price;
    }

    public void showPrice() 
    {
        System.out.println(this.price);
    }
}