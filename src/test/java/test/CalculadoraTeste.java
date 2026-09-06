package test;

import model.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    @Test
    public void testSomaDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();

        calculadora.somar(5, 3);

        assertEquals(8, calculadora.resultado);
    }

    @Test
    public void testSubtracaoDoisNumeros() {
        Calculadora calculadora = new Calculadora();

        calculadora.substrair(10, 4);

        assertEquals(6, calculadora.resultado);
    }

    @Test
    public void testMultiplicacaoDoisNumeros() {
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicar(5, 4);

        assertEquals(20, calculadora.resultado);
    }

    @Test
    public void testDivisaoDoisNumeros() {
        Calculadora calculadora = new Calculadora();

        calculadora.dividir(10, 2);

        assertEquals(5, calculadora.resultado);
    }
}