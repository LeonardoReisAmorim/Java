/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class Partida1 {
    private Time casa;
    private Time fora;
    private boolean aprovada;

    public Partida1() {
        this.aprovada = false;
    }

    public Time getCasa() {
        return casa;
    }

    public void setCasa(Time casa) {
        this.casa = casa;
    }

    public Time getFora() {
        return fora;
    }

    public void setFora(Time fora) {
        this.fora = fora;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void aprovada(Time t1, Time t2){
        this.aprovada = !t1.getNome().equalsIgnoreCase(t2.getNome());
    }
    
    public String partida(){
        if(this.aprovada==true){
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    this.getCasa().empatarpartida();
                    this.getFora().empatarpartida();
                    return "o "+this.getCasa().getNome()+" empatou com o "+this.getFora().getNome();
                
                case 1:
                    
                    this.getCasa().ganharpartida();
                    this.getFora().perderpartida();
                    return "o "+this.getCasa().getNome()+" ganhou do "+this.getFora().getNome();
                
                case 2:
                    this.getCasa().perderpartida();
                    this.getFora().ganharpartida();
                    return "o "+this.getCasa().getNome()+" perdeu do "+this.getFora().getNome();
                
                default:
                    return "opcao invalida";
            }
        }
        else{
            return "nao pode acontecer a partida";
        }
    }
    
    public String statusreprovado(){
        if(this.aprovada==false){
            return "nao tem como mostrar status";
        } else{
            return "mostrando status";
        }
    }
    
}
