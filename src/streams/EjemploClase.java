/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;

/**
 *
 * @author s109e10
 */
public class EjemploClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        

        
        
        ArrayList<String> miLista = new ArrayList<>();
        
        miLista.add("juan");
        miLista.add("luisa");
        miLista.add("daniela");
        miLista.add("catalina");
        miLista.add("eduardo");
        
        //Con stream
        miLista.stream()
                .filter((elemento) -> { return elemento.length()>=6;})
                .map((elemento)-> {return "Estudiante "+elemento.toUpperCase();})
                .forEach((elemento) -> {System.out.println(elemento);});
       
                
//            De la forma tradicional       
//            for(int i=0;i<miLista.size();i++) {
//           
//            int nroCaracteres = miLista.get(i).length();
//            
//            if(nroCaracteres >= 6)
//            {
//              System.out.println(miLista.get(i).toUpperCase());
//            }
//            
//          }
    }
    
}
