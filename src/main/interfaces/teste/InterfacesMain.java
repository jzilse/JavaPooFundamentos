package main.interfaces.teste;

import main.interfaces.dominio.ExecutaveldeTeste;
import main.interfaces.dominio.TesteIntegracao;
import main.interfaces.dominio.TesteUnitario;
import main.interfaces.dominio.TestedeCarga;

public class InterfacesMain {
    static void main(String[] args) {
        TesteUnitario testeUnitario = new TesteUnitario();
        TesteIntegracao testeIntegracao = new TesteIntegracao();

        testeIntegracao.executar();
        System.out.println(testeIntegracao.obterRelatorio());
        testeUnitario.executar();
        System.out.println(testeUnitario.obterRelatorio());

        System.out.println("----------");
        TestedeCarga testedeCarga = new TestedeCarga();
        testedeCarga.carregarDados();
        testedeCarga.executar();
        System.out.println(testedeCarga.obterRelatorio());
        testedeCarga.limparBanco();

        testeIntegracao.validarMassa();
        testeUnitario.validarMassa();

        ExecutaveldeTeste.verificarConexao();
    }
}
