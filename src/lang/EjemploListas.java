/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.ArrayList;

/**
 *
 * @author s109e10
 */
public class EjemploListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listas();
    }
    
    public static void listas()
    {
        ArrayList<String> miLista = new ArrayList<>();
        //Agregar
        miLista.add("Claudia");
        miLista.add("Juan David");
        miLista.add("Luis");
        System.out.println(miLista);
        int size = miLista.size();
        System.out.println(size);
        
        //Obtener elemento
        try {
        String miEstudiante= miLista.get(2);
            System.out.println(miEstudiante);
            boolean existeEstudiante = miLista.contains("Carlo");
            System.out.println("Existe: "+existeEstudiante);
            
            boolean seElimino =miLista.remove("Luis");
            System.out.println("Se eliminó "+seElimino);
            System.out.println(miLista);
            
            String seEliminoPosicion = miLista.remove(0);
            System.out.println("Se elimino:"+seEliminoPosicion);
            
            System.out.println(miLista);
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        
    }
}
