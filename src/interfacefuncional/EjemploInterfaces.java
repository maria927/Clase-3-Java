/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefuncional;

/**
 *
 * @author s109e10
 */
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tester test = () -> { System.out.println("Implementacion método imprimir");
       };
       
       test.imprimir();
       test.imprimir2();
      
       Tester test2 = () -> { System.out.println("Hola, implementacion test2");
       };
       
       test2.imprimir();
    }
    
}
