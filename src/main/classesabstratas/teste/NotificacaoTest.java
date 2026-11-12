package main.classesabstratas.teste;

import main.classesabstratas.dominio.NotificacaoEmail;
import main.classesabstratas.dominio.NotificacaoSms;

public class NotificacaoTest {
    static void main(String[] args) {
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail("Samuel", "Você sabia que o fortnite está entregando um token de loja grátis", "Fortnite");
        System.out.println("-----------");
        notificacaoEmail.exibirResumo();
        System.out.println("-----------");

        NotificacaoSms notificacaoSms = new NotificacaoSms("Samuel", "Você sabia que o fortnite está entregando um token de loja grátis");
        notificacaoSms.exibirResumo();
    }
}
