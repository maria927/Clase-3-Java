/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclase4.herencia;

/**
 *
 * @author s109e10
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona personaUno = new Persona();
        //personaUno.asignarNombre("JUAN");
        
        personaUno.setNombre("JUAN");
        personaUno.imprimirPersona();
        
        //Como le paso parámetros no es necesario usar asignarNombre
        Persona personaDos = new Persona("CARLOS", 20, 3000000.0);
        personaDos.imprimirPersona();
        
        Estudiante estudianteUno = new Estudiante();
       // estudianteUno.asignarNombre("SAMUEL");
        
        estudianteUno.setNombre("SAMUEL");
        estudianteUno.imprimirPersona();
        
        System.out.println(personaUno);
    }
    
}
