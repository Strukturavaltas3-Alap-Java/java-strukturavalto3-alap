package week13.day04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
//        Queue<Integer> numbers = new LinkedList<>();
//
//        numbers.add(12);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(7);
//
//        System.out.println(numbers.remove());
//        System.out.println(numbers.remove());
//        System.out.println(numbers.remove());
//        System.out.println(numbers.remove());

        Deque<Integer> otherNumbers = new ArrayDeque<>();

        otherNumbers.push(12);
        otherNumbers.add(3);
        otherNumbers.push(5);
        otherNumbers.push(7);

        System.out.println(otherNumbers.remove());
        System.out.println(otherNumbers.pop());
        System.out.println(otherNumbers.remove());
        System.out.println(otherNumbers.remove());


    }
}
