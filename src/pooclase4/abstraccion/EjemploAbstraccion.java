/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclase4.abstraccion;

/**
 *
 * @author s109e10
 */
public class EjemploAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante();
        estudiante.setNombreProtegido("Juan");
        estudiante.imprimirPersona();
        
        Estudiante estudianteSalario = new Estudiante();
        estudianteSalario.setMatricula(500000);
        estudianteSalario.setSalario(2000000);
        estudianteSalario.calcularSalario();
        
        Empleado empleado = new Empleado();
        empleado.setSalario(3000000);
        empleado.calcularSalario();
        
    }
    
}
