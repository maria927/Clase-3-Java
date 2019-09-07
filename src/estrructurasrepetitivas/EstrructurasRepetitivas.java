/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrructurasrepetitivas;

import java.util.Scanner;

/**
 *
 * @author s109e10
 */
public class EstrructurasRepetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Días de la semana con For
       // diasDeLaSemanaTxt();
        
        //Dias de la semana con while
        diasDeLaSemanaWhile();
    }
    
    //Agregar a un arreglo los días de la semana
    public static void diasDeLaSemanaTxt()
    {
        String[] diasSemana = new String[7];
        Scanner scanner = new Scanner(System.in);
       
        
   
        
        //Ingreso de datos
        for (int i = 0; i < 7; i++) {
           //Ingreso día
            System.out.println("Ingrese el dia "+ (i+1)+" de la semana");
             String dia = scanner.nextLine();
             System.out.println("El día ingresado es: "+dia);
             diasSemana[i]=dia;
        }
        
       //Impresión datos
       for (int i = 0; i < diasSemana.length; i++) {  //lenght obtiene el tamaño del vector
            String dia = diasSemana[i];
            System.out.println("El día de la semana es: "+dia);
            
        }
      
    }

    private static void diasDeLaSemanaWhile() {
     
        String[] diasSemana = new String[7];
        Scanner scanner = new Scanner(System.in);
        
        int i=0;
        while (i<diasSemana.length) {            
          System.out.println("Ingrese el dia "+ (i+1)+" de la semana");
          String dia = scanner.nextLine();
          System.out.println("El día ingresado es: "+dia);
          diasSemana[i]=dia;  
          i++;
        }
        
        i=0;
       
        while (i<diasSemana.length) {
           
            String dia = diasSemana[i];
            System.out.println("El día de la semana es: "+dia);
            i++;
        }

      
            
        }
    }
    

