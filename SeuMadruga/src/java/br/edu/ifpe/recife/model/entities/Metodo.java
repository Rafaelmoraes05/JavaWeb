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
public class Metodo {
    
    private int codigo;
    private String nome;
    private String descricao;
    private int intensidadeSugerida;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriao() {
        return descricao;
    }

    public void setMetodo(String metodo) {
        this.descricao = metodo;
    }

    public int getIntensidadeSugerida() {
        return intensidadeSugerida;
    }

    public void setIntensidadeSugerida(int intensidadeSugerida) {
        this.intensidadeSugerida = intensidadeSugerida;
    }
    
}
