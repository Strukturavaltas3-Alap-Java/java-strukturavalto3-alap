package week14.day02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {3, 4, 1, 7, 12, 8, 9, 0, 5};

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

      for(Integer i : numbers){
          System.out.println(i);
      }
    }

}
