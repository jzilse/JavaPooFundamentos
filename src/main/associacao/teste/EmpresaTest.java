package main.associacao.teste;

import main.associacao.dominio.Participante;

public class EmpresaTest {
    static void main(String[] args) {
    Participante participante1 = new Participante("João");
    Participante participante2 = new Participante("Samuel");
    Participante participante3 = new Participante("Julia");
    Participante[] participantes = {participante1,participante2,participante3};

    for (Participante participante:participantes){
        participante.imprime();
    }


    }
}