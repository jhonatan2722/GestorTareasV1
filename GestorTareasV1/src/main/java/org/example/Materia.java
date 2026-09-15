package org.example;
import java.util.ArrayList;


public class Materia {

    private String nombre;
    private final ArrayList<Trabajo>trabajos;

    public Materia(String nombre){

        if(nombre == null || nombre.trim().isEmpty()){

            throw new IllegalArgumentException("El Campo _Nombre Materia_ Esta Vacio.");
        }

     this.nombre = nombre;
     trabajos = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarTrabajo(Trabajo trabajo){

        if(trabajo == null){

            throw new IllegalArgumentException("No Hay Trabajo Resgistrado");

        }

        trabajos.add(trabajo);
    }

    public void mostrarTrabajos(){

        System.out.println("-----------\nMateria: " + nombre);
        int contador = 1;
        for(Trabajo trabajo : trabajos){

            System.out.println("-Descripcion del trabajo "+contador+": " + trabajo.getDescripcion());
            System.out.println("Fecha Entrega: " + trabajo.getFechaEntrega()+"\n");
            contador ++;

        }

    }


}
