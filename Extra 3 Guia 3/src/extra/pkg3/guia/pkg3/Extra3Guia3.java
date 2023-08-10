/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extra.pkg3.guia.pkg3;

import Negocio.Venta;


public class Extra3Guia3 {

   
    public static void main(String[] args) {
        Producto product1 = new Producto("Leche", 400, "Lacteo");
        Producto product2 = new Producto("Detergente",100, "Limpieza");
        Producto product3 = new Producto("Galleta", 300, "Otros");
        Cliente mauro = new Cliente("Mendoza");
        Cliente raul = new Cliente("San Luis");
        Vendedor marcelo = new Vendedor("Marcelo");
        Venta venta = new Venta ();
        
        venta.setCliente(raul);
        venta.setProduct1(product1);
        venta.setProduct2(product2);
        venta.setProduct3(product3);
        venta.setSalesman(marcelo);
        venta.calcularTotal();
        venta.setCliente(mauro);
        venta.calcularTotal();
        
        
        


    }

}
