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
public class Cuadrado extends Figura {
    
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String obtenerNombre() {
       return super.getNombre() + " es de tipo Cuadrado."; //invoco el nombre del padre
    }

    @Override
    public double obtenerVolumen() {
       return 0;
    }

    @Override
    public double obtenerArea() {
        return this.lado* this.lado;
    }
    
}
