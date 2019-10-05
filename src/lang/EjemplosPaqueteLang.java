/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

/**
 *
 * @author s109e10
 */
public class EjemplosPaqueteLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear numero aleatorio
        
//        double nro1=  Math.random();
//        System.out.println(nro1);
//        
//        double nro2= Math.random()*100;
//        System.out.println(nro2);
//        
//        System.out.println("Número redondeado: "+Math.round(nro2));
//        System.out.println("Número redondeado menor: "+Math.floor(nro2));
//        System.out.println("Número redondeado mayor: "+Math.ceil(nro2));
//        
//        
//        //CHARACTER
//        
//        char miChar;
//        Character mi_Char = 'p';
//        Character mi_Char2 = 'A';
//        
//        boolean isDigit = Character.isDigit(mi_Char);
//        System.out.println("El char es dígito: "+isDigit);
//        
//        int compare= mi_Char.compareTo(mi_Char2);
//        System.out.println("Comparación: "+compare);   //Si es igual, éste retorna cero
//        
//        System.out.println("Upper: "+Character.toUpperCase(mi_Char));
//        System.out.println("Upper: "+mi_Char.toLowerCase(mi_Char2));
       
        
     //STRING
        
        String nombre="Maria";
        String nombre2="maria";
        System.out.println("Equal: "+nombre.equalsIgnoreCase(nombre2));
        System.out.println("Equal: "+nombre.equals(nombre2));
        
        String apellido= "Alzate";
        
        //Maria Alzate
        System.out.println("Con string: "+nombre+" "+apellido);  //concatenando
        StringBuffer nombreCompleto = new StringBuffer("Maria");
        nombreCompleto.append(" Alzate");
        nombreCompleto.insert(0, "Hola: ");
        nombreCompleto.deleteCharAt(4);
        String mensajeBienvenida= nombreCompleto.substring(0,4);
        System.out.println("Con string buffer: "+nombreCompleto);
        System.out.println("Substring: "+mensajeBienvenida);
        System.out.println("Invertir : "+nombreCompleto.reverse());
        
        String mensaje= "id;nombre;apellido";
        String[] split= mensaje.split(";");
        System.out.println("Split "+split[0]+" "+split[1]+" "+split[2]);
        
    }
    
}
