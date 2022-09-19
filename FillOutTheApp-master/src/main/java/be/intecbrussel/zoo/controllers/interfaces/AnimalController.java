package be.intecbrussel.zoo.controllers.interfaces;

import org.springframework.ui.Model;
import be.intecbrussel.zoo.data.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AnimalController {
    String seeAllAnimalsByCountry(Model model, String countryName);
    String addAnimal(String animalName, String countryName);
    String deleteAnimal(long animalId);

    @GetMapping("/animals/{countryName}/{id}")
    String deleteAnimal(@PathVariable Long id);
}
