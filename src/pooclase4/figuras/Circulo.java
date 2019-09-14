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
public class Circulo extends Figura{  

    
    private double radio;
    private Punto puntoCentral; 

    
    //Sobrecarga
    public Circulo(double radio, Punto puntoCentral) {
        this.radio = radio;
        this.puntoCentral = puntoCentral;
    }
    
     
    public Circulo()
    {
    }
    //
    public double getRadio() {
        return radio;
    }

    //Hereda de Figura para implementar los métodos
    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public String obtenerNombre() {
        return super.getNombre() + " es de tipo Circulo "+ puntoCentral;
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
}
