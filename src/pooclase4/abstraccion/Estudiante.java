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
public class Estudiante extends Persona{

    private String universidad;
    private double semestre;
    private double matricula;

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    
    @Override
    public void imprimirPersona() {
       
        //Crear implementacion
        System.out.println("El estudiante es: "+this.nombreProtegido);
    }

    @Override
    public void calcularSalario() {
        
         double salario = this.getSalario() - matricula;
         System.out.println("el salario de estudiante es "+salario);
        
    }
    
}
