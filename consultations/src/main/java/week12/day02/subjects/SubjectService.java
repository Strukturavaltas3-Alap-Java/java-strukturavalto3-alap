package week12.day02.subjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubjectService {


    private List<Subject> subjects = new ArrayList<>();


    public void readSubjectsFromFile(Path path){

        try(BufferedReader br = Files.newBufferedReader(path)) {
            br.readLine();
            String line;
            while((line=br.readLine()) != null){
                Subject subject = processBlock(line,br);
                subjects.add(subject);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file",e);
        }catch (NumberFormatException nfe){
            throw  new IllegalArgumentException("File is not valid",nfe);
        }
    }

    public int summarizeNumberOfLessonsByTeacher(String teacherName) {
        int sum = 0;
        for (Subject actual : subjects) {
            if (actual.getTeacher().equals(teacherName)) {
                sum += actual.getNumberOfLesson();
            }
        }
        if(sum==0){
            throw new CannotFindTeacherException("Name is invalid!");
        }
        return sum;
    }

    private Subject processBlock(String line, BufferedReader br) throws IOException {
        String teacher = line;
        String subjectName = br.readLine();
        String group = br.readLine();
        int numberOfLessons = Integer.parseInt(br.readLine());
        return new Subject(teacher,subjectName,group,numberOfLessons);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}



//        List<String> lines = Files.readAllLines(path);
//            for(int i=0;i<lines.size()-4;i+=4){
//                Subject s = new Subject(lines.get(i),lines.get(i+1),lines.get(i+2),Integer.parseInt(lines.get(i+3)));
//                subjects.add(s);
//            }
