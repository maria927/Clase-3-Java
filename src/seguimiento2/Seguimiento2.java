/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento2;

import java.util.Scanner;

/**
 *
 * @author s109e10
 */
public class Seguimiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primer punto utilizando for
            // numerosUnoACienFor();
        //Segundo punto utilizando for
            // numerosCienAUnoFor();
        
        //Tercer punto utilizando for
            // numerosParesFor();
        
        //Cuarto Punto utilizando for
            //sumaNumerosFor();
        
        //Quinto Punto utilizando for
            //numeroDeAsteriscosFor();
        
        //Sexto Punto utilizando for
            tablaParImparFor();
    }

    private static void numerosUnoACienFor() {
        
        int[] numeros = new int[100];
        System.out.println("Números del 1 al 100");
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = i+1;
            System.out.println(numeros[i]);
            
        }
    }

    private static void numerosCienAUnoFor() {
        
        System.out.println("Números del 100 al 1");
        
            for(int i = 100; i > 0; i--)
        {
            System.out.println(i);
        }
    }

    private static void numerosParesFor() {
        
        for (int i = 1; i <= 150; i++) {
            
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            
        }
    }

    private static void sumaNumerosFor() {
        
        int suma = 0;
        for (int i = 1; i <= 200; i++) {
            
           suma = suma + i; 
          
        }
        System.out.println("La suma de los numeros del 1 al 200 es: "+suma);
    }

    private static void numeroDeAsteriscosFor() {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Ingrese el número");
             int numeroIngresado =scanner.nextInt();
           
             for (int i = 0; i < numeroIngresado; i++) {
                 System.out.print("*");
              }
    }

    private static void tablaParImparFor() {
       
        String[][] mimatriz = new String[10][10];
        
        int contador = 0;
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                
                
              
                if (contador %2 == 0)
                {
                    mimatriz[fila][columna] = "X "; 
                }
                else
                {
                    mimatriz[fila][columna] = "O "; 
                }
                contador = contador+1;
                System.out.print(mimatriz[fila][columna]);
                
            }
            
            System.out.println();   
        }
    }
    
}
