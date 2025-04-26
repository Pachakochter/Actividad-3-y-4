package sistema.restaurante;

import java.util.ArrayList;

public class Cliente {
    private String codigo_cliente;
    private String nombre;
    private int pedidos;
    

    public Restaurante usuario;
    public Mesa usuario_de;
    private ArrayList<Pedido> adquiere = new ArrayList();
    
    public void hacer_pedido() {
        System.out.println("Pedido realizado");
    }
    public void pagar_cuenta() {
        System.out.println("Cuenta a pagar");
    }
}
