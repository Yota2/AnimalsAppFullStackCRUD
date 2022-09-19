package be.intecbrussel.zoo.repositories;

import be.intecbrussel.zoo.data.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,String> {
}
