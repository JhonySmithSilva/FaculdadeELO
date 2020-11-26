/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_exeptions;

import java.util.Scanner;
public class Exemplo1 {
    
    final int v [] = new int[4];
        
        Exemplo1(){
            v[0] = 10;
            v[1] = 15;
            v[2] = 30;
            v[3] = 40;
        }
        public void getArrey(){
        
          Scanner s = new Scanner(System.in);
            
            try{
            System.out.println("digite o indice do arrei a ser exiido: ");       
            int opcao = s.nextInt();
            System.out.println(v[opcao]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Ops!! o indice digitado não existe, tente digitar um numero menor");
            }finally{
            System.out.println("A  vida que segue.");
            s.close();
            }
        }
        
        
}
