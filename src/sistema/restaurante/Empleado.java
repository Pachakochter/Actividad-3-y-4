package sistema.restaurante;

public class Empleado {
    private String codigo_empleado;
    private String nombre;
    private String puesto;
    private double salario;


    public Restaurante trabaja_en;
    
    public void trabajar() {
        System.out.println("Jornada de 8 horas");
    }
    
    public void descanso() {
        System.out.println("60 min por refrigerio");
    }
    
}
