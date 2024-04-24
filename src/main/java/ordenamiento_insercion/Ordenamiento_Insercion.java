/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ordenamiento_insercion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anayc
 */
public class Ordenamiento_Insercion {
    
private static ArrayList <Libro> libros = new ArrayList();
 static Scanner lec= new Scanner(System.in );
 
    public static void main(String[] args) {
        int option=0;
        do{
            System.out.println("1. Registrar Libro");
            System.out.println("2. Ordenar por Insercion");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion");
            option=lec.nextInt();
            switch (option){
                case 1:
                    System.out.println("Escribir la cantidad de libros a registrar");
            int input = lec.nextInt();
            lec.nextLine();
       
        for(int i =0; i < input ; i++){
           System.out.println("Digite el nombre del libro: "+ (i+1));
           String Nombre_libro=lec.nextLine();
           registrarLibro(Nombre_libro);
          
       }
        System.out.println("Listado de libros");
        mostrarNombrelibro();
                    
                    break;
                    
                case 2:
                    ordenarPorInsercion();
                    mostrarNombrelibro();
                    
                    break;
                    
                case 3:
                    
                    System.exit(0);
                   break;
                
                default:
                    System.out.println("Opcion No Valida");
                    break;
            }
        }while (option!= 3);
        
    }
    public static void registrarLibro(String libro){
        Libro nuevoLibro = new Libro(libro);
        libros.add(nuevoLibro);
    }
    
    public static void mostrarNombrelibro(){
        for(Libro a:libros){
            System.out.println(a.getNombre_Libro());
        }
    }
    
   public static void ordenarPorInsercion(){
        for(int i=1; i<libros.size();i++){
            boolean agregado =false;
            for(int j=i;j>0 && !agregado;j--){
                Libro uno = libros.get(j);
                Libro dos = libros.get(j-1);
                if (uno.getNombre_Libro().compareTo(dos.getNombre_Libro()) < 0) {
                    libros.set(j, dos);
                libros.set(j - 1, uno);
                }else {
                    agregado= true;
                
                }
            
            }
        }
        
    }
    
}

    
    
    

        
    

