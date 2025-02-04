package it.epicode.non.ci.riesco.Tavolo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Tavoloconf {
    @Bean
    public tavolo tavolo1() {
        return new tavolo( 1 , 10 , "in corso");



    }
    @Bean
    public tavolo tavolo2() {
        return new tavolo( 2 , 10 , "in corso");



    }
    @Bean
    public tavolo tavolo3() {
        return new tavolo( 3 , 10 , "in corso");



    }

}
