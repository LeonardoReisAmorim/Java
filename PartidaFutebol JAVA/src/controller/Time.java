/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Leonardo
 */
public class Time {
    private String nome;
    private int nvitorias;
    private int nderrotas;
    private int nempate;

    public Time() {
        this.nome = null;
        this.nvitorias = 0;
        this.nderrotas = 0;
        this.nempate = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNvitorias() {
        return nvitorias;
    }

    public void setNvitorias(int nvitorias) {
        this.nvitorias = nvitorias;
    }

    public int getNderrotas() {
        return nderrotas;
    }

    public void setNderrotas(int nderrotas) {
        this.nderrotas = nderrotas;
    }

    public int getNempate() {
        return nempate;
    }

    public void setNempate(int nempate) {
        this.nempate = nempate;
    }
    
    public void ganharpartida(){
        this.setNvitorias(this.getNvitorias() + 1);
    }
    
    public void empatarpartida(){
        this.setNempate(this.getNempate() + 1);
    }
    
    public void perderpartida(){
        this.setNderrotas(this.getNderrotas() + 1);
    }
    
    
    //metodos status
    public String statusnome(){
        return this.getNome();
    }
    public int statusnvitorias(){
        return this.getNvitorias();
    }
    public int statusnempates(){
        return this.getNempate();
    }
    public int statusnderrotas(){
        return this.getNderrotas();
    }
}
