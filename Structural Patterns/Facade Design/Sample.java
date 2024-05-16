import java.io.*;
import media_library.*;
import facade.*;

public class Sample 
{
    public static void main(String[] args) 
    {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");

    }
}