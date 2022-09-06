package week07.day02;

public class Methods {


    public void inc(int i){
        i++;
    }

    public void changeS(String s){
        s=s.concat("alma");
    }

    public void changeSb(StringBuilder sb){
        sb.append("alma");
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        int i = 7;
        methods.inc(i);
        System.out.println(i);

        String s = "körte";
        methods.changeS(s);
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("körte");
        methods.changeSb(stringBuilder);
        System.out.println(stringBuilder);
    }

}
