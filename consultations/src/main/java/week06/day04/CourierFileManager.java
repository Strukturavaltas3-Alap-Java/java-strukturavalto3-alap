package week06.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class CourierFileManager {

    private static final String DELIMITER = " ";

    public Courier createCourierByFile(Path path)  {
        Courier courier = new Courier();
        try {
            Scanner scanner = new Scanner(path);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] temp = line.split(DELIMITER);
                courier.addRide(new Ride(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2])));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot reach file!",e);
        }
        return courier;
    }


//    public Courier createCourierByFile(Path path)  {
//        Courier courier = new Courier();
//        try {
//            List<String> lines = Files.readAllLines(path);
//            for(String actualLine:lines){
//                String[] temp = actualLine.split(DELIMITER);
//                courier.addRide(new Ride(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2])));
//             }
//        } catch (IOException e) {
//            throw new IllegalArgumentException("Cannot reach file!",e);
//        }
//
//
//        return courier;
//    }
}
