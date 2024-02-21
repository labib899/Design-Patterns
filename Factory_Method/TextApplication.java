public class TextApplication implements Application 
{
    public Document createDocument() 
    {
        return new TextDocument();
    }
}
