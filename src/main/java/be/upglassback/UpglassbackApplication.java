package be.upglassback;

import be.upglassback.core.controller.CountryContoller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class UpglassbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpglassbackApplication.class, args);

        CountryContoller countryContoller = new CountryContoller();
        countryContoller.renomme();

    }

}
