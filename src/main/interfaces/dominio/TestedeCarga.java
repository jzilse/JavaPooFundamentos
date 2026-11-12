package main.interfaces.dominio;

public class TestedeCarga implements ExecutaveldeTeste, LimparAmbiente, CarregandoMassaDeDados{
    @Override
    public void carregarDados() {
        System.out.println(Ambiente_padrao);
    }

    @Override
    public void executar() {
        System.out.println("Executando testes de carga...");
    }

    @Override
    public String obterRelatorio() {
        return "Relatório: Testes de carga Concluidos";
    }

    @Override
    public void limparBanco() {
        System.out.println("Limpando Banco");
    }
}
