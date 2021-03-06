/*
 Exer3: Crie um vetor de inteiros de tamanho 3. O usuário deverá preencher esses dados.
Imprima em ordem inversa a digitada, usando a estrutura de repetição FOR.
 */
package exercicios_de_nivelamento;

import java.util.Scanner;

/**
 *
 * @author jony
 */
public class Exercicio3 {
    
    Scanner input = new Scanner(System.in);
    //criar vetor de inteiros
    int vetorDeInteiro[] = new int[3];
    
    public void vetor(){
    //pedir pra o usuário preencher os valores do vetor
    for(int i = 0;i < vetorDeInteiro.length;i++){
            System.out.println("digite o valor do vetor na posição " + i + " : ");
            vetorDeInteiro[i] = input.nextInt();
        }
    //imprimir os valores em tela na ordem inversa
    for(int i = vetorDeInteiro.length - 1; i >= 0; i--){
            System.out.print(vetorDeInteiro[i] + " | ");
        }
    
    }
    
}
