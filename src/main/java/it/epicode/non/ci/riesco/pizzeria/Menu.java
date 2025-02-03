package it.epicode.non.ci.riesco.pizzeria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu{
    private List<Pizza> pizze = new ArrayList<>();
}

