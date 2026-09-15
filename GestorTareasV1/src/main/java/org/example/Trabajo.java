package org.example;

public class Trabajo{

    private String descripcion;
    private String fechaEntrega;
    private Materia materia;

    public Trabajo(String descripcion, String fechaEntrega, Materia materia){

        if( descripcion == null ||descripcion.trim().isEmpty() ){

            throw new IllegalArgumentException("Descripcion Esta Vacia");
        }

        if(fechaEntrega == null || fechaEntrega.trim().isEmpty()){

            throw  new IllegalArgumentException("Fecha De Entrega Vacia");
        }
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.materia = materia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Materia getMateria() {
        return materia;
    }


}

