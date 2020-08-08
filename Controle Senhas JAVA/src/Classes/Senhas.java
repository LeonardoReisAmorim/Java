package Classes;

import java.util.ArrayList;
import java.util.Arrays;


public class Senhas {
    private int senhas[] = new int [5];
    private int senhasch[] = new int [5];
    private ArrayList <Integer> senhasnc = new ArrayList<>(); 
    private int qtnchamadas=5;
    private int comparecido = 0;
    private int cont=0;

    
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    public void GerarSenhas() 
    {
        for (int i=0;i<senhas.length;i++)
        {
            senhas[i] = i+1;
        }
    }
    
    public String VisualizarSenhas()
    {
        this.GerarSenhas();
        return Arrays.toString(senhas);
    }
    
    public void ChamarSenhas(int senha)
    {  
        for (int i=0;i<senhas.length;i++)
        {
            if (senha == senhas[i])
            {
                senhasch[i] = senha;
                comparecido++;
                qtnchamadas--;
            }
        }   
        
    }
    public void VerificarSenhasChamadas(int senha)
    {
        for (int k=0; k<5; k++)
         {
           if (senhasch[k] == senha)
           {
               setCont(1);
               break;
           }
           else
           {
              
                      
           }
         }
    }
    
     public String MostrarSenhasNaoComparecidas(int senha)
    {
        if(senhasnc.contains(senha)==false){
             senhasnc.add(senha);
        }
        
        return senhasnc.toString();
    } 
    
    public int ExibirQtdeSenhasnaoChamadas()
    {
        return qtnchamadas;
    }
    
    public String ApresentarSenhasComparecidas()
    {
        
        return Arrays.toString(senhasch);
    }
    
    
}
