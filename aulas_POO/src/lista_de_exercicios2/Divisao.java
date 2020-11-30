package lista_de_exercicios2;

import java.util.*;

/**
 * este codigo é parte do exercicio de avaliação de POO
 * profesor: João Ferreira
 * aluno: Jonatas severino da Silva
 * IDE ultilizada: NetBeans
 */
public class Divisao {   
    //declaração das variaveis
    private int numerador,denominador;
    
    //construtor da classe Divisão inicia as variaveis
    public Divisao(){        
        numerador = 0;
        denominador = 0;
    }//fim do contrutor
    
    //metodo que ler um valor do tipo inteiro e armazena na variavel numerador
    public void setNumerador() { 
        //variável booleana recebe ou não valor se o codigo apresentar exeções
        boolean semFalhas = false;
        //loop que só deve parar caso o valor da variavel semFalhas seja modificado
        while(!semFalhas){
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o valor do numerador: ");
                this.numerador = input.nextInt(); 
                semFalhas = true;// se o usuário digitar um valor inteiro a variavel semFalhas recebe valor true
            }catch(InputMismatchException erro){
                //se o usuário digitar qualquer valor que não seja um inteiro será exibida esta mensagem ao usuário
                System.out.println("o valor digitado não é um inteiro."); 
                //e o loop continuará
            }//fim do try/catch 
        }//fim esttrutura de repetição while        
    }//fim do metodo setDenominador
    
    public int getNumerador(){//metodo retorna um inteiro
        return this.numerador;
    }//fim do metodo getNumerador
    
    //metodo que ler um valor do tipo inteiro e armazena na variavel denominador
    public void setDenominador(){
        //variável booleana recebe ou não valor se o codigo apresentar exeções
        boolean semFalhas = false;
        //loop que só deve parar caso o valor da variavel semFalhas seja modificado
        while(!semFalhas){
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o valor do denominador: ");
                this.denominador = input.nextInt(); 
                semFalhas = true;// se o usuário digitar um valor inteiro a variavel semFalhas recebe valor true
            }catch(InputMismatchException erro){
                //se o usuário digitar qualquer valor que não seja um inteiro será exibida esta mensagem ao usuário
                System.out.println("o valor digitado não é um inteiro.");
                //e o loop continuará
            }//fim do try/catch 
        }//fim esttrutura de repetição while             
    }//fim do metodo setDenominador
    
    public int getDenominador(){//metodo retorna um inteiro
        return this.denominador;
    }//fim do metodo getDenominador
    
    public int divisao(){
        //este metodo declara uma variavel que recebe e faz a divisão do numerador pelo denominador
        int resultado = this.numerador / this.denominador;
        //retorna o valor da variavel resultado
        return resultado;
    }//fim do metodo divisão
}//fim da classe 
