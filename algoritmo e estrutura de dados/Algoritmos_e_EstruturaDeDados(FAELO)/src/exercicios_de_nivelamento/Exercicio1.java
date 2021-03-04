/*Exer1: Crie um vetor de inteiros de tamanho 3, preencha e imprima, usando a estrutura de
repetição FOR.
*/

package exercicios_de_nivelamento;

/**
 * @author Jonatas
 */
public class Exercicio1 {
    //criar vetor de inteiros
    int vetorDeInteiro[] = new int[3];
   
    public void vetor(){
        //preencher o vetor
        for(int i = 0;i < vetorDeInteiro.length;i++){
            vetorDeInteiro[i] = i*(2*i);
        }
        //imprimir os valores em tela
        for(int i = 0; i < vetorDeInteiro.length; i++){
            System.out.print(vetorDeInteiro[i] + " | ");
        }
        
    }
    
}
