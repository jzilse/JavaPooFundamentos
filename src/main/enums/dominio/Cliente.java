package main.enums.dominio;

public class Cliente {
    private String nome;
    private StatusPedido statuspedido;

    public Cliente(String nome, StatusPedido statuspedido) {
        this.nome = nome;
        this.statuspedido = statuspedido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Código do status='" + statuspedido.getCodigo() + '\'' +
                ", Status do pedido=" + statuspedido.getDescricao() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusPedido getStatuspedido() {
        return statuspedido;
    }

}
