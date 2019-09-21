/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author s109e10
 */
public class Avion implements Voladores, Transportador{

    @Override
    public void despegar() {
        System.out.println("Despegando avión.....");
       
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando avión.....");
    }

    @Override
    public boolean servirComida() {
        System.out.println("En el avión si reparten comida");
        return true;
    }

    @Override
    public void volar() {
        System.out.println("Volando avión");
    
    }

    @Override
    public boolean horarioCumplido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantidadPasajeros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double cantidadCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
