/*
 Exer2: Crie um vetor de inteiros de tamanho 3. O usuário deverá preencher esses dados.
Imprima, usando a estrutura de repetição FOR.
 */
package exercicios_de_nivelamento;
import java.util.Scanner;

/**
 *
 * @author jony
 */
public class Exercicio2 {
    
    Scanner input = new Scanner(System.in);
    //criar mvetor de inteiros
    int vetorDeInteiro[] = new int[3];
    
    public void vetor(){
    //pedir pra o usuário preencher os valores do vetor
    for(int i = 0;i < vetorDeInteiro.length;i++){
            System.out.println("digite o valor do vetor na posição " + i + " : ");
            vetorDeInteiro[i] = input.nextInt();
        }
    //imprimir os valores na tela
    for(int i = 0; i < vetorDeInteiro.length; i++){
            System.out.print(vetorDeInteiro[i] + " | ");
        }
    
    }
    
}
