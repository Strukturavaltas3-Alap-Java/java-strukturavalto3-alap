package week06.day03;

public class SchoolEquipment {

    private int pieces;

    private String name;

    private String description;

    public SchoolEquipment(int pieces, String name, String description) {
        this.pieces = pieces;
        this.name = name;
        this.description = description;
    }

    public int getPieces() {
        return pieces;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
