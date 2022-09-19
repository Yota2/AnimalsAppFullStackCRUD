package be.intecbrussel.zoo.services.servicesImpl;

import be.intecbrussel.zoo.data.Animal;
import be.intecbrussel.zoo.data.Country;
import be.intecbrussel.zoo.repositories.AnimalRepository;
import be.intecbrussel.zoo.services.interfaces.AnimalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Animal getAnimalByID(long id) {
        return animalRepository.findById(id).get();
    }

    @Override
    public List<Animal> getAnimalsByCountry(Country country) {

       /* List<Animal> animalList = animalRepository.findAll();
        for(Animal animal:animalList){
            if(animal.getCountry().equals(country)){
                return animalList;
            }
        }*/

        List<Animal> animals = new ArrayList<>();
        animalRepository.getAllByCountry(country)
                .forEach(animals::add);
        return animals;

    }

    @Override
    public void addAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    @Override
    public void deleteAnimal(long id) {
        animalRepository.deleteById(id);
    }
}
