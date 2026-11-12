package main.interfaces.dominio;

public class TesteUnitario implements ExecutaveldeTeste{
    @Override
    public void executar() {
        System.out.println("Executando suíte de testes unitários");
    }

    @Override
    public String obterRelatorio() {
        return "Relatório: 100% dos testes unitários passaram.";
    }

    @Override
    public void validarMassa() {
        System.out.println("Validando massa de dados nos testes unitarios");
    }

}
