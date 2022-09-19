package be.intecbrussel.zoo.controllers.interfaces;

import org.springframework.ui.Model;
import be.intecbrussel.zoo.data.Country;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public interface CountryController {

    String showAllCountries(Model model);
    String createCountry (Country country);

    @PostMapping("/countries")
    String createCountry(@ModelAttribute Country country, Model model);
}
