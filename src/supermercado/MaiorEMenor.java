/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.List;

/**
 *
 * @author Liniker
 */
public class MaiorEMenor {
    
    Produto maior;
    Produto menor;
    
    public void encontra(CarrinhoDeCompras carrinho){
        maior = carrinho.getProdutos().get(0);
        menor = carrinho.getProdutos().get(0);
        
        for(Produto prod : carrinho.getProdutos()){
            if(maior.getValor() < prod.getValor()){
                maior = prod;
            }
            if(prod.getValor() < menor.getValor()){
                menor = prod;
            }
        }
    }
    
    public void encontraValor(CarrinhoDeCompras carrinho){
        this.maior = new Produto("",Double.NEGATIVE_INFINITY);
        this.menor = new Produto("",Double.POSITIVE_INFINITY);
        
        for(Produto produto : carrinho.getProdutos()){
            if(produto.getValor() > maior.getValor()){
                maior = produto;
            }
            if(produto.getValor() < menor.getValor()){
                menor = produto;
            }
            
        }
    }
    
    public Produto getMaior() {
        return maior;
    }

    public Produto getMenor() {
        return menor;
    }
    
    
    
}
