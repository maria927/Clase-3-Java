/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author s109e10
 */
public class Perro {

private String nombre;
private String raza;
private double altura;
  
//Sobrecarga
public Perro()
    {
    }

public Perro(String nombre)
    {
        nombre = this.nombre;
    }

public Perro(String nombre,String raza,double altura)
    {
        nombre = this.nombre;
        raza = this.raza;
        altura = this.altura;
    }
}



