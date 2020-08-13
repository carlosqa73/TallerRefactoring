package modelos;

import java.util.ArrayList;

public class Profesor {
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono; 
    private ArrayList<Paralelo> paralelos;
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;

    public Profesor(String codigo, String nombre, String apellido, String facultad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad= facultad;
       
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }
    
    
}
