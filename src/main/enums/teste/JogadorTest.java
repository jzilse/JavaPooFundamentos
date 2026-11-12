package main.enums.teste;

import main.enums.dominio.Escolha;
import main.enums.dominio.Jogador;

public class JogadorTest {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Lucas", Escolha.escolha(3));
        System.out.println(jogador);

    }
}
