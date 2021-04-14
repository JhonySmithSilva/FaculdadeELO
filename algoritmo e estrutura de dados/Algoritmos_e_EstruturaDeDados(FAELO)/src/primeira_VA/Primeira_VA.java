/*
 * Faculdade ELO
 * Disciplina: Algoritmos e Estruturas de Dados
 * Professor: João Ferreira
 */
package primeira_VA;

import java.util.Scanner;
/**
 * @author Jonatas Severino Da Silva
 */
public class Primeira_VA {       
    
    public static void main(String[] args){       
        
        int opcoes;
        Scanner input = new Scanner(System.in);
        
        System.out.println(
            "           == BEM VINDOS AO MENU DA CLASSE VETOR DE OBJETOS == \n \n"+
            " Por favor, escolha uma das opções do menu para prosseguir...\n \n");
        
        do {    
             System.out.println(
                    "\n"+ 
                    "              ** PROVA DE 1° AVALIAÇÃO **\n" +
                    "\n" +
                    "               1 - 1° Quesito (vetor de objetos) \n" +
                    "               2 - 2° quesito ( pilha ) \n"+
                    "               0 - Sair "
                );
             
            opcoes = input.nextInt();

            switch(opcoes){
                case 1: {                    
                    MenuVetorDeObjetos m = new MenuVetorDeObjetos();
                    break;
                }
                case 2: {
                    MenuPilha menuPilha = new MenuPilha();                    
                    break;
                }   
            }
            if(opcoes < 0 && opcoes > 2 ){
                    System.out.println(" opção invalida!! ");
                }
        }while(opcoes != 0);
        System.out.println("encerrando o programa...");       
    }      
}
