/*
 * Faculdade ELO
 * Disciplina: Algoritmos e Estruturas de Dados
 * Professor: João Ferreira
 */
package primeira_VA;

/**
 * @author Jonatas Severino Da Silva
 */
public class VetorDeObjetos {
    
    private Object[] vetorObject;
    private int tamanho;    

    public VetorDeObjetos(int tamanhoInicialVetor) {
        if(tamanhoInicialVetor <= 0 ){
            this.vetorObject = new Object[1];
            this.tamanho = 1;
        }
        else{
            this.vetorObject = new Object[tamanhoInicialVetor];
            this.tamanho = tamanhoInicialVetor;
        }
        
    }
    
        public boolean adicionar(Object elemento){        
            aumentarCapacidade();        
            if(this.vetorObject.length > this.tamanho){            
                this.vetorObject[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            }
            return false;
        }
        private void aumentarCapacidade(){               
            if(this.tamanho == this.vetorObject.length){
                Object[] vetorMaior = new Object[this.vetorObject.length + 1];
                for(int i = 0; i < this.tamanho; i++){
                    vetorMaior[i] = this.vetorObject[i];
                }
                this.vetorObject = vetorMaior;
            }
        }
        public int getTamanho(){        
            return this.tamanho;
        }
        @Override
        public String toString(){
            String mensagem ="";
            for(int i = this.tamanho-1; i >= 1; i--){                
                    mensagem +="[ " + this.vetorObject[i] + " ] \n";                
                }
            if(this.tamanho == 0 ){
                mensagem += this.vetorObject[this.tamanho-1];
            }         
            return mensagem;     
        } 
        public boolean pesquisar(Object vetorObject){
            for(int i = 0; i < this.vetorObject.length; i++){
                if(vetorObject.equals(this.vetorObject[i])){
                    return true;
                } 
            }
            return false;
        } 
        public void remover(){
            if(this.tamanho == 0){
                System.out.println("a pilha está vazia!");
            }
            else{
                this.vetorObject[this.tamanho-1]=null;
                this.tamanho--;
                System.out.println(
                    "o elemento " + this.vetorObject[this.tamanho] + " foi removido."
                );
            }
        }
        public boolean estaVazio(){
            if(this.tamanho == 0){
                return true;
            }
            return false;}
    }
