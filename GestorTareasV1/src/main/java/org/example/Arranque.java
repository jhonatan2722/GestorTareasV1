package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Arranque{

    private Scanner entry = new Scanner(System.in);
    private  ArrayList<Materia> materias = new ArrayList<>();

    public void iniciar(){

          boolean salir = false;

          while(!salir){

              System.out.println("\n--Bienvenido al Gestor De Tareas--\n" +
                      "1.Agregar Materias\n2.Agregar Trabajos\n3.Consultar" +
                      "\n4.Salir ");

              String opcion = entry.nextLine();

              switch (opcion){

                  case "1":
                      agregarMateria();
                      break;

                  case "2":
                      agregarTrabajo();
                      break;

                  case "3":
                      consultarTrabajos();
                      break;

                  case "4":
                      System.out.println("\nSee You Soon !!\n");
                      entry.close();
                      salir = true;
                      break;

                  default:
                      System.out.println("\nOpcion Invalida\n");
                     break;
              }

          }
      }

    public void agregarMateria(){

        System.out.println("Ingresa Nombre de Materia A registrar:");
        String nombreMateria = entry.nextLine();

        try{

            Materia m = new Materia(nombreMateria);
            materias.add(m);

        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());

        }

    }

    public void agregarTrabajo(){

        if(materias == null || materias.isEmpty()){

            System.out.println("No existen Materias");

            return;

        }

            System.out.println("--Lista De Materias--");
            int contador = 0;

            for(Materia materia : materias){

                System.out.println(contador+"."+ materia.getNombre());

            }

            int elegirMateria = entry.nextInt();
            entry.nextLine();
            System.out.println("Fecha: ");
            String fechaEntrega = entry.nextLine();
            System.out.println("Descripcion: ");
            String descripcion = entry.nextLine();

            try{
                    Materia materiaSeleccionada = materias.get(elegirMateria);
                    Trabajo t = new Trabajo(descripcion, fechaEntrega, materiaSeleccionada);
                    materias.get(elegirMateria).agregarTrabajo(t);
                    System.out.println("Trabajo Agregado con Exito !!");

            }catch(IllegalArgumentException e){

                System.out.println("Error: " + e.getMessage());

            } catch (IndexOutOfBoundsException e){

                System.out.println("La Materia elegida no Existe");
            }




    }

    public void consultarTrabajos(){

        if(materias == null || materias.isEmpty()){

            System.out.println("No Existen Materias Resgistradas");
            return;
        }

            System.out.println("Consulta Trabajos de las Materias");

            for(int i = 0; i< materias.size(); i++){

                System.out.println(i+"."+ materias.get(i).getNombre() );

            }

            int consultaEleccion = entry.nextInt();
            entry.nextLine();

            try{

                materias.get(consultaEleccion).mostrarTrabajos();

            }catch(IndexOutOfBoundsException e){

                System.out.println("Materia no Existente");
            }

        }

    }









