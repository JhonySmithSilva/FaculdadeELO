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
public class Operario extends Empregado{
    
    private double valorProducao,comicao;

    public Operario() {
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComicao() {
        System.out.println("comição: ");
        return comicao;
    }

    public void setComicao(double comicao) {
        this.comicao = comicao;
    }
    
    @Override
    public double calcularSalario(){
        double salario = super.calcularSalario() + comicao;
        return salario;
    }
    
}
