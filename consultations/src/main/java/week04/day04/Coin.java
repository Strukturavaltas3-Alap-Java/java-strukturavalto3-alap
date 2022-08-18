package week04.day04;

public enum Coin {

    TEN(10,"Tiz"), TWENTY(20,"Husz"),
    FIFTY(50,"Otven"), HUNDRED(100,"Szaz"),
    TWO_HUNDRED(200,"Ketszaz");

    private int value;
    private String hungarianName;

    Coin(int value, String hungarianName) {
        this.value = value;
        this.hungarianName = hungarianName;
    }

    public int getValue() {
        return value;
    }

    public String getHungarianName() {
        return hungarianName;
    }
}
