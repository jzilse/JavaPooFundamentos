package main.enums.dominio;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO(1, "Aguardando Pagamento"),
    EM_PROCESSAMENTO(2, "Em Processamento"),
    ENVIADO(3, "Enviado"),
    ENTREGUE(4,"Entregue"),
    CANCELADO(5, "Cancelado");

    private final int Codigo;
    private final String Descricao;

    StatusPedido(int Codigo, String Descricao) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
    }

    //Pegar o statuspedido pelos atributos e não pelas constantes
    public static StatusPedido obterCodigo(int codigo){
        for (StatusPedido statuspedido : values()){
            if (statuspedido.getCodigo() == codigo){
                return statuspedido;
            }
        }
        return null;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

}
