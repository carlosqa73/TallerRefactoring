package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    
    private ArrayList<Paralelo> paralelosAyudante;

    Ayudante(){
    	super();
    }

    public ArrayList<Paralelo> getParalelosAyudante() {
        return paralelosAyudante;
    }

    public void setParalelosAyudante(ArrayList<Paralelo> paralelosAyudante) {
        this.paralelosAyudante = paralelosAyudante;
    }
    
    
    
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelosAyudante){
            //Muestra la info general de cada paralelo
        }
    }
}
