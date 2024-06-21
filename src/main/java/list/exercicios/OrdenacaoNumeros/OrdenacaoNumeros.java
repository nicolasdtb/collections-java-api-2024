package main.java.list.exercicios.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(14);
        numeros.adicionarNumero(67);
        numeros.adicionarNumero(5);

        System.out.println("Números por ordem de inclusão: " + numeros.exibeNumeros() + "\n");
        System.out.println("Números por ordem ascendente:" + numeros.ordenarAscendente() + "\n");
        System.out.println("Números por ordem descendente:" + numeros.ordenarDescendente() + "\n");


    }

    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    private void adicionarNumero (int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        numerosDescendentes.sort(Collections.reverseOrder());
        return numerosDescendentes;
    }

    public List<Integer> exibeNumeros(){
        return this.numeros;
    }

}
