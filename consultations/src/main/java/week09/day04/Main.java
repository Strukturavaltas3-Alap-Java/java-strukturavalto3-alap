package week09.day04;

import week09.day02.fishinterface.Clownfish;
import week09.day02.fishinterface.Fish;
import week09.day02.fishinterface.Kong;

public class Main {


    public static void main(String[] args) {
        Fish fish = new Clownfish("Nemo",1,"Orange_White");


        fish = new Kong("Kong",1,"ds");
    }
}
