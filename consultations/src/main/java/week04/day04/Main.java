package week04.day04;

public class Main {


    public static void main(String[] args) {
        String s = "123";
        int num = Integer.parseInt(s);
        String s2= ""+num;
        StringBuilder sb = new StringBuilder();
        sb.append(num);

        char[] chars = s.toCharArray();
        for(int i =0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        int i = (int) 3.12;
    }

}
