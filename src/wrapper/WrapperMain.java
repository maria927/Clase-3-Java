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
        
        Double wrapperSaldo = new Double("8000");
        boolean isNan= wrapperSaldo.isNaN();
        
        System.out.println("Is nan "+isNan);
    }
    
}
