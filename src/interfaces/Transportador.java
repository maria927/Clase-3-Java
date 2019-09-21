/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Maria
 */

//Las interfaces solo se usan para comportamientos
public interface Transportador {
    
    public boolean horarioCumplido();
    public int cantidadPasajeros();
    public double cantidadCombustible();
}
