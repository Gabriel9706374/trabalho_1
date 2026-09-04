package test;

import model.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    
    @Test
    public void testSomaDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        calculadora.somar(5,3);
        assertEquals(8, calculadora.resultado);
    }  
}