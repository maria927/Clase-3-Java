/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author s109e10
 */
public class EjemploDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ingresarDatos();
        
    }
    
    public static void ingresarDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción: A) Sumar B) Restar S) Salir");
        String opcion= scanner.next();
        while (!opcion.equals("S")) {
            
            System.out.println("La opción seleccionada es: "+opcion);
            
            
            //Acá van los if o switch segun la condición. en el switch en default se colocaría opcion= s para que se salga
            
            
            System.out.println("Ingrese una opción: A) Sumar B) Restar S) Salir");
            opcion= scanner.next();
        }
        
        
        
    }
    
}
