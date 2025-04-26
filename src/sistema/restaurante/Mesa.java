
package sistema.restaurante;

import java.util.ArrayList;


public class Mesa {
    private int numero;
    private int capacidad;
    private String estado;
    
    public Restaurante propiedad_del;
    private ArrayList<Cliente> estancia = new ArrayList();
    
    public Mesa(int numero, int capacidad, String estado) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
    }
    
    public void reservar() {
        this.estado = "Reservada";
    }
    
    public void liberar() {
        this.estado = "Disponible";
    }
    
    // Getters y Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
