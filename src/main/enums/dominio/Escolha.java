package main.enums.dominio;

public enum Escolha {
    PEDRA(1, "Pedra"),
    PAPEL(2, "Papel"),
    TESOURA(3, "Tesoura");

    private final int codigo;
    private final String descricao;

    Escolha(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Escolha escolha(int codigo){
        for (Escolha escolha : values()){
            if (escolha.getCodigo() == codigo){
                return escolha;
            }
        }
        return null;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
