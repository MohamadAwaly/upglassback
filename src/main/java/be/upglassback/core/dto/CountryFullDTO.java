package be.upglassback.core.dto;


public class CountryFullDTO {

    // Utilisé commons beanutils
    // Framwork dozer mais il est un peut veillisant
    // orica
    // model mapper
    // pour automatisée entre dto et entity

    private int idCountry;

    private String countryName;

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
