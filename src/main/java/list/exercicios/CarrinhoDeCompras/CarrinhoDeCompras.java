package main.java.list.exercicios.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    private List<Item> listaItens;

    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : listaItens){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }

        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double soma = 0;

        for (Item i: listaItens){
            soma += i.getPreco();
        }
        return soma;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O valor total de itens no carrinho é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Leite", 6.99, 2);
        carrinhoDeCompras.adicionarItem("Leite", 6.99, 1);
        carrinhoDeCompras.adicionarItem("Macarrão", 2.99, 4);

        System.out.println("O valor total de itens no carrinho é: " + carrinhoDeCompras.calcularValorTotal());

//        carrinhoDeCompras.removerItem("Macarrão");
        System.out.println("O valor total de itens no carrinho é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();

    }

}
