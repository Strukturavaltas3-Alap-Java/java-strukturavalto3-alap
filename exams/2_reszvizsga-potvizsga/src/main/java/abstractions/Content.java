package abstractions;

public interface Content {

    int getLength();
    String getTitle();
    default void addVideo(Video video) {
        throw new IllegalStateException("Cannot add more video for this type of content!");
    }
}
