/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author s109e10
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        convertirNumeros();
        System.out.println("Mensaje despues de convertir números");
        
    }
    
    public static void convertirNumeros()
    {
        try {
              Integer wrapperInteger = new Integer("hola mundo");  
        } catch (Exception e) {
            
            System.out.println("Ingresa al catch");
        }

        
    
        
    }
    
}
