
package sistema.restaurante;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class SistemaRestaurante {

    public static void main(String[] args) {
       
        String nombre =JOptionPane.showInputDialog("Ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "Estimado(a) " +nombre + " : Por El consumo de 2 menus llevate gratis una bebida");

        
       
        
        int cantidad_menu, tamano, adicional, cuantos, opcion;
       
        
        String cabecera = "";
        cabecera +="=======================================================";
        cabecera +="\n\t\tRestaurate Peruanitos\n";
        cabecera +="\nSiempre pensando es tu estomago.\n";
        cabecera +="=======================================================";
        cabecera +="\n\tCodigo\tPlatillo\n";
        cabecera +="\n\t------\t------\n";
        
        String menu = "\t 1\tCevichito\n";
        menu+="\t 2\tTallarin Rojos\n";
        menu+="\t 3\tLomo Saltado\n";
        menu+="\t 4\tLocro de alpaca\n";
        menu+="\t 5\tSalir\n";
        
        System.out.println (cabecera + menu);
        
        System.out.println("Escoger una de las opciones"); 
        Scanner opc =new Scanner (System.in);
        opcion = opc.nextInt();  
        
         do{
            if (opcion ==5)
                System.exit (0);
            
            else if ((opcion >5)||(opcion <1))
            {System.out.println ("Opcion no valida");
             System.out.println ("Escoge una opcion correcta");
             opcion =opc.nextInt();}                   
          
        }while(opcion>4);
         Pedido cuenta = new Pedido();
         cuenta.calcularTotal(opcion);
        
        System.out.println("");
        System.out.println("");
        System.out.println("Por politicas Gubernamentales");
        
        Empleado ingreso_empleado = new Empleado();
        System.out.print("Los trabajadores tienen ");
        ingreso_empleado.trabajar();
        System.out.print("El horario de almuerzo es de  ");
        ingreso_empleado.descanso();
    }
    
}
