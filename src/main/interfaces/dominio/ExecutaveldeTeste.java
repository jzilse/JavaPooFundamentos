package main.interfaces.dominio;

public interface ExecutaveldeTeste {
    void executar();
    String obterRelatorio();
    default void validarMassa(){
        System.out.println("Validando pré-condições da massa de dados");
    }
    static void verificarConexao(){
        System.out.println("Checando disponibilidade do ambiente");
    }
}
