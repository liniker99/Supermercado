/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Liniker
 */
public class TestaCarrinho {
    public static void main(String[] args){
        
        CarrinhoDeCompras produto = new CarrinhoDeCompras();
        
        produto.adicionaProduto(new Produto("Sabão",2.00));
        produto.adicionaProduto(new Produto("Fralda",15.00));
        produto.adicionaProduto(new Produto("Arroz",3.00));
        produto.adicionaProduto(new Produto("Feijão",5.00));
        
        MaiorEMenor m = new MaiorEMenor();
        m.encontraValor(produto);
        System.out.println("Maior: " + m.maior.getNome());
        System.out.println("Menor: " + m.menor.getNome());
        
        
        
        
        
        
    }
}
