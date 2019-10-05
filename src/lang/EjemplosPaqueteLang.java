/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

/**
 *
 * @author s109e10
 */
public class EjemplosPaqueteLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear numero aleatorio
        
        double nro1=  Math.random();
        System.out.println(nro1);
        
        double nro2= Math.random()*100;
        System.out.println(nro2);
        
        System.out.println("Número redondeado: "+Math.round(nro2));
    }
    
}
