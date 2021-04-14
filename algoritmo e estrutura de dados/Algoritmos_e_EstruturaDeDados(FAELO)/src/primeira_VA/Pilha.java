/*
 * Faculdade ELO
 * Disciplina: Algoritmos e Estruturas de Dados
 * Professor: João Ferreira
 */
package primeira_VA;

/**
 * @author Jonatas Severino Da Silva
 */
public class Pilha {
    
    private String[] elementos;
    private int tamanho;

    public Pilha(int tamanhoInicialVetor) {        
        if(tamanhoInicialVetor <= 0 ){
            this.elementos = new String[1];
            this.tamanho = 1;
        }
        else{
            this.elementos = new String[tamanhoInicialVetor];
            this.tamanho = tamanhoInicialVetor;
        }
    }
    
    public boolean empilhar(String elemento){        
        aumentarCapacidade();        
        if(this.elementos.length > this.tamanho || this.elementos.length == 0){            
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    public int getTamanho(){        
        return this.tamanho;
    }
    public boolean pesquisar(String elementos){
        for(int i = 0; i < this.elementos.length; i++){
            if(elementos.equalsIgnoreCase(this.elementos[i])){
                return true;
            } 
        }
        return false;
    } 
    @Override
    public String toString(){
        String mensagem = "";
        for(int i = this.tamanho-1; i >= 1; i--){                
                mensagem += "[ " + this.elementos[i] + " ] \n";                
            }
        if(this.tamanho == 0 ){
            System.out.println("pilha vazia!");
            //
        }else{
            mensagem += this.elementos[this.tamanho-1];
        }         
        return mensagem;     
    }    
    private void aumentarCapacidade(){       
        String[] vetorMaior = new String[this.elementos.length];
        if(this.tamanho == this.elementos.length){
            vetorMaior = new String[this.elementos.length + 1];
            for(int i = 0; i < this.elementos.length; i++){
                vetorMaior[i] = this.elementos[i];
            }
            this.elementos = vetorMaior;
        }
    }
    public void desempilhar(){
        if(this.tamanho == 0){
            System.out.println("a pilha está vazia!");
        }
        else{
            this.elementos[this.tamanho-1]=null;
            this.tamanho--;
            System.out.println(
                "o elemento " + this.elementos[this.tamanho] + " foi removido."
            );
        }
    }
    public boolean estaVazia(){
        if(this.tamanho == 0){
            return true;
        }
        return false;
    }
    public String topo(){
        if(this.tamanho == 0){
            return "a pilha está vazia!";
        }        
        return this.elementos[this.tamanho-1];        
    }
    
}
