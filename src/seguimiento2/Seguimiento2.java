/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento2;

/**
 *
 * @author s109e10
 */
public class Seguimiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primer punto
            // numerosUnoACien();
        //Segundo punto
            // numerosCienAUno();
        
        //Tercer punto
        numerosPares();
    }

    private static void numerosUnoACien() {
        
        int[] numeros = new int[100];
        System.out.println("Números del 1 al 100");
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = i+1;
            System.out.println(numeros[i]);
            
        }
    }

    private static void numerosCienAUno() {
        
        System.out.println("Números del 100 al 1");
        
            for(int i = 100; i > 0; i--)
        {
            System.out.println(i);
        }
    }

    private static void numerosPares() {
        
        for (int i = 1; i <= 150; i++) {
            
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            
        }
    }
    
}
