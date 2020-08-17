/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_5;

import ico.fes.bibliografia.Autor;
import ico.fes.bibliografia.Editorial;
import mx.gandhi.Libro;

/**
 *
 * @author zac_0
 */
public class Tarea_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro t1= new Libro();
        System.out.println(t1);
        Libro t2 = new Libro("El Principito", new Autor("De Saint - Exupery ", "Antoine", null),
        new Editorial("Latinoamericana", "segunda", 99, "1"));
        System.out.println(t2);
        
        
    }
    
}
