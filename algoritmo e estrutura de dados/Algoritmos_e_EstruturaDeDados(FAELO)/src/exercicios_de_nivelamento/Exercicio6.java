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
    //variaveis recebem maior valor
    int maiorValor,menorValor;
    //variavel recebe o tamanho do vetor
    int tamanhoVetor;
    //criar vetor de inteiros    
    int vetorDeInteiro[] = new int[tamanhoVetor];
        
    public void TamanhoVetor(){
        System.out.println("Digite o tamanho do vetor");
        tamanhoVetor = input.nextInt();        
    }    
    
    public void peencherVetor(){
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
            if(vetorDeInteiro[i] < menorValor){
                menorValor = vetorDeInteiro[i];
            }        
        }
    }
    
    public void imprimirValoresVetor(){
        //imprimir os valores em tela    
        System.out.println("o maior valor é: " + this.maiorValor + ".");
        System.out.println("o menor valor é: " + this.menorValor + ".");
    }       
    
}
