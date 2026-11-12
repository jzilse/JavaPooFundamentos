package main.sobrecargametodos.teste;

import main.sobrecargametodos.dominio.CalculadoraGeometrica;

public class CalculadoraGeoTest {
    static void main(String[] args) {
        CalculadoraGeometrica calculadorageometrica = new CalculadoraGeometrica();
        calculadorageometrica.setGeral(2, true);
        calculadorageometrica.imprime();

    }
}
