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
public class Empresa {
    
    public static void main(String[] args){
        
        System.out.println("    |==================== |");
        System.out.println("    | testando as classes |");
        System.out.println("    |=====================|");
        
        System.out.println("** classe Pessoa ** \n");
        
        //criando objeto de pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("jonatas");
        pessoa1.setEndereco("rua 1");
        pessoa1.setTelefone("12345678");        
        //exibindo as informações de pessoa1 na tela
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getTelefone()+"\n");
                
        System.out.println("** classe Empregado ** \n");
        //criando objeto de empregado
        Empregado empregado1 = new Empregado();
        empregado1.setNome("Pedro");
        empregado1.setEndereco("rua 15");
        empregado1.setTelefone("75683547");
        empregado1.setCodigoSetor(4);
        empregado1.setSalarioBase(3000);
        empregado1.setImposto(20);
        //exibindo as informações de pessoa1 na tela
        System.out.println(empregado1.getNome());
        System.out.println(empregado1.getEndereco());
        System.out.println(empregado1.getTelefone());
        System.out.println(empregado1.getCodigoSetor());
        System.out.println(empregado1.getSalarioBase());
        System.out.println(empregado1.calcularSalario()+"\n");
        
        System.out.println("** classe Fornecedor ** \n");
        //criando objeto de fornecedor
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Noronha");
        fornecedor1.setEndereco("rua doutor perebas");
        fornecedor1.setTelefone("75684437");
        fornecedor1.setValorCredito(10000);
        fornecedor1.setValorDivida(5000);
        
        //exibindo as informações de pessoa1 na tela
        System.out.println(fornecedor1.getNome());
        System.out.println(fornecedor1.getEndereco());
        System.out.println(fornecedor1.getTelefone());
        System.out.println(fornecedor1.getValorCredito());
        System.out.println(fornecedor1.getValorDivida());
        System.out.println(fornecedor1.obterSaldo()+"\n");
        
        System.out.println("** classe Administrador ** \n");
        //criando objeto de Administrador
        Administrador administrador1 = new Administrador();
        administrador1.setNome("Diogo");
        administrador1.setEndereco("carinha da pacaia");
        administrador1.setTelefone("12345678");
        administrador1.setCodigoSetor(1);
        administrador1.setSalarioBase(5000);
        administrador1.setImposto(15);
        administrador1.setAjudaDeCusto(1000);
        
        
        //exibindo as informações de pessoa1 na tela
        System.out.println(administrador1.getNome());
        System.out.println(administrador1.getEndereco());
        System.out.println(administrador1.getTelefone());
        System.out.println(administrador1.getCodigoSetor());
        System.out.println(administrador1.getSalarioBase());
        System.out.println(administrador1.getAjudaDeCusto());
        System.out.println(administrador1.calcularSalario()+"\n");
        
        System.out.println("** classe Operario ** \n");
        //criando objeto de Operario
        Operario operario1 = new Operario();
        operario1.setNome("José");
        operario1.setEndereco("rua da lama ");
        operario1.setTelefone("9876237");
        operario1.setCodigoSetor(3);
        operario1.setSalarioBase(1500);
        operario1.setImposto(15);
        operario1.setValorProducao(15000);
        operario1.setComicao(10.5);
        
        
        //exibindo as informações de pessoa1 na tela
        System.out.println(operario1.getNome());
        System.out.println(operario1.getEndereco());
        System.out.println(operario1.getTelefone());
        System.out.println(operario1.getCodigoSetor());
        System.out.println(operario1.getSalarioBase());
        System.out.println(operario1.getValorProducao());        
        System.out.println(operario1.calcularSalario()+"\n");
        
         System.out.println("** classe Vendedor ** \n");
        //criando objeto de Operario
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Thiago");
        vendedor1.setEndereco("rua sem nome ");
        vendedor1.setTelefone("985467238");
        vendedor1.setCodigoSetor(2);
        vendedor1.setSalarioBase(1800);
        vendedor1.setImposto(15);
        vendedor1.setValorVendas(20000);
        vendedor1.setComicao(10.5);
        
        
        //exibindo as informações de pessoa1 na tela
        System.out.println(vendedor1.getNome());
        System.out.println(vendedor1.getEndereco());
        System.out.println(vendedor1.getTelefone());
        System.out.println(vendedor1.getCodigoSetor());
        System.out.println(vendedor1.getSalarioBase());
        System.out.println(vendedor1.getValorVendas());        
        System.out.println(vendedor1.calcularSalario()+"\n");
        
    }
    
    
    
}
