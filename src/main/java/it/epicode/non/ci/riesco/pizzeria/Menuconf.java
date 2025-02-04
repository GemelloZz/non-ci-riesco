package it.epicode.non.ci.riesco.pizzeria;
import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@RequiredArgsConstructor
@Configuration
public class Menuconf {

    private final Bevande Cocacola ;
    private final Bevande birra;
    private final pizze Margherita;
    private final pizze Diavola;
    private final toppings Cipolla;
    private final toppings Salame;

   @Bean
   public Menu menu() {
       return new Menu(Arrays.asList(Margherita, Diavola),
               Arrays.asList(Cocacola, birra),
               Arrays.asList(Cipolla, Salame));

   }



}

