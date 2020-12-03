/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_de_exercicios2;

/**
 *
 * @author jony_
 */
public class NoImparExeption extends Exception{
    
    
    
    int numerador,denomidador;
    
    public NoImparExeption(int num, int den){
        super();
        this.numerador = num;
        this.denomidador = den;        
    }
    @Override
    public String toString(){
        return numerador + "é um numero impar";
    }
    
    public String indiceInexistente(int indice){
       
       
       return "o indice" + indice + "não existe"; 
    }
    
}

    

