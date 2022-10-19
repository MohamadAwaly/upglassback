package be.upglassback.core.controller;

import be.upglassback.core.entities.Country;
import be.upglassback.core.services.CountryService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

public class CountryContoller {
    CountryService countryService = new CountryService();

    public void renomme (){
        countryService.renomme(1, "test");
    }

    public Country getById(int id ){
        Country country = new Country();
        country = countryService.getById(id);
        System.out.printf("Le pays est lu");
        return country;
    }

    public void creeContry (){
        Scanner sc = new Scanner(System.in);
        //System.out.print("Quel est le nom du pays");
        //String nom = sc.nextLine();
        Country country = new Country();
        country.setCountryName("test");
        countryService.createCountry(country);
        System.out.println("Le pays a était créé, son identifiant est " + country.getIdCountry());
    }

}
