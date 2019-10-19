/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author s109e10
 */
public class EjemploBuffered {


    public static void main(String[] args) {
       
        try {
               //crearArchivoBuffered(); 
               //leerArchivo();
               leerArchivoExcel();
        } catch (Exception e) {
        }
    
    }
    
    private static void crearArchivoBuffered() throws IOException{
    
        FileWriter miStream = null;
        BufferedWriter miBuffer = null;
        try {
            miStream = new FileWriter("pruebaOutputStream.txt");
            miBuffer = new BufferedWriter(miStream);
            miBuffer.append("Linea 1");
            miBuffer.newLine();
            miBuffer.append("Linea 2");
          
        } finally {
            
               if (miBuffer!= null) {
                miBuffer.close();
            }
                 if (miStream!= null) {
                miStream.close();
                
       
        }
        
    }
    
    }
    
    private static void leerArchivo() throws IOException
    {
        BufferedReader miBuffer = new BufferedReader(new FileReader("pruebaInputStream.txt"));
        String linea= miBuffer.readLine();
        while (linea != null) {
            System.out.println(linea);
            miBuffer.readLine();
            linea= miBuffer.readLine();
        }
        miBuffer.close();
    }
    
      private static void leerArchivoExcel() throws IOException
    {
        BufferedReader miBuffer = new BufferedReader(new FileReader("productos.csv"));
        String linea= miBuffer.readLine();
        while (linea != null) {
            System.out.println(linea);
            miBuffer.readLine();
            linea= miBuffer.readLine();
        }
        miBuffer.close();
    }
}
