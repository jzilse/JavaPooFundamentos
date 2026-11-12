package main.modificadorfinal.dominio;

public class DiretorioLog {
    private String caminho;

    @Override
    public String toString() {
        return "DiretorioLog{" +
                "caminho='" + caminho + '\'' +
                '}';
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
