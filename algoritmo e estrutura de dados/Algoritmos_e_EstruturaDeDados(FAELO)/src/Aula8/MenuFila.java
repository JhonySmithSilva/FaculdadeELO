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
public class MenuFila {
    
    public static void main(String[] args) {
        
        Fila fila = new Fila();
        
        //imprimir o tamanho atual da fila
        System.out.println("tamanho da fila ----> " + fila.getTamanhoDaFila());
        //adicionar elementos a fila
        fila.enfileirar(100);
        fila.enfileirar(300);
        fila.enfileirar(500);
        //imprimir novamente o tamanho da fila
        System.out.println("tamanho da fila ----> " + fila.getTamanhoDaFila());
        //imprimir todos os elementos da fila
        System.out.print(fila.toString()+"\n");
        //adicionar mais um elemento
        fila.enfileirar(1000);
        //imprimir todos os elementos da fila
        System.out.print(fila.toString()+"\n");
        //imprimir novamente o tamanho da fila
        System.out.println("tamanho da fila ----> " + fila.getTamanhoDaFila());
        //adicionar mais um elemento
        fila.enfileirar(1500);
        //imprimir todos os elementos da fila
        System.out.print(fila.toString()+"\n");
        //imprimir novamente o tamanho da fila
        System.out.println("tamanho da fila ----> " + fila.getTamanhoDaFila());
        //retirar o primeiro elemento a entrar na fila
        fila.desenfileirar();
        fila.desenfileirar();
        //fila.desenfileirar();
        //fila.desenfileirar();
        //fila.desenfileirar();
        //imprimir novamente o tamanho da fila
        System.out.println("tamanho da fila ----> " + fila.getTamanhoDaFila());
        
        //imprimir todos os elementos da fila
        if(fila.getTamanhoDaFila() == 0){
            System.out.println("a fila está vazia!");
        }
        else{
            System.out.print(fila.toString()+"\n");
        }
        
        //imprimir o inicio da fila
        if(fila.getTamanhoDaFila() == 0){
            System.out.println("a fila está vazia!");
        }
        else{
            System.out.println("elemento do inicio da fila ----> " + fila.inicioDaFila());
        }
        
        //imprimir o final da fila
        if(fila.getTamanhoDaFila() == 0){
            System.out.println("a fila está vazia!");
        }
        else{
            System.out.println("elemento do final da fila ----> " + fila.fimDaFila());
        }   
        
    }
    
}
