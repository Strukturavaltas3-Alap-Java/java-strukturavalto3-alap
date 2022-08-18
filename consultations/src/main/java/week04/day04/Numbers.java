package week04.day04;

public class Numbers {

    public int sumOfDigitsProggramerStyle(int number){
        String s = ""+number;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum+=Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }


    public int sumOfDigitsMathStyle(int number){
        int sum = 0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Numbers().sumOfDigitsProggramerStyle(183));
        System.out.println(new Numbers().sumOfDigitsMathStyle(183));
    }
}
