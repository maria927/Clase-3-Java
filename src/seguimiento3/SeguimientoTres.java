/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento3;

import java.util.Scanner;

/**
 *
 * @author s109e10
 */
public class SeguimientoTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     //Número aleatorio de 6 dígitos
        System.out.println("----------Punto 2---------");
        double nroAleatorio = generarAleatorios();
        System.out.println("El número aleatorio de 6 dígitos es: "+Math.round(nroAleatorio));
        
     //Palabra en CamelCase, UpperCase y LowerCase
        System.out.println("----------Punto 3---------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese palabra ");
        String palabra = scanner.next();
        convertirPalabra(palabra);
        
    }
    
    public static double generarAleatorios()
    {
        double nroAleatorio=  Math.random() * 1000000;
        
        return nroAleatorio;
    }
    
    public static void convertirPalabra(String palabra)
    {
        
        System.out.println("Palabra en Lower Case: "+palabra.toLowerCase());
        System.out.println("Palabra en Upper Case: "+palabra.toUpperCase());
        
        String primeraLetra = palabra.substring(0, 1).toUpperCase();
        String palabraCamelCase= palabra.replace(palabra.substring(0, 1), primeraLetra);

        System.out.println("Palabra en Camel Case: "+palabraCamelCase);

    
    }
    
}
