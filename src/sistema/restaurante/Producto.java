
package sistema.restaurante;

public class Producto {
    private String platillo;
    private double precio;
    private String categoria;

    public Producto(String platillo, double precio, String categoria) {
        this.platillo = platillo;
        this.precio = precio;
        this.categoria = categoria;
    }
    public Pedido solicitado_por;
    
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    
    // Getters y Setters
    public String getPlatillo() { return platillo; }
    public void setPlatillo(String platillo) { this.platillo = platillo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}
