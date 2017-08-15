/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class Metodos {
    int edad = 18;
    
    String nombre = "Juan";
    String direccion = "Chiclana 2444"; 
    
    
    public void imprimiredad (){
         System.out.println(edad);
       int x;
    }
    public void imprimirnombre (){
        System.out.println(nombre);
        
    }
    public void imprimirdireccion (){
        System.out.println(direccion);
        
    }

    public void resta (int valor1,int valor2){
        int diferencia;
        diferencia=valor1-valor2;
        System.out.println(diferencia);
    }
    public static void main (String []args ){
         
        Metodos metodo1 = new Metodos();
        Metodos metodo2 = new Metodos ();
        Metodos metodo3 = new Metodos ();
        Metodos resta = new Metodos();
        Metodos Miguel = new Metodos ();
        
      
        
        
        
      Miguel.edad = 26;
      Miguel.direccion = "boedo 3333";
      Miguel.nombre = "miguel";
        
        System.out.println(Miguel.nombre);
        System.out.println(Miguel.edad);
        System.out.println(Miguel.direccion);
        
        
        metodo2.imprimirnombre();
        metodo3.imprimirdireccion();
        
        
        
        
        
    }
}
