package com.example.projetoaldo.objetos;

import java.io.Serializable;

public class Pessoa implements Serializable {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    String nome;
    String telefone;

}
