package week04.day01;

public class PerfectNumbers {


    public boolean isPerfectNumber(int number){
        int sumOfDivisors = 0;
        for(int i=1;i<number;i++){
            if(number % i == 0){
                sumOfDivisors+=i;
            }
        }
        return sumOfDivisors == number;
    }

    public static void main(String[] args) {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        for(int i=1;i<100_000;i++){
            if(perfectNumbers.isPerfectNumber(i)){
                System.out.println(i);
            }
        }
    }
}
