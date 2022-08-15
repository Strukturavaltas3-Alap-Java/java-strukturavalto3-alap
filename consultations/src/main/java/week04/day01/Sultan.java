package week04.day01;

public class Sultan {

    public static void main(String[] args) {
        Prison prison = new Prison();

        prison.openFreeCells();

        for(int i=0;i<prison.getPrisonCells().length;i++){
            if(prison.getPrisonCells()[i]){
                System.out.println(i+1);
            }
        }

    }
}
