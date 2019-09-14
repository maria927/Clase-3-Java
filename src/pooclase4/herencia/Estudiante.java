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
public class Estudiante extends Persona{

    private String universidad;
    private double semestre;
    //Sobreescritura
    @Override
    public void imprimirPersona() {
        //super.imprimirPersona(); 

        //System.out.println("El nombre del estudiante es: "+ super.obtenerNombre());  //super es superclase
        System.out.println("El nombre del estudiante es: "+ this.nombreProtegido);  
    }
    
     @Override
    public void calcularSalario() {
          
          double salario = this.getSalario() - semestre;
          System.out.println("el salario de estudiante es "+salario);
    }

    
}
