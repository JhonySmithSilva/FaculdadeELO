/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author jony_
 */
import java.util.Scanner;
public class Menu {
    
    Scanner input = new Scanner(System.in);
    
    private int opcao;

    public Menu() {
        System.out.println(
         "1 = testar a classe pessoa\n"
        +"2 = testar a classe empregado\n"
        +"3 = testar a classe fornecedor\n"
        +"4 = testar a classe Administrador\n"
        +"5 = testar a classe Operario\n"
        +"6 = testar a classe Vendedor\n"
        +"0 = para sair do programa");
        opcao = input.nextInt();
        
        if(opcao == 1 ){
            testPessoa();
        }else{
            System.out.println("Saindo do programa");
        }
        
    }
    
    public void testPessoa(){
        Pessoa pessoa1 = new Pessoa();
        System.out.println("digite o nome da pessoa:");
        pessoa1.setNome(input.nextLine());
        System.out.println("digite o endereço da pessoa:");
        pessoa1.setEndereco(input.nextLine());
        System.out.println("digite o numero do telefone:");
        pessoa1.setTelefone(input.nextLine());
        
        System.out.println("informações do usuario\n");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getTelefone());
    }

    
    
    
}
