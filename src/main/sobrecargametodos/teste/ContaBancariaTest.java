package main.sobrecargametodos.teste;

import main.sobrecargametodos.dominio.ContaBancaria;

public class ContaBancariaTest {
    static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria("João", "008", 600, 400);
        contabancaria.imprime();
    }
}
