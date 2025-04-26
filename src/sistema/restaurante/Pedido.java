
package sistema.restaurante;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private String fecha;
    private int tomaPedido;
    private double cuenta;
    

    public Cliente es_consumo;
    public Restaurante atiende_el;
    private ArrayList<Producto> necesita = new ArrayList();
    
    
   
    
    public void confirmar() {
        System.out.println("Pedido confirmado.");
    }
    
     // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getCuenta() { return cuenta; }
    public void setCuenta(double cuenta) { this.cuenta = cuenta; }
    
    
       public double calcularTotal(int nmodelo) {
        
       switch(nmodelo){
           case 1:
               this.tomaPedido = 10;
               System.out.println("su cuenta a pagar es: S/." + tomaPedido);
               break;
           case 2:
               this.tomaPedido = 20;
               System.out.println("su cuenta a pagar es: S/." + tomaPedido);
               break;
           case 3:
               this.tomaPedido = 19;
               System.out.println("su cuenta a pagar es: S/." + tomaPedido);
               break;
           case 4:
               this.tomaPedido = 20;
               System.out.println("su cuenta a pagar es: S/." + tomaPedido);
               break;
           default:
               this.tomaPedido = 0;
               break;
               
       } System.out.println("Gracias....");
        return 0;
     
   
       
    }
    
}
