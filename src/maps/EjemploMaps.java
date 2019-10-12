/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author s109e10
 */
public class EjemploMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       // crearHashmap();
         //crearTreemap();
        crearLinkedMap();
    }
    
    public static void crearHashmap()
    {
       Map<Integer, String> milista = new HashMap<>();
       milista.put(55, "LORENA");
       milista.put(6, "JOSE");
       milista.put(77, "CESAR");
       milista.put(3, "LUIS");
       
        for (Map.Entry<Integer, String> elemento : milista.entrySet()) {
            Integer key = elemento.getKey();
            String value = elemento.getValue();
            System.out.println("Llave "+key+" valor "+value);
            
        }
    }
    
    
        public static void crearTreemap()
    {
       Map<Integer, String> milista = new TreeMap<>();
       milista.put(55, "LORENA");
       milista.put(6, "JOSE");
       milista.put(77, "CESAR");
       milista.put(3, "LUIS");
       
       milista.forEach((llave,valor) -> {
           System.out.println("Llave "+llave+" valor "+valor);
       });
       
       

    }
        
           public static void crearLinkedMap()
    {
       Map<Integer, String> milista = new LinkedHashMap<>();
       milista.put(55, "LORENA");
       milista.put(6, "JOSE");
       milista.put(77, "CESAR");
       milista.put(3, "LUIS");
       
       milista.forEach((llave,valor) -> {
           System.out.println("Llave "+llave+" valor "+valor);
       });
       
       

    }
    
}
