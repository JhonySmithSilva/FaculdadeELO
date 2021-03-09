/*
 Exer8: Desenvolver um algoritmo que faça a entrada de 5 elementos
inteiros de um vetor vetor1 e construa um vetor2 do mesmo tipo,
observando a seguinte regra de formação: se o valor do índice do
vetor1 for par, o valor do elemento deverá ser multiplicado por 2, se
for ímpar, deverá ser somado com 5. Ao final, mostrar o conteúdo
dos dois vetores.
 */
package exercicios_de_nivelamento;
import java.util.Scanner;

/**
 *
 * @author jony_
 */
public class Exercicio8 {
    
     Scanner input = new Scanner(System.in); 
    
    //criar vetor de inteiros    
    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];
    
    public void preencherVetor_1(){
        //pedir pra o usuário preencher os valores do vetor
        for(int i = 0;i < vetor1.length;i++){
            System.out.println("digite o valor do vetor na posição " + i + " : ");
            vetor1[i] = input.nextInt();
        }
    }
    
    public void preencherVetor_2(){
        //preenche os elementos do vetor respeitando as regras do enunciado
        for(int i = 0;i < vetor2.length;i++){
           if( i % 2 == 0 ){//se variavel i é impar
               vetor2[i] = vetor1[i] * 2; //vetor[elemento] recebe i X 2
           }else{
               vetor2[i] = vetor1[i] + 5; //vetor[elemento] recebe i + 5
           }
            
        }
        System.out.println("");
    }
    //imprime os valores no console
    public void imprimirValoresVetor(){
        System.out.println("valor dos elementos do vetor 1: ");
        for(int i = 0; i < vetor1.length; i++){
            System.out.print(" | " + vetor1[i]);
        }
        System.out.println(" | \n");
        
        System.out.println("valor dos elementos do vetor 2: ");
        for(int i = 0; i < vetor2.length; i++){
            System.out.print(" | " + vetor2[i]);
        }
        System.out.println(" | \n");
    }       
    
    
}
