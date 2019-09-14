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
public class Empleado extends Persona {
    
   private int antiguedad;

    @Override
    public void calcularSalario() {
        super.calcularSalario(); 
        double salario = this.getSalario();
        System.out.println("El salario del empleado es: "+salario);
    }
   
   
}
