package week02.day03;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        for(int i=0;i*i<number;i++){
//            System.out.println(i*i);
//        }

        Mathematics mathematics = new Mathematics();
        int number = scanner.nextInt();

        System.out.println(mathematics.isPrime(number));


    }
}
