package guinness;

public enum RecordType {

    TIME("s"), QUANTITY("quantity unit");

    private String unit;

    RecordType(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
