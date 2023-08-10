
package Negocio;

import extra.pkg3.guia.pkg3.Cliente;
import extra.pkg3.guia.pkg3.Producto;
import extra.pkg3.guia.pkg3.Vendedor;


public class Venta {
    private Cliente cliente;
    private Vendedor salesman;
    private Producto product1;
    private Producto product2;
    private Producto product3;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getSalesman() {
        return salesman;
    }

    public void setSalesman(Vendedor salesman) {
        this.salesman = salesman;
    }

    public Producto getProduct1() {
        return product1;
    }

    public void setProduct1(Producto product1) {
        this.product1 = product1;
    }

    public Producto getProduct2() {
        return product2;
    }

    public void setProduct2(Producto product2) {
        this.product2 = product2;
    }

    public Producto getProduct3() {
        return product3;
    }

    public void setProduct3(Producto product3) {
        this.product3 = product3;
    }
    
    
    public void calcularTotal(){
        int total = 0;
        if(cliente.getProvincia()== "San Luis"){
           
        total = (product1.calcularPrecioPublico()+product2.calcularPrecioPublico()+product3.calcularPrecioPublico());
            total = (int) (total*0.9);
        }else{
           
        total = (product1.calcularPrecioPublico()+product2.calcularPrecioPublico()+product3.calcularPrecioPublico());
            total = (int)(total*0.85);
        }
        System.out.println(total);
        
    }
    
    
}
