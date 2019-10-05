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
public class Factura {

    private String nit;
    private double valorTotal;
    private double valorSubTotal;
    private double iva;
    
    
    public Factura(String nit, double valorTotal, double valorSubTotal, double iva) {
        this.nit = nit;
        this.valorTotal = valorTotal;
        this.valorSubTotal = valorSubTotal;
        this.iva = iva;
    }

    public Factura() {
    }

    @Override
    public String toString() {
        return this.nit +" Total: "+this.valorTotal; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
  
    
}
