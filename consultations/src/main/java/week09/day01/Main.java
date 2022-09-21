package week09.day01;


import week03.day01.Human;

import java.time.LocalTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Human> humans = List.of(new Human("John"),new Human("Jane"));
        List<String> names = List.of("John","Jack","Jane");

        System.out.println(names.contains("Jack"));
        System.out.println(humans.contains(new Human("John")));

    }
}
