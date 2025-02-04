package it.epicode.non.ci.riesco.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import it.epicode.non.ci.riesco.pizzeria.toppings;

@Configuration
public class Toppingsconf {

    @Bean
    public toppings Cipolla(){

      return new toppings( "cipolla" , 15 ,154);

    }

    @Bean
    public toppings Salame() {
        toppings s = new toppings();
        s.setNome("salame");
        s.setCalorie(150);
        s.setPrezzo(10);
        return s;
    }


}
