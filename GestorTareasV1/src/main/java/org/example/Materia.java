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

        if (trabajos.isEmpty()){
            System.out.println("\nNo Hay Trabajos Resgistrados para Esta Materia");
            return;

        }

            System.out.println("--------------------\nDesglose Trabajos de "+ nombre +".");
            for(int i = 0; i< trabajos.size(); i++){

                System.out.println("-Descripcion del trabajo "+ i +": " + trabajos.get(i).getDescripcion());
                System.out.println("Fecha Entrega: " + trabajos.get(i).getFechaEntrega()+"\n");
                System.out.println("----------------");
            }
    }
}
