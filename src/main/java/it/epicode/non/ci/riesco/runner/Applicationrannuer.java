package it.epicode.non.ci.riesco.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import it.epicode.non.ci.riesco.pizzeria.Menu;
import it.epicode.non.ci.riesco.Tavolo.tavolo;

@Component
public class Applicationrannuer implements CommandLineRunner {
    @Autowired
    private Menu menu;
    private final tavolo tavolo1;

    public Applicationrannuer(tavolo tavolo1) {
        this.tavolo1 = tavolo1;
    }

    @Override
    public void run(String... args) throws Exception {

    }



}
