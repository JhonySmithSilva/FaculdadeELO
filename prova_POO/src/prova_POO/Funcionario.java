package prova_POO;

/**
 *
 * @author Jonatas severino da Silva
 */
public class Funcionario {
    
    final String nome;
    final double salarioBruto;
    final double descontos;
    
    Funcionario(String nome,double salario,double descontos){
        super();
        this.nome = nome;
        this.salarioBruto = salario;       
        this.descontos = descontos;        
    }
    final double exibirSalario(){
        return this.salarioBruto;        
    }
    final double salarioLiquido(){
        double salario = salarioBruto - descontos;
        return salario;
    }   
    
    
}// fim da classe
