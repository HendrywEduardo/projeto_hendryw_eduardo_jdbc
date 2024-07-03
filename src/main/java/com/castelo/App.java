package com.castelo;

import com.castelo.dao.ProdutoDao;
import com.castelo.dao.ProdutoPojo;
import com.castelo.modelo.Produto;

/*
 * Hello world!
 *
 */
public class App{

    public static void main( String[] args )
    {
       /* 
        Produto produto = new Produto();

        produto.setNome("pera argentina");;
        produto.setValor(35.00);
        produto.setId(2);
        


        ProdutoPojo produtoPojo = new ProdutoPojo();
        produtoPojo.setNome(produto.getNome());
        produtoPojo.setValor(produto.getValor());
        produtoPojo.setId(produto.getId());
        


        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.cadastrarProduto(produtoPojo);
        */ /* 
        
        
        Produto produto = new Produto();
        //produto.setNome("maça argentina");
        //produto.setValor(30.00);
        produto.setId(2);


        ProdutoPojo produtoPojo = new ProdutoPojo();
        //produtoPojo.setNome(produto.getNome());
        //produtoPojo.setValor(produto.getValor());
        produtoPojo.setId(produto.getId());
        


        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.deletarProduto(produtoPojo);
        */

        Produto produto = new Produto();

        produto.setId(2);


        ProdutoPojo produtoPojo = new ProdutoPojo();
        produtoPojo.setId(produto.getId());
        


        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.consultarProduto(produtoPojo);
         



    } 
}
