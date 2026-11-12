package main.classesabstratas.dominio;

public abstract class Notificacao {
    protected String destinatario;
    protected String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public abstract void envio();

    public abstract double calcularCusto();

    public void exibirResumo(){
        System.out.println(this.destinatario);
        System.out.println(this.mensagem);
        System.out.printf("%.2f\n",calcularCusto());
        envio();
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }
}
