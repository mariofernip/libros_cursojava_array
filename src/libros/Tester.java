/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Tester {
    
    public static void main(String[] args){
    
        ArrayList coleccion= new ArrayList();
        Scanner lector = new Scanner(System.in);
        int encontro=0;
        String numerolibros = "0";
        System.out.println("***** BIENVENIDO *****");                
        do{
        System.out.println("INGRESE EL NUMERO DE LIBROS QUE DESEA REGISTRAR");        
        
        numerolibros = lector.nextLine();
                
        for (int i=0;i<numerolibros.length(); i++) {
        if (Character.isDigit(numerolibros.charAt(i)) == false) {
                System.out.println ("No es un número, entrada no válida");
                numerolibros = "0";
              
            } 
        }
            if (Integer.parseInt(numerolibros)<1) {
                System.out.println("Sea coherente");
            }       
          }
        while(Integer.parseInt(numerolibros)<1);
        
        
        //lector.nextLine();
                
        for(int i=0;i<Integer.parseInt(numerolibros);i++){
            int j=i+1;
            System.out.println("***** LIBRO Nro. "+j+"*****");  
            Libro libro = new Libro();
            System.out.println("Ingrese el CODIGO del libro");
            libro.setCodigo(lector.nextLine());
            System.out.println("Ingrese el NOMBRE del libro");
            libro.setNombre(lector.nextLine());
            System.out.println("Ingrese el AUTOR del libro");
            libro.setAutor(lector.nextLine());            
            coleccion.add(libro);
        }
        
//        for (int i=0; i<numerolibros; i++) {
//            coleccion.
//        }
    
        
        System.out.println("***** BUSQUEDA DE LIBRO *****");  
        System.out.println("Ingrese el CODIGO, el AUTOR o el NOMBRE de libro a buscar");
        String busqueda = lector.nextLine();
        
        
        for (Object lib : coleccion) {
            if (busqueda.equals(((Libro)lib).getCodigo()) || busqueda.equalsIgnoreCase(((Libro)lib).getAutor()) || busqueda.equalsIgnoreCase(((Libro)lib).getNombre())) {
                
            System.out.println("CODIGO de Libro: " + ((Libro)lib).getCodigo());            
            System.out.println("NOMBRE de Libro: " + ((Libro)lib).getNombre());
            System.out.println("AUTOR de Libro: "+ ((Libro)lib).getAutor());
            encontro = 1;
            
            }                    
       }
        
        if (encontro!=1) {
            System.out.println("Libro no encontrado");   
            
        }              
        
    
        System.out.println("");              
        System.out.println("Desea ver la lista completa e libros S/N?");
        String deseoverlista = lector.nextLine();
        
        if (deseoverlista.equalsIgnoreCase("S")) {            
        System.out.println("***** LISTADO DE LIBROS *****");  
        for (Object lib : coleccion) {
            System.out.println("**LIBRO**");
            System.out.println("CODIGO de Libro: " + ((Libro)lib).getCodigo());            
            System.out.println("NOMBRE de Libro: " + ((Libro)lib).getNombre());
            System.out.println("AUTOR de Libro: "+ ((Libro)lib).getAutor());}
        }
   
        System.out.println("*****Hasta Pronto*****");
        
   }
 
        
    
    
}

    
