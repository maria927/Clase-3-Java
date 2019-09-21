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
public class EjemploConstEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta miCuenta= new Cuenta();
        System.out.println("Consecutivo "+miCuenta.CONSECUTICO_INICIAL); 
        
        //Enum: lista de valores para estar disponibles, se usa para valores que no cambian  
        //sin propiedades
        System.out.println("Tipo de madera: "+TipoMadera.PINO);
        System.out.println("Tipo de madera: "+TipoMadera.ROBLE);
        
        //Enum2 con propiedades
        System.out.println("Maderas "+ Maderas.PINO.color);
        System.out.println("Maderas "+ Maderas.PINO.peso);
   }
    
}
//clase normal se crea la implementacion y atributos, clase abstracta con la firma, interface solo la declaracion
// la diferencia entre herencia e  interface es que en erencia se puede heredar deuna sola clase,y interfaces pueden haber muchas