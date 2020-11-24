/* este codigo é parte do exercicio de avaliação do curso de 
   Analise e Desenvolvimento de Sistemas
   ministrado pelo professor João Ferreira, sendo o mesmo professor de 
   programação orientada a objetos.
 */
package Classes;
/**
 * @author 
 * Aluno: Jonatas Severino da Silva
 * turma: 2º periodo
 * IDE utilizada: NetBeans
 */
public class Fornecedor extends Pessoa{
    
    private double valorCredito,valorDivida;

    public Fornecedor() {
        
    }

    public double getValorCredito() {
        System.out.println("valor do credito: ");
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        System.out.println("valor da divida: ");
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo(){
        System.out.println("saldo de credito: ");
        double saldo = valorCredito - valorDivida;
        return saldo;
    }
        
    
}
