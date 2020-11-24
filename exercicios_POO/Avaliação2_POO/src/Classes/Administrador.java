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
public class Administrador extends Empregado{
    
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        System.out.println("Ajuda de custo: ");
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario(){
        
        double salario = super.calcularSalario()+ this.ajudaDeCusto;
        return salario;
    }
}
