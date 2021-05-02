package grouv.service;

import grouv.entity.Country;
import grouv.repository.CountryRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CountryService {
    
    @Autowired
    private CountryRepo countryRepo;

    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList();
        for (Country c : countryRepo.findAll()) {
            countries.add(c);
        }
        return countries;
    }
    
    public Country getRandomCountry() {
        List<Country> countries = getAllCountries();
        Random rand = new Random();
        int pick = rand.nextInt(239);
        Country question = countries.get(pick);
        return question;
    }

    
}

