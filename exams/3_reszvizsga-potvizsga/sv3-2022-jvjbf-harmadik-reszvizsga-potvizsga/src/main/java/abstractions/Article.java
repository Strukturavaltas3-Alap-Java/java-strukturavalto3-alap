package abstractions;

import java.util.List;
import java.util.Objects;

public class Article implements Content {

    private Header header;
    private String writer;
    private List<String> contentOfArticle;

    public Article(Header header, String writer, List<String> contentOfArticle) {
        this.header = header;
        this.writer = writer;
        this.contentOfArticle = contentOfArticle;
    }

    @Override
    public String getTitle() {
        return header.getTitle();
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public int getImportance() {
        return header.getHeaderSize() * contentOfArticle.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        return Objects.equals(header, article.header);
    }

    @Override
    public int hashCode() {
        return header != null ? header.hashCode() : 0;
    }
}
