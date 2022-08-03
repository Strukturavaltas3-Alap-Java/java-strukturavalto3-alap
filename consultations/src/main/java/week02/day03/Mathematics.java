package week02.day03;

public class Mathematics {


//    public boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//               return false;
//            }
//        }
//        return true;
//    }   //Péter Megoldása


    public boolean isPrime(int number) {
        if (numberOfDivisors(number) == 2) {
            return true;
        }
        return false;
    }

    private int numberOfDivisors(int number) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }
}
