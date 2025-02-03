package it.epicode.non.ci.riesco.pizzeria;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.Arrays;

@Configuration
public class Menuconf {

    @Bean
    public Menu menu() {
     return new Menu(
             Arrays.asList(
                  new Pizza("margherita " , 12.22),
             )
     );

    }
}
