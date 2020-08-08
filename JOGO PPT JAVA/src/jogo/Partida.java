/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Random;


/**
 *
 * @author Leonardo
 */
public class Partida {
    private int pedra;
    private int papel;
    private int tesoura;
    //pc
    int vc=0;
    int pc=0;
    int ec=0;
    //jogador
    int vp=0;
    int pp=0;
    int ep=0;
    

    public int getPedra() {
        return pedra;
    }

    public void setPedra(int pedra) {
        this.pedra = pedra;
    }

    public int getPapel() {
        return papel;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }

    public int getTesoura() {
        return tesoura;
    }

    public void setTesoura(int tesoura) {
        this.tesoura = tesoura;
    }
    
    public String partida(){
        Random geradorn = new Random();
        int computador=geradorn.nextInt(3);
        
        switch (computador) {
            case 0:
                ep++;
                ec++;
                return "Computador escolheu pedra";
            case 1:
                pp++;
                vc++;
                return "Computador escolheu papel\n";
            case 2:
                vp++;
                pc++;
                return "Computador escolheu tesoura\n";
            default:
                break;
        }
           
                
        switch (computador) {
            case 0:
                vp++;
                pc++;
                return "Computador escolheu pedra\n";
            case 1:
                ep++;
                ec++;
                return "Computador escolheu papel\n";
            case 2:
                pp++;
                vc++;
                return "Computador escolheu tesoura\n";
            default:
                break;
        }
          
                
        switch (computador) {
            case 0:
                pp++;
                vc++;
                return "Computador escolheu pedra\n";
            case 1:
                vp++;
                pc++;
                return "Computador escolheu papel\n";
            case 2:
                ep++;
                ec++;
                return "Computador escolheu tesoura\n";
            default:
                break;
        }
           
            return "Opcao invalida";
        }
    //computador    
    public int pcvitorias(){
        return this.vc;
    }
    public int pcderrotas(){
        return this.pc;
    }
    public int pcempates(){
        return this.ec;
    }
    //jogador
    public int jvitorias(){
        return this.vp;
    }
    public int jderrotas(){
        return this.pp;
    }
    public int jempates(){
        return this.ep;
    }
}
