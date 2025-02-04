package it.epicode.non.ci.riesco.pizzeria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bevande {
    private String nome;
    private double prezzo ;
    private double calorie;


}
