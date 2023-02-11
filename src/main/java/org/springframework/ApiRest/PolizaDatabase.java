package org.springframework.ApiRest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class PolizaDatabase {

    @Bean
    CommandLineRunner init(PolizaRepository repository){
        return args -> {
            repository.save(new Poliza(1,"Pedro", 12345, new Date(1996, 11, 21),
                    new Date(2020, 03, 12), "Accidentes", 1000000, "Poliza Contra Accidentes",
                    "Medellin", "cll 33 C # 88 A - 93", "APA12F",
                    "MOD 2015", "Si"));

            repository.save(new Poliza(2,"Pablo",197626, new Date(1978, 05, 10), new Date(2017, 06, 30), "todo", 20000000, "Todo riezgo",
                    "Bogota", "av 33 #10 - 20", "PON39T", "MOD 2010", "No"));

            repository.save(new Poliza(3, "Manuel", 87463, new Date(1899, 06,30), new Date(2019, 05, 23),
                    "Salud", 12000000, "Poliza de Salud" , "Cartagena", "av 30 # 40 - 23", "PLJ32O", "MOD 2015",
                    "si"));

            repository.save(new Poliza(4, "camila", 954936, new Date(1997, 07, 21), new Date(2020, 01, 28),
                    "salud", 11000000, "poliza salud", "Monteria", "cll 21 A # 35 - 89",
                    "LAD34H", "MOD 2019", "no"));



        };
    }

}
