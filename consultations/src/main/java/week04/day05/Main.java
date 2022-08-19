package week04.day05;

public class Main {

    public static void main(String[] args) {
        String sFirst = null;
        String sSecond = "";

        sSecond.concat("alma");
        System.out.println(sSecond);
        String s = "alma";
        String s2 ="alma";
        String s3 = "almafa";
        String s4 = s3.substring(0,4);

        System.out.println(s==s2);
        System.out.println(s==s4);

        System.out.println(s.equals(s2));
        System.out.println(s.equals(s4));

    }
}
