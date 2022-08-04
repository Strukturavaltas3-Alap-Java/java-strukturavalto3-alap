package week02.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        int[] myArray  = {1,2,3,4}; //fix és elemekkel feltöltött
        int[] myArray2 = new int[10]; //fix és az alapértékkel feltöltöt
        System.out.println(myArray2[4]);

        String s = "Indul a görög aludni";
        String[] pieces = s.split(" ");
        System.out.println(pieces[2]);

        //Csomagolóosztály pl.: int -> Integer, double->Double

        Integer i = 7;
        List<Integer> myList = new ArrayList<>(); //üres Lista
        List<Integer> myList2 = new ArrayList<>(Arrays.asList(1,23,43,1));//bővíthető lista, elemekkel
        List<Integer> myList3 = Arrays.asList(1,23,4,4); //fix hosszú lista elemekkel

        myList.add(6);
        myList2.add(8);
        //myList3.add(9);


        List<Integer> testList = new ArrayList<>(Arrays.asList(1,4,6,1,2));
        List<Integer> testList2 = new ArrayList<>(Arrays.asList(1,4,6,7,12));

        ListAlgorithms listAlgorithms = new ListAlgorithms();

        System.out.println(listAlgorithms.isListIncreasing(testList));
        System.out.println(listAlgorithms.isListIncreasing(testList2));


    }
}
