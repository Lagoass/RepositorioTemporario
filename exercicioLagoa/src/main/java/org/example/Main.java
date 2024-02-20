package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        String nomeRestaurante;
        int avaliacao;
        int escolha;
        String nomeItem;
        float precoItem;
        boolean run = true;
        while (run == true){
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Restaurante");
            System.out.println("2. Listar Restaurantes");
            System.out.println("3. Cadastrar item no menu de um Restaurante");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = s.nextInt();
            Restaurante restaurante = new Restaurante();
            System.out.println(opcao);
            if (opcao == 1){
                System.out.println("Digite o nome do Restaurante: ");
                nomeRestaurante = s.next();
                System.out.println("Digite a avaliacao do Restaurante");
                avaliacao = s.nextInt();
                restaurante.nome = nomeRestaurante;
                restaurante.avaliacao = avaliacao;
                restaurantes.add(restaurante);
                System.out.println("Restaurante "+ nomeRestaurante+ " cadastrado com sucesso!");
            }else if (opcao == 2){
                System.out.println("Restaurantes Cadastrados:");
                for (int i = 0; i < restaurantes.size(); i++) {
                    System.out.println("Index: " + i + ", Restaurant: " + restaurantes.get(i).nome);
                    restaurantes.get(i).imprimirMenu();
                }

            }else if(opcao == 3){
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                escolha = s.nextInt();
                System.out.println("Digite o nome do item: ");
                nomeItem = s.next();
                System.out.println("Digite o preço do item: ");
                precoItem = s.nextFloat();
                Item item = new Item();
                item.preco = precoItem;
                item.nome = nomeItem;
                restaurantes.get(escolha).adicionarItem(item);
            }else if (opcao == 4) {
                System.out.println("Obrigado por ultilizar o sistema de cadastro de restaurantes!");
                run = false;
            }else{
                System.out.println("---------ATENÇÃO---------");
                System.out.println("Opção Invalida");
            }


        }






    }
}