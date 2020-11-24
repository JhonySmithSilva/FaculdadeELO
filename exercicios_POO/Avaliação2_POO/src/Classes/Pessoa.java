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
public class Pessoa {
    
    private String nome,endereco,telefone;

        
    public Pessoa(){
            
    }//fim do construtor da classe

    public String getNome() {
        return "nome: " + nome;
    }

    public String setNome(String nome) {
       this.nome = nome;
       return nome;
    }

    public String getEndereco() {
        return "endereço: "+endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return "telefone: "+telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
