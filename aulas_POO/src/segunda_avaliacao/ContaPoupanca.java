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
public class ContaPoupanca extends Conta{
    
    private double taxaJuros;
    
    public ContaPoupanca(String nome,int numero,double saldo,double juros){
        super(nome,numero,saldo);
        this.taxaJuros = juros;
    }  

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public boolean saque(double valor){
        boolean operacaoRealizada;
        if(getSaldo()>valor){
            double saque = getSaldo() - valor;
            setSaldo(saque);
            operacaoRealizada = true;
        }else{
            System.out.println("Você não tem saldo sulficiente para realisar esta operação!! ");
            operacaoRealizada = false;
        }        
        return operacaoRealizada;
    }
    
    public void renderJuros(){
        double rendendo = getSaldo() + ( getSaldo() * getTaxaJuros());
        setSaldo(rendendo);             
    }
}
