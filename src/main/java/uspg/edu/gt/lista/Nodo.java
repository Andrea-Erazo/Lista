
package uspg.edu.gt.lista;

public class Nodo {
    public char dato;
    public Nodo siguiente;
    public Nodo(char d){
        this.dato= d;
    }
    
    public Nodo(char d, Nodo n){
        dato = d;
        siguiente = n;
        
    }
}
