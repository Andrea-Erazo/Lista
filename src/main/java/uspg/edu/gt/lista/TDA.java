
package uspg.edu.gt.lista;

import javax.swing.JOptionPane;

public class TDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista Listita = new Lista();
        char opcion= 0,el;
        do{
            try{
                opcion = (char) Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar elemento al inicio de la lista\n2.Mostrar los datos de la lista\n"
                                + "3. Salir","MENU DE OPCIONES"));
                
                
                switch(opcion){
                    case 1:
                        try{
                            el= (char) Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Elemento:",
                                    "Insertando al inicio",3));
                            
                            
                        Listita.AgregarInicio(el);
                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error" + n.getMessage());
                            
                        }
                        
                        break;
                        
                    case 2:
                        Listita.mostrarLista();
                        
                        break;
                        
                    case 3:
                        
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                    
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());
                
            }
            
        }while(opcion!=3);
           
    }
    
}
