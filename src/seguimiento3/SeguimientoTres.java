/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s109e10
 */
public class SeguimientoTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     //Calcular altura árbol
        System.out.println("----------Punto 1---------");
        calcularAltura();
        
     //Número aleatorio de 6 dígitos
        System.out.println("----------Punto 2---------");
        double nroAleatorio = generarAleatorios();
        System.out.println("El número aleatorio de 6 dígitos es: "+Math.round(nroAleatorio));
        
     //Palabra en CamelCase, UpperCase y LowerCase
        System.out.println("----------Punto 3---------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese palabra ");
        String palabra = scanner.next();
        convertirPalabra(palabra);
        
     //Horóscopo
        System.out.println("----------Punto 4---------");
        horoscopo();
      
        
    }
    
    public static double generarAleatorios()
    {
        double nroAleatorio=  Math.round(Math.random() * 1000000);
        
        return (int)nroAleatorio;
    }
    
    public static void convertirPalabra(String palabra)
    {
        
        System.out.println("Palabra en Lower Case: "+palabra.toLowerCase());
        System.out.println("Palabra en Upper Case: "+palabra.toUpperCase());
        
        String palabraToLower= palabra.toLowerCase();
        String primeraLetra = palabraToLower.substring(0, 1).toUpperCase();
        String palabraCamelCase= palabraToLower.replace(palabraToLower.substring(0, 1), primeraLetra);

        System.out.println("Palabra en Camel Case: "+palabraCamelCase);

    
    }
    
    public static void horoscopo()
    {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Si quieres llevar a cabo una tarea complicada llama a un amigo");
        frases.add("Si alguien te juzga, es que se lo estás poniendo muy difícil");
        frases.add("Si una persona cree que no merece la pena ayudarte, créeme: no lo mereces");
        frases.add("Nadie siente las cosas con tanta profundidad");
        frases.add("Todo el mundo conoce tu lado sensible, pero pocos tienen el privilegio de conocer su lado más salvaje");
        frases.add("La vida no trata de encontrarse a uno mismo, sino de crearse a uno mismo");
        frases.add("Dicen que la suerte surge proporcionalmente a tu sudor. Cuanto más sudes, más suerte tendrás");
        frases.add("Lo que haces por ti se desvanece cuando mueres. Lo que haces por el resto conforma tu legado");
        frases.add("No hay mejor maestro que la experiencia más amarga de uno mismo.");
        frases.add("Si no te gusta algo, cámbialo. Si no lo puedes cambiar, cambia tu actitud.");
        
        double nroAleatorio=  Math.round(Math.random() * 9);

        System.out.println(frases.get((int)nroAleatorio));
    }

    private static void calcularAltura() {
        double y;
        int angulo=35;
        double x = 20;
       
        y= Math.round(x*Math.tan(Math.toRadians(angulo)));
        
        System.out.println("El resultado es: "+y);
        
    }
    
}
