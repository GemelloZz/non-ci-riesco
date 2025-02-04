package it.epicode.non.ci.riesco.Tavolo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class tavolo {
    private int numeroTavolo;
    private int numeroPosti;
    private String stato;
}
