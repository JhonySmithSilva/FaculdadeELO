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
public class MenuPilha {
    
    Scanner input = new Scanner(System.in);
    Pilha pilha = new Pilha(0);
    
    private int opcoes;

    public MenuPilha() {
        
        System.out.println(
            "           == BEM VINDOS AO MENU DA CLASSE PILHA == \n \n"+
            " Por favor, escolha uma das opções do menu para prosseguir...\n \n");
        startMenu();
    }  
    
    private void startMenu(){
        do {    
             System.out.println(
                    "\n"+
                    "                   ** MENU PILHA **\n" +
                    "\n" +
                    "               1 - Empilhar\n" +
                    "               2 - Tamanho\n" +
                    "               3 - Pesquisar Elemento\n" +
                    "               4 - Imprimir\n" +
                    "               5 - Desempilhar\n" +
                    "               6 - Está Vazia\n" +
                    "               7 - Topo\n" +
                    "               0 - Sair"
            );
             
            this.opcoes = input.nextInt();

            switch(opcoes){
                case 1: {
                    System.out.print("  digite o nome do meliante:   ");
                    pilha.empilhar(input.next());
                    break;
                }
                case 2: {
                    System.out.println(pilha.getTamanho());
                    break;
                }
                case 3: {
                    System.out.println(pilha.pesquisar(input.next()));
                    break;
                }
                case 4: {
                    System.out.println(pilha.toString());
                    break;
                }
                case 5: {
                    pilha.desempilhar();
                    break;
                }
                case 6: {
                    System.out.println(pilha.estaVazia());
                    break;
                }
                case 7: {
                    System.out.println(pilha.topo());
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
