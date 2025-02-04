package it.epicode.non.ci.riesco.ordine;
import it.epicode.non.ci.riesco.pizzeria.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class ordine {

    private int numeroOrdine;
    private String dataOrdine;
    private int numeroTavolo;
    private String statoOrdine;
    private int sommaOrdine;
    private String numeroCoperti;
    private List<Menu> ardinazioni;

}
