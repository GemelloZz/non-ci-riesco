package it.epicode.non.ci.riesco.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import it.epicode.non.ci.riesco.pizzeria.pizze;

@Configuration
public class Pizzeconf {

    @Bean
    public pizze Margherita(){

        return new pizze( "margherita" , 11 ,154);

    }

    @Bean
    public pizze Diavola() {
        pizze p = new pizze();
        p.setNome("salame");
        p.setCalorie(150);
        p.setPrezzo(10);
        return p;
    }


}