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
public class Empregado extends Pessoa{
    
    private int codigoSetor,salarioBase,imposto;

    public Empregado(){
        super();        
    }//fim do construtor da classe

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getSalarioBase() {
        System.out.println("codigo do setor: ");
        System.out.println("salario base: ");
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }    
    
    public double calcularSalario(){
        System.out.println("salario liquido: ");
        double salario = this.salarioBase - (this.salarioBase / 100)* this.imposto;
        return salario;
    }
}
