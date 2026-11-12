package main.classesabstratas.dominio;

public class NotificacaoSms extends Notificacao{
    public NotificacaoSms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void envio() {
        System.out.println("Enviando SMS para o número do "+ this.destinatario+ " : "+ this.mensagem);
    }

    @Override
    public double calcularCusto() {
        double valorTotal = 0.1 + 0.02 * this.mensagem.length();
        return valorTotal;
    }
}
