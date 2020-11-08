package prova_POO;

/**
 *
 * @author Jonatas Severino da Silva
 */
public class Empresa {
    
        
    public static void main(String[] args){
        
        
        Funcionario funcionario = new Funcionario("Jonatas",1650.90,250.50);
        
        System.out.println("o salario bruto de " + funcionario.nome + " é " + funcionario.exibirSalario() +" Reais.");
        System.out.println( funcionario.nome + " paga um total de  " + funcionario.descontos +" Reais.");
        System.out.println("o salario liquido de " + funcionario.nome + " é " + funcionario.salarioLiquido() +" Reais.");
        
    
    }  //fim do metodo main
    
}//fim da classe
