/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Biblioteca {

    private static final String Libros="libros.dat";
    private static String Login(){};
    private static List<Categorias> categoriaDisponible = new ArrayList<>(); 
    private static List<Nuevo> Nuevo= new ArrayList<>();
    
    public static void main(String[] args) {
        inicializarCategorias();
        cargarNuevo();
        String nombre;
        String id;
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
        mostrarMenuPrincipal();
        opcion=scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion){
            case 1:
                Login();
                break;
            case 2:  
                addNuevo(scanner);
                break;
            case 3:
                mostrarCategoria();
            case 4:    
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion no valida");
            }
        
        }
        while (opcion!=4);
        guardarNuevo();
    }
   public static void inicializarCategorias(){
    categoriaDisponible.add(new Categorias(1,"Geotecnia"));
    categoriaDisponible.add(new Categorias(2,"Estructuras"));
    categoriaDisponible.add(new Categorias(3,"Materiales")); 
   }
   
   private static void mostrarMenuPrincipal(){
       System.out.println("Biblioteca UNAL");
       System.out.println("Crear Usuario");
       System.out.println("Añadir Ejemplar");
       System.out.println("Mostrar Categorias disponibles");
       System.out.println("Salir");
       System.out.println("Seleccione una opcion");
   }
   private static void mostrarCategorias(){
       System.out.println("Categorias UNAL");
       for (Categorias categorias: categoriaDisponible){
           System.out.println(Categorias);
       }
   }
   private static void mostrarCategoria(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Seleccionar Categoria");
       mostrarCategorias();
       
       System.out.println("Ingrese numero de categoria");
       int numeroCategoria =scanner.nextInt();
       scanner.nextLine();
       
       Categoria categoriaSeleccionado = null;
       for(Categoria categoria: categoriaDisponible){
           if(categoria.getNumero()==numeroCategoria){
               categoriaSeleccionado=categoria;
               break;
           }
       }
       if (categoriaSeleccionado==null){
           System.out.println("Categoria no disponible");
       }
       System.out.println("Ingrese su nombre");
       System.out.println("Ingrese su numero de cedula");
       String nombre=scanner.nextLine();
       String id=scanner.nextLine();
   }
   
}

