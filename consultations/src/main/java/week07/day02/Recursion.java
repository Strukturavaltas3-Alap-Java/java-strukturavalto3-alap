package week07.day02;

public class Recursion {

    public int factWithLoop(int n){
       int result = 1;
       for(int i=2;i<=n;i++){
           result*=i;
       }
       return result;
    }

    public int factWithRecursion(int n){
        if(n==1){
            return 1;
        }else{
            return n*factWithRecursion(n-1);
        }
    }


    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factWithLoop(5));
        System.out.println(recursion.factWithRecursion(11));
    }
}
