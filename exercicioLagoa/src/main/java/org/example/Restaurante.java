package org.example;

import java.util.ArrayList;
public class Restaurante {
    String nome;
    int avaliacao;
    ArrayList<Item> cardapio = new ArrayList<>();


    void getNome(){
        System.out.println("Nome" + nome);
    }

    void adicionarItem(Item item){
        cardapio.add(item);
    }

    void imprimirMenu(){
        for (Item x : cardapio){
            System.out.println(x.nome + ":" + x.preco);
        }
    }
}
