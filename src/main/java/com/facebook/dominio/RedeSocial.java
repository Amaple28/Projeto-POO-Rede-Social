package com.facebook.dominio;

import java.util.LinkedList;
import java.util.List;

public class RedeSocial {
    private List<Usuario> listaUsuarios = new LinkedList<>();

    public Usuario criarConta(String email, String senha, String nome) {
        var usuario = new Usuario(email, nome, senha);
        listaUsuarios.add(usuario);

        return usuario;
    }
}
