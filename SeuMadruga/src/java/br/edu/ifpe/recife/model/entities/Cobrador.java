/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.entities;

/**
 *
 * @author User
 */
public class Cobrador {
    
    private int codigo;
    private String codNome;
    private String email;
    private String senha;
    private String habilidades;
    private String ferramentas; 
    private String breveDescricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodNome() {
        return codNome;
    }

    public void setCodNome(String codNome) {
        this.codNome = codNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }

    public String getBreveDescricao() {
        return breveDescricao;
    }

    public void setBreveDescricao(String breveDescricao) {
        this.breveDescricao = breveDescricao;
    }
    
}
