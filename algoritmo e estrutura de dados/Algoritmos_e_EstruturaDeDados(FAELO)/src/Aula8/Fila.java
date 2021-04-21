/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula8;

/**
 *
 * @author jony_
 */
public class Fila {
    
    private int[] vetorFila;
    private int tamanhoDaFila;

    public Fila(int tamanhoDaFila) {
        this.tamanhoDaFila = tamanhoDaFila;
        vetorFila = new int[tamanhoDaFila];
    }
    
    public boolean enfileirar(int numero) {
        //aumentarCapacidade() {}
        if(this.vetorFila.length < this.tamanhoDaFila) {
            this.vetorFila[this.tamanhoDaFila] = numero;
            this.tamanhoDaFila++;
            return true;
        }
        else {
            System.out.println("ERRO ao enfileirar o elemento: " + numero);
        }
        return false;
    }
    
    public void aumentarCapacidade() {
        if(this.vetorFila.length == this.tamanhoDaFila) {
            int[] novoVetor = new int[this.vetorFila.length * 2];
            for(int i = 0; i < this.tamanhoDaFila; i++) {
                novoVetor[i] = this.vetorFila[i];
            }
        }
        else {
        
        }        
    }
    
    public int getTamanhoDaFila() {
        return this.tamanhoDaFila;
    }    
    
}


// ** metodos a ser declarados ** 
// fim da fila
// desenfileirar
// pesquisar
// inicio da fila
// está vazia
// imprimir