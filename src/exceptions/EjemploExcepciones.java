/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s109e10
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            //convertirNumeros();
            //lanzarExcepcion();
            //lanzarExcepcionConThrows();
            
            ejecucionDeDatos();
            System.out.println("Mensaje despues de convertir números");
        } catch (Exception ex) {
            System.out.println("Capturando la excepcion desde el main");
            System.out.println(ex);
        }
        
    }
    
    public static void convertirNumeros()
    {
        try {
              Integer wrapperInteger = new Integer("hola mundo");
              System.out.println("Esto se ejecuta o no");
        } catch (Exception e) {
            
            System.out.println("Ingresa al catch "+e);
        } finally 
        {
            System.out.println("Ejecucion en el finally");
        
        }
 
    }
    
    
    //Con trow
    public static void lanzarExcepcion()
    {
        
        try {
            System.out.println("Inicio para lanzar una excepción");
            throw new Exception("Esta es la excepción lanzada");
        } catch (Exception ex) {
            System.out.println("Capturar la excepción "+ex);
        }
    }
    
    //Con throws
    
    public static void lanzarExcepcionConThrows() throws Exception
    {
       throw new Exception("Esta es la excepción lanzada desde el método con throws");
    }

    public static void ejecucionDeDatos() throws Exception
    {
          lanzarExcepcionConThrows();
    }
}

