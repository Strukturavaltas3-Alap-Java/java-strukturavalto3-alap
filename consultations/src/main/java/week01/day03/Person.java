package week01.day03;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
//        System.out.println("Név: Teszt Elek");
//        System.out.println("Születési hely, idő: Budapest, 1983.05.27.");
//        System.out.println("Anyja neve: Minta Gizella");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevét!");
        String name = scanner.nextLine();
        System.out.println("Adja meg a születési helyét!");
        String city = scanner.nextLine();
        System.out.println("Adja meg a születési idejét!");
        String date = scanner.nextLine();
        System.out.println("Adja meg az édesanyja leánykori nevét!");
        String mother = scanner.nextLine();

        System.out.println("Név: " + name);
        System.out.println("Születési hely, idő: " + city + ", " + date);
        System.out.println("Anyja neve: " + mother);
    }
}
