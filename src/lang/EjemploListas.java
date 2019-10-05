/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
//        ArrayList<String> miLista = new ArrayList<>();
//        //Agregar
//        miLista.add("Claudia");
//        miLista.add("Juan David");
//        miLista.add("Luis");
//        System.out.println(miLista);
//        int size = miLista.size();
//        System.out.println(size);
//        
//        //Obtener elemento
//        try {
//        String miEstudiante= miLista.get(2);
//            System.out.println(miEstudiante);
//            boolean existeEstudiante = miLista.contains("Carlo");
//            System.out.println("Existe: "+existeEstudiante);
//            
//            boolean seElimino =miLista.remove("Luis");
//            System.out.println("Se eliminó "+seElimino);
//            System.out.println(miLista);
//            
//            String seEliminoPosicion = miLista.remove(0);
//            System.out.println("Se elimino:"+seEliminoPosicion);
//            
//            System.out.println(miLista);
//        } catch (Exception e) {
//            System.out.println("Error "+e.getMessage());
//        }
        
//     listaFacturas();
//       pilas();
       colas();
       
    }
    
    public static void listaFacturas()
    {
        ArrayList<Factura> misFacturas = new ArrayList<>();
        Factura nro1 = new Factura("100",19,55000,80000);
        misFacturas.add(nro1);
        Factura nro2= new Factura("110",19,55000,3000);
        misFacturas.add(nro2);
        System.out.println(misFacturas);
        
        Factura obtenerFactura1 = misFacturas.get(0);
        System.out.println("La factura obtenida es: "+obtenerFactura1);
    }
    
    public static void pilas()
    {
      Stack<Integer> miPila = new Stack<>();
      miPila.add(1);  //Libro 1 base
      miPila.add(2);  //Libro 2 en el medio
      miPila.add(3);  //Libro 3 en la cima
      
       System.out.println("Size: "+miPila.size());
        System.out.println("Elimina ultimo: "+miPila.pop() ); //eliminar el ultimo
        System.out.println("Obtiene ultimo: "+miPila.peek() ); //Para obtener el ultimo sin eliminarlo
        
        System.out.println("Size: "+miPila.size());
      
    }
    
    public static void colas()
    {
        Queue<String> miListaCola = new LinkedList<>();
        miListaCola.add("A");  //turno1
        miListaCola.add("B");  //turno2
        miListaCola.add("C");  //turno3
        
        System.out.println("Size: "+miListaCola.size());
        System.out.println("Remover: "+miListaCola.poll());  //remover
        System.out.println("Size: "+miListaCola.size());
        System.out.println("Obtener: "+miListaCola.peek()); 
    }
}
