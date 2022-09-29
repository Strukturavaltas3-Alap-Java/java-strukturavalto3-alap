package abstractions;

import java.util.ArrayList;
import java.util.List;

public class Series implements Content {

    private String title;
    private List<Video> videos = new ArrayList<>();

    public Series(String title, Video video) {
        this.title = title;
        addVideo(video);
    }

    public Series(String title, List<Video> videos) {
        this.title = title;
        this.videos = videos;
    }

    @Override
    public void addVideo(Video video) {
        videos.add(video);
    }

    public List<Video> getVideos() {
        return videos;
    }

    @Override
    public int getLength() {
        int sum = 0;
        for (Video video : videos) {
            sum += video.getLength();
        }
        return sum;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
