/*
 Exer4: Usando a estrutura de vetores, em Java, elabore um código em capaz de armazenar 5
números inteiros. Crie uma variável soma que calculará a soma de todos esses valores
informados pelo usuário. Use a estrutura de repetição FOR para preencher o Array.
 */
package exercicios_de_nivelamento;

import java.util.Scanner;

public class Exercicio4 {
    
    Scanner input = new Scanner(System.in);
    //criar vetor de inteiros
    int vetorDeInteiro[] = new int[5];
    //variavel recebe a soma dos elementos do vetor
    int somarVetores;
    
    public void peencherVetor(){
    //pedir pra o usuário preencher os valores do vetor
    for(int i = 0;i < vetorDeInteiro.length;i++){
            System.out.println("digite o valor do vetor na posição " + i + " : ");
            vetorDeInteiro[i] = input.nextInt();
            somarVetores += vetorDeInteiro[i];
        }
    }
    
    public void imprimirValoresVetor(){
        //imprimir a soma dos elementos do vetor    
        System.out.print("a soma dos vetores é : " + somarVetores);        
    }    
}
