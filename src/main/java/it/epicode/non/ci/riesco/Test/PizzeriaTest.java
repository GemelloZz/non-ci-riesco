package it.epicode.non.ci.riesco.Test;
import it.epicode.non.ci.riesco.pizzeria.Bevande;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Autowired private Bevande cocacola;
        @Autowired private Bevande birra;

        public class PizzeriaTest {
    @Test
    @DisplayName("Test Bevande")
    public void testCocacola() {
        assertEquals("cocacola", cocacola.getNome());
        assertEquals(15, cocacola.getPrezzo());
        assertEquals(154, cocacola.getCalorie());
    }

    @Test
    @DisplayName("Test Bevande")
    public void testBirra() {
        assertEquals("birra", birra.getNome());
        assertEquals(20, birra.getPrezzo());
        assertEquals(200, birra.getCalorie());
    }

    @ParametizedTest
    @CsvSource({"cocacola, 15, 154", "birra, 20, 200"})
    @DisplayName("Test Bevande")
    public void testBirra2(String nome, double prezzo, double calorie) {
        assertEquals(nome, cocacola.getNome());
        assertEquals(prezzo, cocacola.getPrezzo());
        assertEquals(calorie, cocacola.getCalorie());
    }

}







