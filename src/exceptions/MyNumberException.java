/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author s109e10
 */
public class MyNumberException extends Exception{
    
    private CodigoErrores codigoError;
    
    public MyNumberException(CodigoErrores codigoError)
    {
        this.codigoError = codigoError;
    }
    
    @Override
    public String getMessage()
    {
        //Numeros negativos
        if(this.codigoError==CodigoErrores.POSITIVOS)
        {
            return "Error: solo se permiten numeros positivos";
        }
        
        //Para numeros pares
           if(this.codigoError==CodigoErrores.PARES)
        {
            return "Error: solo se permiten numeros pares";
        }
           
               //Para numeros imparespares
           if(this.codigoError==CodigoErrores.IMPARES)
        {
            return "Error: solo se permiten numeros impares";
        }
       return "Error: No definido";
    }
}
