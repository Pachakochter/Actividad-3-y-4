package sistema.restaurante;
import java.util.ArrayList;
public class Restaurante {
    private String nombre;
    private String direccion;
    private String telefono;
    
    private ArrayList<Empleado> contrata = new ArrayList();
    private ArrayList<Cliente> proveedor = new ArrayList();
    private ArrayList<Mesa> propietario = new ArrayList();
    private ArrayList<Pedido> atiende_el = new ArrayList();
    
    public void abrir_restaurante() {
        System.out.println("Abierto");
    }
    public void cerrar_restaurante() {
        System.out.println("Restaurante cerrado");
    }

  
            
}
