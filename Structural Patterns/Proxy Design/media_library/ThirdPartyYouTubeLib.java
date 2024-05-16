package media_library;

import java.util.*;

public interface ThirdPartyYouTubeLib 
{
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}