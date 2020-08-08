/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class conectabanco {
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/cadastro";
        try{
            return (Connection) DriverManager.getConnection(url,"root","root");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void adiciona(String prof, String id, String nome, String peso, String altura, String nacionalidade){
        //fazendo conexao com o banco
        Connection conectabanco = new conectabanco().getConnection();
        //colocando(insertando) os dados no banco
        String sql = "insert into pessoas"+
                     "(prof, id, nome, peso, altura, nacionalidade)"+
                     //? = n sei os dados q vao vim
                     "values (?,?,?,?,?,?)";
        try {
            //preparando o banco pra ser usado
            java.sql.PreparedStatement banco = conectabanco.prepareStatement(sql);
            //setando(colocando) os dados no banco
            banco.setString(1, prof);
            banco.setString(2, id);
            banco.setString(3, nome);
            banco.setString(4, peso);
            banco.setString(5, altura);
            banco.setString(6, nacionalidade);
            //executando o banco
            banco.execute();
            //mensagem para o usuario
            JOptionPane.showMessageDialog(null, "dados gravados");
            //fechando a conexao e o banco
            banco.close();
            conectabanco.close();
        } catch (SQLException ex) {
            Logger.getLogger(conectabanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluirdados(int chave){
        //fazendo conexao com o banco
        Connection conectabanco = new conectabanco().getConnection();
        //colocando(insertando) os dados no banco
        String sql = "delete from pessoas where id ="+chave;
        try {
            java.sql.PreparedStatement banco = conectabanco.prepareStatement(sql);
            banco.execute();
            JOptionPane.showMessageDialog(null, "dados apagados com sucesso");
            banco.close();
            conectabanco.close();
        } catch (SQLException ex) {
            Logger.getLogger(conectabanco.class.getName()).log(Level.SEVERE, null, ex);
        }
                     
    }
}
