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

    public Fila() {
        this.tamanhoDaFila = 1;
        vetorFila = new int[this.tamanhoDaFila];
    }
    
    public boolean enfileirar(int numero) {
        aumentarCapacidade();        
            if(this.vetorFila.length >= this.tamanhoDaFila){            
                this.vetorFila[this.tamanhoDaFila -1 ] = numero;
                this.tamanhoDaFila++;
                return true;
        }
        else {
            System.out.println("ERRO ao enfileirar o elemento: " + numero);
        }
        return false;
    }
    
    public void aumentarCapacidade() {        
        if(this.tamanhoDaFila - 1 == this.vetorFila.length  ) {            
            int[] novoVetor = new int[this.vetorFila.length + 1];
            for(int i = 0; i < this.vetorFila.length; i++) {
                novoVetor[i] = this.vetorFila[i];
            }
            this.vetorFila = novoVetor;
        }
        else {        
        }        
    }
    
    public void desenfileirar() {
        if(this.tamanhoDaFila == 0){
            System.out.println("a fila está vazia!");
        }
        else{
            int[] vetorMenor = new int[this.vetorFila.length - 1];
            for(int i = 0; i < this.vetorFila.length - 1; i++) {
                vetorMenor[i] = this.vetorFila[i + 1];
            }
            this.vetorFila = vetorMenor;            
        }       
    }
    
    public int getTamanhoDaFila() {
        return this.vetorFila.length;
    } 
    
    public int inicioDaFila() {
        if(this.tamanhoDaFila == 0){
            System.out.println("a fila está vazia!");
        }      
        return this.vetorFila[0];
    }
    
    public int fimDaFila() {
        if(this.tamanhoDaFila == 0){
            System.out.println("a fila está vazia!");
        }        
        return this.vetorFila[this.vetorFila.length - 1];        
    }
    
    @Override
    public String toString(){
        String mensagem ="";
        for(int i = 0; i < this.vetorFila.length; i++){                
                mensagem +="[ " + this.vetorFila[i] + " ] ";                
            }
        if(this.tamanhoDaFila == 0 ){
            mensagem += this.vetorFila[this.tamanhoDaFila-1];
        }         
        return mensagem;     
    }     
}


// ** metodos a ser declarados ** 

// pesquisar
// está vazia
