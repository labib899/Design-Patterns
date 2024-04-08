public class Sample
{
    public static void main(String[] args)
    {
        Component hdd       = new Leaf("hdd" , 5000);
        Component keyboard  = new Leaf("keyboard",11500);
        Component mouse     = new Leaf("mouse",9500);
        Component ram       = new Leaf("ram",4500);
        Component processor = new Leaf("processor",37000);

        Composite motherboard = new Composite("motherboard");
        motherboard.add(ram);
        motherboard.add(processor);

        Composite cabinet  = new Composite("cabinet");
        cabinet.add(hdd);
        cabinet.add(motherboard);

        Composite peripherals     = new Composite("peripherals");
        peripherals.add(keyboard);
        peripherals.add(mouse);

        Composite computer = new Composite("computer");
        computer.add(cabinet);
        computer.add(peripherals);
        computer.showPrice();
    }
}