package week03.day01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //        int[][] myArray = {{1},{5,6},{7,8,9,32,12}};
//
//        for(int i=0;i<myArray.length;i++){
//            for(int j=0;j<myArray[i].length;j++){
//                System.out.print(myArray[i][j]+" ");
//            }
//            System.out.println();
//        }

//        int[] numbers = {1,2,34};
//        System.out.println(numbers[2]);
//
//        List<String> names = new ArrayList<>();
//        List<String> names2 = new ArrayList<>(Arrays.asList("John","Jane"));
//        List<String> names3 = Arrays.asList("John","Jane"); // nem módosítható


        Human human = new Human("John Doe");
        human.introduction();

        new Human("László").introduction();

        new Human("László").introduction();

        System.out.println(human.getName());

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Jane"));
        humans.add(new Human("Jack"));

        humans.get(0).introduction();

    }
}
