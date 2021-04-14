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
public class MenuVetorDeObjetos {
    
    Scanner input = new Scanner(System.in);
    VetorDeObjetos vetorDeObjetos = new VetorDeObjetos(0);
    
    private int opcoes;

    public MenuVetorDeObjetos() {
        
        System.out.println(
            "           == BEM VINDOS AO MENU DA CLASSE VETOR DE OBJETOS == \n \n"+
            " Por favor, escolha uma das opções do menu para prosseguir...\n \n");
        startMenu();
    }  
    
    private void startMenu(){
        do {    
             System.out.println(
                    "\n"+ 
                    "              ** MENU VETOR DE OBJETOS **\n" +
                    "\n" +
                    "               1 - Adicionar \n" +
                    "               2 - Almentar Capacidade \n" +
                    "               3 - Tamanho \n" +
                    "               4 - Imprimir \n" +
                    "               5 - Pesquisar \n" +
                    "               6 - Remover \n" +
                    "               7 - Esta Vazio \n" +
                    "               0 - Sair"
            );
             
            this.opcoes = input.nextInt();

            switch(opcoes){
                case 1: {
                    System.out.print("  digite o nome do meliante:  ");
                    vetorDeObjetos.adicionar(input.next());
                    break;
                }
                case 2: {
                    System.out.println(vetorDeObjetos.getTamanho());
                    break;
                }
                case 3: {
                    System.out.println(vetorDeObjetos.getTamanho());                    
                    break;
                }
                case 4: {
                    System.out.println(vetorDeObjetos.toString());
                    break;
                }
                case 5: {
                    vetorDeObjetos.pesquisar(input.next());
                    break;
                }
                case 6: {                    
                    vetorDeObjetos.remover();
                    break;
                }
                case 7: {
                    System.out.println(vetorDeObjetos.estaVazio());
                    break;
                }                
            }
            if(this.opcoes < 0 && this.opcoes > 7 ){
                    System.out.println(" opção invalida!! ");
                }
        }while(opcoes != 0);
        System.out.println("encerrando o programa...");
    }    
    
}
