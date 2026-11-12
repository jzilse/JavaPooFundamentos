package main.classesabstratas.dominio;

public class NotificacaoEmail extends Notificacao{
    protected String assunto;

    public NotificacaoEmail(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void envio() {
        System.out.println("Enviando E-mail para "+ this.destinatario + " com o assunto " +this.assunto+ " : "+this.mensagem);
    }

    @Override
    public double calcularCusto() {
        return 0.05;
    }

}
