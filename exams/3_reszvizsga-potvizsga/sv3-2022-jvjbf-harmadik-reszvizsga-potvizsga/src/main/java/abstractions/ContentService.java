package abstractions;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContentService {

    private Set<Content> contents = new LinkedHashSet<>();

    public void addContent(Content content) {
        contents.add(content);
    }

    public List<Content> getContentsSortedByImportance() {
        return contents.stream()
                .sorted(Comparator.comparing(Content::getImportance).reversed())
                .collect(Collectors.toList());
    }

    public Set<Content> getContents() {
        return new LinkedHashSet<>(contents);
    }
}
