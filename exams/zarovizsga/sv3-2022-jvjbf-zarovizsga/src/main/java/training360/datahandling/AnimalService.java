package training360.datahandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void saveAnimals(Path file){
        try(BufferedReader br = Files.newBufferedReader(file)){
            String line ;
            br.readLine();
            while((line=br.readLine())!=null){
                Animal animal = processLine(line);
                animalRepository.saveAnimal(animal);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot reach file!",e);
        }
    }

    public List<Animal> findAllAnimals(){
        return animalRepository.findAllAnimals();
    }

    public int countAllByAnimalType(String animalType){
        return  animalRepository.countAllByAnimalType(animalType);
    }

    private Animal processLine(String line) {
        String[] temp = line.split(";");
        return new Animal(temp[0], Integer.parseInt(temp[1]), LocalDate.parse(temp[2]));
    }
}
