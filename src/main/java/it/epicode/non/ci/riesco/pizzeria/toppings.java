package it.epicode.non.ci.riesco.pizzeria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class toppings {
    private String funghi;
    private String salame;
    private String ananas;
    private String cipolla;

    private double costoFunghi = 12;
    private double costoSalame = 11;
    private double costoAnanas = 13;
    private double costoCipolla = 11;
}

