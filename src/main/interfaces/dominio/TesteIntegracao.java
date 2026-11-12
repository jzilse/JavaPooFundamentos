package main.interfaces.dominio;

public class TesteIntegracao implements ExecutaveldeTeste{
    @Override
    public void executar() {
        System.out.println("Executando testes de integração...");
    }

    @Override
    public String obterRelatorio() {
        return "Relatório: Integrações validadas com sucesso.";
    }
}
