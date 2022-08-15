package week04.day01;

public class Prison {

    private boolean[] prisonCells = new boolean[100];


    public void openFreeCells() {
        for (int i = 0; i < 100; i++) {
            for (int j = i; j < 100; j+=i+1) {
                prisonCells[j] = !prisonCells[j];
            }
        }
    }

    public boolean[] getPrisonCells() {
        return prisonCells;
    }
}
