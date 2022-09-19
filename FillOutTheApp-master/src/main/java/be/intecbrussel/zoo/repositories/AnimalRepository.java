package be.intecbrussel.zoo.repositories;

import be.intecbrussel.zoo.data.Animal;
import be.intecbrussel.zoo.data.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AnimalRepository extends JpaRepository<Animal,Long> {
    public List<Animal> getAllByCountry(Country country);
}
