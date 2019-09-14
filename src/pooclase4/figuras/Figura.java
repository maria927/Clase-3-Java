/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclase4.figuras;

/**
 *
 * @author s109e10
 */
public abstract class Figura {

     private String nombre; //polimorfismo: como todas las figuras tienen nombre, se define globalmente en esta clase abstracta
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Abstracto para que obligatoriamente las clases hijas la implementan
    
    public abstract String obtenerNombre();  //no se hace la impl por que es método abstracto
    public abstract double obtenerVolumen();
    public abstract double obtenerArea();
    
}
