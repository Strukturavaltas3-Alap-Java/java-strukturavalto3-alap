package week02.day05;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int generatedNumber = random.nextInt(1, 101);
        System.out.println(generatedNumber);
        GuessTheNumber gtn = new GuessTheNumber();
        gtn.guessingNumber(generatedNumber);
    }


    public void guessingNumber(int generatedNumber){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Kérem a számot:");
            int number = sc.nextInt();
            sc.nextLine();
            if(number<generatedNumber){
                System.out.println("A szám nagyobb");
            }else if(number>generatedNumber){
                System.out.println("A szám kisebb");
            }else{
                System.out.println("Nyert");
                return;
            }
        }
        System.out.println("Nincs több próbálkozásod!");
    }
}
