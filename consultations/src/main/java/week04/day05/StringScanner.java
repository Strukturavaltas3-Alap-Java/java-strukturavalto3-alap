package week04.day05;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String s = scannerInput.nextLine();

        Scanner scannerWords = new Scanner(s);
        while(scannerWords.hasNext()){
            System.out.println(scannerWords.next());
        }

        Scanner scannerSentences = new Scanner(s).useDelimiter(", ");
        while(scannerSentences.hasNext()){
            System.out.println(scannerSentences.next());
        }



    }
}
