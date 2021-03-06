/*
 Exer5: Crie um vetor de tamanho especificado pelo usuário, preencha e imprima seus valores.
 */
package exercicios_de_nivelamento;

import java.util.Scanner;

/**
 *
 * @author jony_
 */
public class Exercicio5 {
    
    Scanner input = new Scanner(System.in);
    //variavel recebe o tamanho do vetor
    int tamanhoVetor;
    //criar vetor de inteiros
    int vetorDeInteiro[] = new int[5];
    
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
    
    public void imprimirValoresVetor(){
        //imprimir os valores em tela na ordem inversa
        for(int i = vetorDeInteiro.length - 1; i >= 0; i--){
            System.out.print(vetorDeInteiro[i] + " | ");
        }     
    }    
}
