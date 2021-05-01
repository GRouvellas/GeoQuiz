package grouv.repository;

import grouv.entity.Country;
import org.springframework.data.repository.CrudRepository;


public interface CountryRepo extends CrudRepository<Country, String>{
    
}
