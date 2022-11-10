package streams;

import java.util.*;
import java.util.stream.Collectors;

public class City {

    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public Optional<Building> getHighestBuilding() {
        return buildings.stream()
                .sorted(Comparator.comparing(Building::getLevels).reversed())
                .findFirst();
    }

    public List<Building> findBuildingsByStreet(String street) {
        return buildings.stream()
                .filter(b -> b.getStreet().equals(street))
                .collect(Collectors.toList());
    }

    public Set<String> findStreetsInCity() {
        return buildings.stream()
                .map(Building::getStreet)
                .collect(Collectors.toSet());
    }

    public boolean isThereBiggerAreaInStreetThan(String street, int value) {
        return buildings.stream()
                .filter(b -> b.getStreet().equals(street))
                .anyMatch(b -> b.getArea() > value);
    }
}
