/*
 * Lista de Exercícios 2 – Programação Orientada a Objetos

1.	Elabore um programa que leia dois números inteiros do usuário (numerador e denominador) 
            e depois imprima o resultado da divisão do numerador pelo denominador.
2.	Use o tratamento de exceções para que o programa não trave caso o usuário 
            digite um valor de outro tipo (double ou String) ou o denominador seja zero.
3.	Crie sua própria exceção para não permitir que nem o numerador nem o denominador sejam números ímpares.
 */
package lista_de_exercicios2;

/**
 * este codigo é parte do exercicio de avaliação de POO
 * profesor: João Ferreira
 * aluno: Jonatas severino da Silva
 * IDE ultilizada: NetBeans
 */

public class ListaDeExercicios2 {    
    //incio do metodo main
    public static void main(String[] args){
        
        //cria um objeto do tipo divisão            
        Divisao divisao = new Divisao();
            //chamada de metodos para receber numerador e denominador    
            divisao.setNumerador();            
            divisao.setDenominador();           
        //mostra o resultado da divisão do numerador pelo denominador
        System.out.print("O resultado da divisão é: =======> "+ divisao.divisao() + "\n \n");        
    }//fim do metodo main
}//fim da classe
