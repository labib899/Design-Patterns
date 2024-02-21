public class TextDocument implements Document 
{
    public void open() 
    {
        System.out.println("Opening text document...");
    }

    public void close() 
    {
        System.out.println("Closing text document...");
    }

    public void save() 
    {
        System.out.println("Saving text document...");
    }

    public void revert() 
    {
        System.out.println("Reverting text document");
    }
}