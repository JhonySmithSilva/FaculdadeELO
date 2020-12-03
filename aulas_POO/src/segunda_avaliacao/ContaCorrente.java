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
public class ContaCorrente extends Conta{
    
    private double limiteEmprestimo;
    
    public ContaCorrente(String nome,int numero,double saldo,double limiteEmprestimo){
        super(nome,numero,saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public boolean saque(double valor){        
        double saque = (getSaldo()-20) - valor;
        setSaldo(saque);
        boolean v = false;
        return v;
    }
    
    public boolean emprestimo(double valor){  
        boolean operacaoRealizada;
        if(valor < (getLimiteEmprestimo()+10.00)){
            double emprestimo = (getSaldo()-10.00)+valor;
            setSaldo(emprestimo);
            double novoValor  = this.limiteEmprestimo - valor;
            setLimiteEmprestimo(novoValor);
            operacaoRealizada = true;
        }else{
            System.out.println("Você não tem limite sulficiente para realizar este emprestimo!!");
            operacaoRealizada = false;
        }        
        return operacaoRealizada;    
    }
    
}
