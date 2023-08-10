
package extra.pkg3.guia.pkg3;


public class Producto {
    private String descripcion;
    public int precio;
    private int stock;
    private String tipoDeProducto;

    public Producto(String descripcion, int precio, String tipoDeProducto) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }
    
    public int calcularPrecioPublico(){
        int precioPublico;
        if (tipoDeProducto == "Lacteo") {
            precioPublico= (int) (precio * 1.25); 
            
        }else if (tipoDeProducto == "Limpieza"){
           precioPublico= (int) (precio*1.35);
        }else{
            precioPublico = (int) (precio*1.45);
        }
        
        return precioPublico;
        
    }

}
