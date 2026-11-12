package main.tostring.teste;

import main.tostring.dominio.Usuario;

public class UsuarioTest {
    static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("Matheus");
        usuario.setCpf("111111111");
        usuario.setEmail("Matheus@gmail.com");
        System.out.println(usuario);
    }
}
