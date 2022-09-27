package abstractions;

import java.util.List;

public class ZipFile implements File {
    private static final String EXTENSION = "zip";
    private static final int ARCHIVE_PERCENT = 20;

    private String title;
    private List<File> files;

    public ZipFile(String title, List<File> files) {
        this.title = title;
        this.files = files;
    }


    @Override
    public String getFullName() {
        return title + "." + EXTENSION;
    }

    @Override
    public double calculateSize() {
        double sum = 0;
        for (File file : files) {
            sum += file.calculateSize();
        }
        return (sum * ARCHIVE_PERCENT) / 100.0;
    }

    public File findBiggestFile() {
        checkListIsEmpty();
        File biggest = files.get(0);
        for (File file : files) {
            if (file.calculateSize() > biggest.calculateSize()) {
                biggest = file;
            }
        }
        return biggest;
    }

    private void checkListIsEmpty() {
        if (files.size() == 0) {
            throw new IllegalStateException("Zip is empty!");
        }
    }

    public String getTitle() {
        return title;
    }

    public List<File> getFiles() {
        return files;
    }
}
