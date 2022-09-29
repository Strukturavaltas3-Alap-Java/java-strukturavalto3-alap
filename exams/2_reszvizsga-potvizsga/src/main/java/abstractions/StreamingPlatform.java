package abstractions;

import java.util.ArrayList;
import java.util.List;

public class StreamingPlatform {

    private List<Content> contents = new ArrayList<>();

    public void addContent(Content content) {
        contents.add(content);
    }

    public List<Content> getContents() {
        return contents;
    }

    public Content findLongestContent() {
        if (contents.isEmpty()) {
            throw new IllegalStateException("Streaming platform is empty!");
        }
        Content maxContent = contents.get(0);
        int maxLength = 0;
        for (Content actual : contents) {
            int actLength = actual.getLength();
            if (actLength > maxLength) {
                maxContent = actual;
                maxLength = actLength;
            }
        }
        return maxContent;
    }
}
