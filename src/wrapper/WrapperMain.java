/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author s109e10
 */
public class WrapperMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" Wrappers ");
        
        //double de tipo primitivo
        double saldo = 5000.00;
        
        //Objeto de tipo Double
        
        Double wrapperSaldo = new Double("500.9");
        boolean isNan= wrapperSaldo.isNaN();
        int intSaldo= wrapperSaldo.intValue();
        
        System.out.println("Is nan "+isNan);
        System.out.println("Int value "+intSaldo);
        
        //Convertir de int a Integer
        int edad = 80;
        //Forma  1
        Integer wrapperEdad = new Integer(edad);
        //Forma 2
        Integer wrapperEdad2 = edad;
        
        System.out.println(wrapperEdad);
        System.out.println(wrapperEdad2);
    }
    
}
