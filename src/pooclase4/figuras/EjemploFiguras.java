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
public class EjemploFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Punto puntoUno = new Punto(5, 10);
        Circulo circuloUno = new Circulo(8, puntoUno);
        circuloUno.setNombre("Mi círculo de prueba");
        String smsCirculo =circuloUno.obtenerNombre();
        System.out.println(smsCirculo + " con area "+circuloUno.obtenerArea());
    
        Cuadrado miCuadrado = new Cuadrado();
        miCuadrado.setLado(8);
        miCuadrado.setNombre("Mi cuadrado de prueba");
        System.out.println(miCuadrado.obtenerNombre() + " con area "+ miCuadrado.obtenerArea());
        
        
    }
    
}
