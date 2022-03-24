
package uspg.edu.gt.lista;


public class Lista {
    protected Nodo inicio, fin;
    public Lista(){
        inicio= null;
        fin= null;
    }
    public void AgregarInicio(char Elemento){
        
        inicio= new Nodo(Elemento, inicio);
        if(fin==null){
            fin=inicio;
        }
        
    }
    public void mostrarLista(){
        Nodo recorrer= inicio;
        while(recorrer!=null){
            System.out.println("["+recorrer.dato+"]---->");
            recorrer= recorrer.siguiente;
            
        }
    }
    
}
