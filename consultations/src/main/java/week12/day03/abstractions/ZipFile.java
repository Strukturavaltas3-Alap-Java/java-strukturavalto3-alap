package week12.day03.abstractions;

import java.util.List;

public class ZipFile implements File{

    public static final String EXTENSION = "zip";
    private static  final int ARCHIVE_PERCENT = 20;
    private String title;
    private List<File> files;

    public ZipFile(String title, List<File> files) {
        this.title = title;
        this.files = files;
    }

    @Override
    public String getFullName() {
        return title+"."+EXTENSION;
    }

    @Override
    public double calculateSize() {
        double sum = 0;
        for(File file : files){
            sum+=file.calculateSize();
        }

        return (sum*ARCHIVE_PERCENT)/100.0;
    }

    public File findBiggestFile(){
        if(files.isEmpty()){
            throw  new IllegalStateException("Zip is empty!");
        }

        File max = files.get(0);
        for(File file : files){
            if(max.calculateSize()<file.calculateSize()){
                max = file;
            }
        }
        return max;
    }

    public String getTitle() {
        return title;
    }

    public List<File> getFiles() {
        return files;
    }
}
