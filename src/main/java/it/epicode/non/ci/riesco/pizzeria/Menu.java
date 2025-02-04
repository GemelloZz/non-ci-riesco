package it.epicode.non.ci.riesco.pizzeria;

import it.epicode.non.ci.riesco.config.Bevandeconf;
import it.epicode.non.ci.riesco.config.Pizzeconf;
import it.epicode.non.ci.riesco.config.Toppingsconf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu{
    private List<pizze> pizze = new ArrayList<>();
    private List<Bevande> bevande = new ArrayList<>();
    private List<toppings> toppings = new ArrayList<>();

}

