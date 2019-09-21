/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recolector;

/**
 *
 * @author Maria Isabel
 */
public class Carro {
    
    //Definir atributos
    private String color;  //Privado por que es propio de la clase
    private int nroPuertas;
    private int modelo;
    private String marca;
    
    
    //Constructor
    public Carro()
    {
        
    }
    
    //Constructor
     public Carro(String color, int nroPuertas, int modelo, String marca)
    {
        this.color = color;
        this.marca = marca;
        this.nroPuertas = nroPuertas;
        this.modelo = modelo;
    }
    
    
    public void acelerar()
    {
       
    }
    
    public void frenar()
    {
       
    }
    
    public double valorCarro()
    {
        if (this.modelo > 2010 && this.nroPuertas == 4) 
        {  //this por  que es el contexto de la clase
           return 50000000; 
        }
        
         if (this.modelo > 2010 && this.nroPuertas == 2) 
        {  //this por  que es el contexto de la clase
           return 40000000; 
        }
         
        if (this.modelo <= 2010 && this.nroPuertas == 4) 
        {  //this por  que es el contexto de la clase
           return 30000000; 
        }
        
        if (this.modelo <= 2010 && this.nroPuertas == 2) 
        {  //this por  que es el contexto de la clase
           return 25000000; 
        }
        
        return 1000000;
        
    }
    
    public void imprimirCarro()
    {
        System.out.println("El carro es de marca: "+this.marca); 
        System.out.print(" de color: "+this.color);
        System.out.print(" de modelo: "+this.modelo);
        System.out.println(" y tiene "+this.nroPuertas+" puertas");
   }
    
}