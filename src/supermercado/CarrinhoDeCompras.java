/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Liniker
 */
public class CarrinhoDeCompras {
    
    private List<Produto> produtos;
    
    public CarrinhoDeCompras(){
        produtos = new ArrayList<>();
    }
    
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public void adicionaProduto(Produto produto){
        produtos.add(produto);
    }
    
    
}
