package main.modificadorfinal.dominio;

public class ConfiguracaoSistema {
    public final static double LIMITE_TENTATIVAS_LOGIN = 3;
    private String nomeAplicacao;
    public final DiretorioLog diretorioLog = new DiretorioLog();

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }
}
