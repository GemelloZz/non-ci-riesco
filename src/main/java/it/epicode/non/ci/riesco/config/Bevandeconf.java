package it.epicode.non.ci.riesco.config;
import it.epicode.non.ci.riesco.pizzeria.toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import it.epicode.non.ci.riesco.pizzeria.Bevande;
@Configuration
public class Bevandeconf {

    @Bean
    public Bevande Cocacola(){

        return new Bevande( "cocacola" , 15 ,154);

    }

    @Bean
    public toppings birra() {
        toppings b = new toppings();
        b.setNome("energia");
        b.setCalorie(150);
        b.setPrezzo(10);
        return b;
    }


}
