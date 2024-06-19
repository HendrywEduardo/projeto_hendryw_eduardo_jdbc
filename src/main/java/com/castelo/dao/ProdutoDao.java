package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.castelo.conexao.Conexao;

public class ProdutoDao {


      public void cadastrarProduto(ProdutoPojo produtoPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into produto(nome, valor, id) value (?, ?, ?)";

        PreparedStatement ps = null;


        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setString(1, produtoPojo.getNome());
            ps.setDouble(2, produtoPojo.getValor());
            ps.setInt(3, produtoPojo.getId());
          

            ps.execute();
            ps.close();

            System.out.println("Produto salvo com exito!");

         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Não foi possivel fornecer aprovação, revise o produto!");
        }
    } 
    

    public void deletarProduto(ProdutoPojo produtoPojo) {

        Conexao conexao = new Conexao();

        String sql = "DELETE FROM produto WHERE id = ?";

        PreparedStatement ps = null;


        try {

            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, produtoPojo.getId());
            
           

            ps.execute();
            ps.close();

            System.out.println("Dados deletados com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

           
        
    }  

}
