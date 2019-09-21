/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum_constantes;

/**
 *
 * @author s109e10
 */
public enum Maderas {
    ROBLE("Rojo", 500),
    PINO("Verde", 400)
    ;
        
    public final String color;
    public final double peso;
    
    
    private Maderas(String color, double peso)  // tambien se puede solo Maderas()
    {
        this.color =  color;  //this para hacer referencia al atributo de la clase
        this.peso = peso;
    }
}
