package prova_POO;
import java.util.Scanner;
/**
 *
 * @author Jonatas Severino da Silva
 */
public class Conta {
    
    Scanner input = new Scanner(System.in);
    
    private String nome;
    final int numConta;
    private double saldo;
    final double taxaPorSaque;
    
    Conta(/*String nome,int numConta,double saldo*/){
        this.nome = nome;
        this.numConta = 123;
        this.saldo = saldo;
        this.taxaPorSaque = 10.00;
    }
    final void deposito(){
        System.out.println("Digite o valor que deseja depositar...");
        double depositar = input.nextDouble();
        this.saldo = this.saldo + depositar;
    }
    final void saque(){
        System.out.println("Digite o valor que deseja sacar...");
        double sacar = input.nextDouble();
        if(this.saldo > this.taxaPorSaque + sacar){
        this.saldo = this.saldo - this.taxaPorSaque - sacar;
        }else{System.out.println("Você não possui saldo sulficiente!! ");}
    }
    final void imprimirConta(){
        System.out.println("Titular da conta: "+ this.nome);
        System.out.println("numero da conta: "+ this.numConta);
        System.out.println("Saldo:" + this.saldo);
    }
    final void setNome(String novoNome){
        this.nome = novoNome;        
    }
    
    
}//fim da classe
