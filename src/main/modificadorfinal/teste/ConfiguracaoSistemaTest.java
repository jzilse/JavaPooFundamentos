package main.modificadorfinal.teste;

import main.modificadorfinal.dominio.ConfiguracaoSistema;

public class ConfiguracaoSistemaTest {
    static void main(String[] args) {
        ConfiguracaoSistema configuracaoSistema = new ConfiguracaoSistema();
        configuracaoSistema.setNomeAplicacao("Login");
        System.out.println(configuracaoSistema.getNomeAplicacao());
        configuracaoSistema.diretorioLog.setCaminho("/var/log/sistema.log");
        System.out.println(configuracaoSistema.diretorioLog);
    }
}
