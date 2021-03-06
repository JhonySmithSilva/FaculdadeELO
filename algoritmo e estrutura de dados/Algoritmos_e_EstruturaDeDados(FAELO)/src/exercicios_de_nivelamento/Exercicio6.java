/*
 Exer6: Crie um vetor de tamanho especificado pelo usuário, preencha e imprima:
    a) O maior valor
    b) O menor valor
    c) A média dos valores digitados
    d) Quantos números ímpares foram digitados
    e) Imprima os valores das posições pares do vetor
 */
package exercicios_de_nivelamento;

import java.util.Scanner;

/**
 *
 * @author jony_
 */
public class Exercicio6 {
    
    Scanner input = new Scanner(System.in); 
    
    //criar vetor de inteiros    
    int vetorDeInteiro[] = new int[tamanhoVetor()];
    //variaveis recebem maior e menor valor
    int maiorValor;
    int menorValor;
    int mediaDosElementos;
    int contadorDeImpares;
    
    public int tamanhoVetor(){
        System.out.println("Digite o tamanho do vetor");
        int tamanhoVetor = input.nextInt(); 
        return tamanhoVetor;
    }    
    
    public void preencherVetor(){
        //pedir pra o usuário preencher os valores do vetor
        for(int i = 0;i < vetorDeInteiro.length;i++){
            System.out.println("digite o valor do vetor na posição " + i + " : ");
            vetorDeInteiro[i] = input.nextInt();
        }
    }
    
    public void getMaiorValor(){ 
        this.maiorValor = vetorDeInteiro[0];
        for(int i = 0; i < vetorDeInteiro.length; i++){              
            if(vetorDeInteiro[i] > maiorValor){
                maiorValor = vetorDeInteiro[i];
            }        
        }
    }
    
    public void getMenorValor(){
        this.menorValor = vetorDeInteiro[0];
        for(int i = 0; i < vetorDeInteiro.length; i++){            
            if(menorValor > vetorDeInteiro[i] ){
                menorValor = vetorDeInteiro[i];
            }        
        }
    }
    
    public void getMediaDosElementos(){        
        for(int i = 0; i < vetorDeInteiro.length; i++){
            this.mediaDosElementos += vetorDeInteiro[i];            
        } 
        this.mediaDosElementos = mediaDosElementos / vetorDeInteiro.length; 
    }
    
    public void contadorDeImpares(){
        int cont = 0;
        for(int i = 0; i < vetorDeInteiro.length; i++){
            if(vetorDeInteiro[i] % 2 != 0){
                cont++;
            }
        }
        contadorDeImpares = cont;
    }
    
    public void getPares(){
        System.out.println("estes são os numeros pares: ");
        for(int i = 0; i < vetorDeInteiro.length; i++){            
            if(vetorDeInteiro[i] % 2 == 0){               
                System.out.print("| "+vetorDeInteiro[i]+" ");
            }
        }
        System.out.println(" | \n");
    }
    
    public void imprimirValoresVetor(){
        //imprimir os valores em tela  
        System.out.println("");
        System.out.println("o maior valor é: " + this.maiorValor + ".");
        System.out.println("o menor valor é: " + this.menorValor + ".");
        System.out.println("a média dos elementos do vetor é: " + this.mediaDosElementos + ".");
        System.out.println("foram digitados: " + contadorDeImpares + " numeros impares.");
        this.getPares();
    }       
    
}
