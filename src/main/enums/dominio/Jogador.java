package main.enums.dominio;

public class Jogador {
    private String nome;
    private Escolha escolha;

    public Jogador(String nome, Escolha escolha) {
        this.nome = nome;
        this.escolha = escolha;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "Nome='" + nome + '\'' +
                ", Número da escolha=" + escolha.getCodigo() +
                ", Escolha=" + escolha.getDescricao() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolha getEscolha() {
        return escolha;
    }
}
