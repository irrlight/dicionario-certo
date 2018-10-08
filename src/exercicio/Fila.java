

package exercicio;

import java.util.LinkedList;

public class Fila{
    
    private LinkedList<Integer> fila;
    private int max;
    
    public Fila() {
        this.fila = new LinkedList();
        this.max = 4;
    }
    
    public Fila(int n) {
        this.fila = new LinkedList();
        this.max = n;
    }

    public void entraFila(int i){
        if(max > this.fila.size()){
            this.fila.addLast(i);
            System.out.println("Elemento "+i+" foi adicionado à fila");
        }else{
            System.out.println("Elemento "+i+" Não adicionado, pois a fila está cheia");
        }
        
    }
    
    public String saiFila(){
        
        String nome = "O elemento "+Integer.toString(this.fila.getFirst())+" saiu da fila";
        
        if(this.fila.isEmpty()){
            nome = "A fila está vazia";
        }else{            
            this.fila.removeFirst();                    
        }
        return nome;
    }
    
    public String primeiroFila(){
        String nome = "O primeiro da Fila é "+Integer.toString(this.fila.getFirst());
        return nome;
    }
    
    public boolean underflow(){
        boolean b = this.fila.isEmpty();
        return b;        
    }
    
    public boolean overflow(){        
        boolean b = (max == this.fila.size());
        return b;
    }
    
    @Override
    public String toString(){
        String nome = "< ";
        for(int i=0; i<this.fila.size();i++){
            nome += this.fila.get(i)+" ";
        }
        nome += "<";
        return nome;
    }
    
    
    
    
}
