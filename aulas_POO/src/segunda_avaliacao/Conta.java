/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda_avaliacao;

/**
 *
 * @author jony_
 */
public class Conta {
    
    private String nomeCliente;
    private int numero;
    private double saldo;
    
    public Conta(String nome,int numero,double saldo){
        
        this.nomeCliente = nome;
        this.numero = numero;
        this.saldo = saldo;    
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     public void deposito(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public boolean saque(double valor){
        this.saldo = this.saldo - valor;
        boolean v = false;
        return v;
    }   
    
}
