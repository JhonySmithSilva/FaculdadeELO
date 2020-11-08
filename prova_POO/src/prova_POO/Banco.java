
package prova_POO;

/**
 *
 * @author Jonatas Severino da Silva
 */
public class Banco {
    
    public static void main(String[] agrs){
        
        Conta conta = new Conta(/*"Jonatas Severino da Silva",12345,5560.00*/);
        
        conta.imprimirConta();
        conta.deposito();
        conta.imprimirConta();
        conta.saque();
        conta.imprimirConta();
       
    
    }  //fim do metodo main  
    
}//fim da classe banco
