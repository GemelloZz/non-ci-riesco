package it.epicode.non.ci.riesco.pizzeria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Bevande {
    private String acqua;
    private String cocacola;
    private String birra;

    private double costoAcqua = 1;
    private double costoCocacola = 12;
    private double costoBirra = 15;
}
