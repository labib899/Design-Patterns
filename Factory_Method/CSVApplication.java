public class CSVApplication implements Application 
{
    public Document createDocument() 
    {
        return new CSVDocument();
    }
}
