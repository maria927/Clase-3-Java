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
public class Persona {
    
    private String nombre;
    protected String nombreProtegido;
    private int edad;
    private double sueldo;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.nombreProtegido = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    //Sobrecarga
    public Persona()
    {
    }

    public Persona(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    //
    
//    public String obtenerNombre(){  //es lo mismo que getNombre
//    
//        return this.nombre;
//    }
//    
//    public void asignarNombre(String nombre){ //es lo mismo que setNombre
//         this.nombre = nombre;
//         this.nombreProtegido = nombre;
//    }
 
    public void imprimirPersona (){
        System.out.println("El nombre de la persona es: "+ this.nombre);
    }

    public void calcularSalario(){
        
    }
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
    

}
