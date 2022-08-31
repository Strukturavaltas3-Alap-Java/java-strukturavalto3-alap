package week06.day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FirstA {

    private List<SchoolEquipment> equipments = new ArrayList<>();

    public FirstA(Path path) {
        loadEquipmentsFromFile(path);
    }

    private void loadEquipmentsFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            load(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void load(List<String> lines) {
        for (String line : lines) {
            String[] parts = line.split(";"); // ["3", "négyzetrácsos füzet", "kis alakú"]
            int pieces = Integer.parseInt(parts[0]);
            SchoolEquipment equipment = new SchoolEquipment(pieces, parts[1], parts[2]);
            equipments.add(equipment);
        }
    }

    public List<SchoolEquipment> getEquipments() {
        return equipments;
    }
}
