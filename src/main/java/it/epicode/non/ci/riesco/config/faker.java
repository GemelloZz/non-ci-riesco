package it.epicode.non.ci.riesco.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Locale;

    @Configuration
    public class Faker {



        @Bean
        public Faker faker() {
            return new Faker(Locale.ITALIAN);
        }

    }

