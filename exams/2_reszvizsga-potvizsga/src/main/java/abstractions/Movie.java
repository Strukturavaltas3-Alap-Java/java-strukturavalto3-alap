package abstractions;

public class Movie implements Content {

    private Video video;

    public Movie(Video video) {
        this.video = video;
    }

    @Override
    public int getLength() {
        return video.getLength();
    }

    @Override
    public String getTitle() {
        return video.getTitle();
    }

}
