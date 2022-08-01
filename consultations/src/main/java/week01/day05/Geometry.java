package week01.day05;

import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az a oldalt:");
        int sideA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a b oldalt:");
        int sideB = scanner.nextInt();
        scanner.nextLine();

//        Rectangle rectangle = new Rectangle(5, 6);
        Rectangle rectangle = new Rectangle(sideA, sideB);
        System.out.println("Az a oldal hossza: " + rectangle.getSideA());
        System.out.println(rectangle.getSideB());
        System.out.println(rectangle.calculateArea());
    }
}
