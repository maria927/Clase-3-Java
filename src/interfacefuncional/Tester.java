/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefuncional;

@FunctionalInterface
public interface Tester {
    
    public void imprimir();
    
    public default void imprimir2()
    {
        System.out.println("Impresion dos");
    }
}
