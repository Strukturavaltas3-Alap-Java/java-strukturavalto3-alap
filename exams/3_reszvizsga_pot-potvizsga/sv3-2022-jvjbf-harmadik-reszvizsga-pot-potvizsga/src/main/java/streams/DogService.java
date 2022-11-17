package streams;

import java.util.*;
import java.util.stream.Collectors;

public class DogService {

    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> findDogsBySize(Size size) {
        return dogs.stream()
                .filter(d -> d.getSize() == size)
                .collect(Collectors.toList());
    }

    public Optional<Dog> findOldestDog() {
        return dogs.stream()
                .max(Comparator.comparing(Dog::getAge));
    }

    public List<String> findDogNamesByBreedOlderThan(String breed, int age) {
        return dogs.stream()
                .filter(d -> d.getBreed().equals(breed))
                .filter(d -> d.getAge() > age)
                .map(Dog::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public Set<String> findDogBreeds() {
        return dogs.stream()
                .map(Dog::getBreed)
                .collect(Collectors.toSet());
    }
}
