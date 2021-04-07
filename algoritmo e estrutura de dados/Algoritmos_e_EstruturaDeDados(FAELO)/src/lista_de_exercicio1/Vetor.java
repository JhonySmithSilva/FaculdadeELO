/*
 Crie uma classe chamada Vetor, com os atributos: vetor de Strings e uma variável inteira
para armazenar a quantidade de valores válidos dentro do Vetor.
Implemente os seguintes métodos, utilizando os mesmos tipos para passagem de parâmetro e
para retorno dos métodos, como descrito na classe abaixo:
___________________________________
|            Vetor                |
|---------------------------------|
|+ elementos: array               |
|+ capacidade: int                | 
|---------------------------------|
|+ adicionar(int, String): void   |
|+ aumentarCapacidade(): void     |
|+ tamanho(): int                 |
|+ toString(): String             |
|+ pesquisa(String): boolean      | 
|+ busca(int): String             |
|+ remove(int): void              |
|+ estaVazio(): boolean           |
|_________________________________|
 */
package lista_de_exercicio1;

/**
 *
 * @author jony_
 */
public class Vetor {
    
    public int capacidade ;
    public String[] elementos;  

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        elementos = new String[capacidade];
    }

    public void adicionar(int posicao, String elemento){         
        if(posicao > 0 && posicao < this.elementos.length){            
            this.elementos[posicao] = elemento;            
        }
        else{
            this.capacidade = posicao;
            aumentarCapacidade(1);
            this.elementos[posicao] = elemento;
        }        
                
    } 
    public void aumentarCapacidade(int novaCapacidade){
        if(this.capacidade >= this.elementos.length){
            String vetorMaior[] = new String [this.capacidade + novaCapacidade];
            for(int i = 0; i < this.elementos.length; i++){
                vetorMaior[i] = this.elementos[i];
            }
            this.elementos = vetorMaior;
            this.capacidade = elementos.length;
        }
    }
    public int tamanho(){
        return this.elementos.length;
    }
    public String toString(){        
        String retorno = "";
        return retorno;
    }
    public boolean pesquisar(String pesquisarElemento){
        boolean retorno = false;
        for(int i = 0; i < this.elementos.length; i++){
            if(pesquisarElemento.equals(this.elementos[i])){
                retorno = true;
            }
        }        
        return retorno;
    }
    public String buscar(int posicao){        
        String retorno = this.elementos[posicao];
        return retorno;
    }
    public void remover(int posicao){
        
    }
    public boolean estaVazio(){        
        boolean retorno = true;
        return retorno;
    }   
    
    public void imprimirElementosVetor(){        
        for(int i = 0; i< this.elementos.length; i ++){
            if(this.elementos[i] != null){
            System.out.print(this.elementos[i]);
            }
            else{
            System.out.print("[]");
            }
            System.out.print(" , ");
        }        
    }
}
