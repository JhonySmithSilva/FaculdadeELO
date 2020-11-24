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
public class Vendedor extends Operario{
    
    private double valorVendas,comicao;

    public Vendedor() {
       
    }

    public double getValorVendas() {
        System.out.println("valor das vendas: ");
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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
        double salario = super.calcularSalario() + ((valorVendas/100)*comicao);
        return salario;
    }
    
}
