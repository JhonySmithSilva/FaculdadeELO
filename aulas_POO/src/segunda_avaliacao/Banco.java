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
public class Banco {
    
    public static void main(String[] args){
    //operações com conta
        //cadastrando conta
        Conta conta = new Conta("Jonatas",123,1500.00);
        
        System.out.println("operações com Conta... \n");
        
        //imprimir valores iniciais dos atributos
        System.out.println("Titular da conta ===> "+ conta.getNomeCliente());
        System.out.println("numero da conta ===> "+ conta.getNumero());
        System.out.println("Saldo da conta ===> "+ conta.getSaldo());
        //Realizando um depósito
        System.out.println("Depositando...");
        conta.setSaldo(1500.00);
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ conta.getNomeCliente());
        System.out.println("numero da conta ===> "+ conta.getNumero());
        System.out.println("Saldo da conta ===> "+ conta.getSaldo());
        //efetuar um saque
        System.out.println("sacando...\n");
        conta.saque(300.00);
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ conta.getNomeCliente());
        System.out.println("numero da conta ===> "+ conta.getNumero());
        System.out.println("Saldo da conta ===> "+ conta.getSaldo());
        System.out.println("=================================================\n");
        
    //operações com conta corrente
        
        //cadastrando conta corrente
        ContaCorrente cc = new ContaCorrente("Pedro",666,1550.00,15000.00);
        
        System.out.println("operações com ContaCorrente...\n");
        
        //imprimir valores iniciais dos atributos
        System.out.println("Titular da conta ===> "+ cc.getNomeCliente());
        System.out.println("numero da conta ===> "+ cc.getNumero());
        System.out.println("Saldo da conta ===> "+ cc.getSaldo());
        System.out.println("Limite de emprestimo ===> "+ cc.getLimiteEmprestimo());
        System.out.println("=================================================\n");
        //realizar um depósito
        System.out.println("Depositando...");
        cc.deposito(1000.00);
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ cc.getNomeCliente());
        System.out.println("numero da conta ===> "+ cc.getNumero());
        System.out.println("Saldo da conta ===> "+ cc.getSaldo());
        System.out.println("Limite de emprestimo ===> "+ cc.getLimiteEmprestimo());
        System.out.println("=================================================\n");
        //realizar saque
        System.out.println("sacando...\n");
        cc.saque(500.00);
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ cc.getNomeCliente());
        System.out.println("numero da conta ===> "+ cc.getNumero());
        System.out.println("Saldo da conta ===> "+ cc.getSaldo());
        System.out.println("Limite de emprestimo ===> "+ cc.getLimiteEmprestimo());
        System.out.println("=================================================\n");
        //realizar emprestimo
        System.out.println("Realizando emprestimo com sussesso!  \n");
        cc.emprestimo(10000.00);
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ cc.getNomeCliente());
        System.out.println("numero da conta ===> "+ cc.getNumero());
        System.out.println("Saldo da conta ===> "+ cc.getSaldo());
        System.out.println("Limite de emprestimo ===> "+ cc.getLimiteEmprestimo());
        System.out.println("=================================================\n");
      
    //operações com conta poupança
        
        //cadastrando conta
        ContaPoupanca cp = new ContaPoupanca("João",468,1500.00,0.01);
        
        System.out.println("operações com ContaPoupança...\n");
        
        //imprimir valores iniciais dos atributos
        System.out.println("Titular da conta ===> "+ cp.getNomeCliente());
        System.out.println("numero da conta ===> "+ cp.getNumero());
        System.out.println("Saldo da conta ===> "+ cp.getSaldo());
        System.out.println("taxa de juros ===> "+ cp.getTaxaJuros());
        System.out.println("=================================================\n");
        //realizar um depósito
        System.out.println("Depositando...");
        cp.deposito(5000.00);
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ cp.getNomeCliente());
        System.out.println("numero da conta ===> "+ cp.getNumero());
        System.out.println("Saldo da conta ===> "+ cp.getSaldo());
        System.out.println("taxa de juros ===> "+ cp.getTaxaJuros());
        System.out.println("=================================================\n");
        //realizar saque
        System.out.println("sacando...\n");
        cc.saque(2500.00);
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ cp.getNomeCliente());
        System.out.println("numero da conta ===> "+ cp.getNumero());
        System.out.println("Saldo da conta ===> "+ cp.getSaldo());
        System.out.println("taxa de juros ===> "+ cp.getTaxaJuros());
        System.out.println("=================================================\n");
        //render juros
        cp.renderJuros();
        System.out.println("Aplicando juros ao saldo...\n");
        //imprimir valores atuais dos atributos
        System.out.println("Titular da conta ===> "+ cp.getNomeCliente());
        System.out.println("numero da conta ===> "+ cp.getNumero());
        System.out.println("Saldo da conta ===> "+ cp.getSaldo());
        System.out.println("taxa de juros ===> "+ cp.getTaxaJuros());
        System.out.println("=================================================\n");
        
        
        System.out.println("Fim do programa.");
    
    }//fim do metodo main
    
}//fim da classe
