/*
 LISTA DE EXERÍCIOS 01

ALGORITMOS E ESTRUTURAS DE DADOS

2021.1

PROF. JOÃO FERREIRA
 */
package lista_de_exercicio1;

/**
 *
 * @author jony_
 */
public class ClasseMain {
    
    public static void main(String[] args){
        Vetor vetor = new Vetor(1);
        
        System.out.println(vetor.tamanho());
        vetor.adicionar(0, "jonatas");
        System.out.println(vetor.buscar(0));
        vetor.adicionar(1, "zé");
        vetor.adicionar(2, "luiz");
        vetor.adicionar(5, "jozé");
        //vetor.aumentarCapacidade(4);
        System.out.println(vetor.tamanho());        
        System.out.println("\n \n");        
        vetor.imprimirElementosVetor();        
        vetor.adicionar(3, "thiago");
        System.out.println("");
        vetor.imprimirElementosVetor();
        System.out.println("");
        System.out.println("tamanho do vetor: " + vetor.tamanho());
        
               
        
    }
    
}
