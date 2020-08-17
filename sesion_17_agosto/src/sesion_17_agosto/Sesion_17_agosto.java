/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_17_agosto;

import ico.fes.poo.Vehiculo;
import ico.fes.poo.vehiculoTerrestre;

/**
 *
 * @author zac_0
 */
public class Sesion_17_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1= new Vehiculo("Motorizado con una adaptacion de" + "bicicleta de tamalero para transportar personas", "BMX", "Metal");
        System.out.println(v1);
        Vehiculo v2 = new Vehiculo("Vehiculo que vuela", "Desconocido", "Madera");
        vehiculoTerrestre vt1= new vehiculoTerrestre();
        System.out.println(vt1);
        vt1.usar();
        
        vehiculoTerrestre vt2= new vehiculoTerrestre(0, "210");
        vt2.setDescripcion("vehiculo semideportivo");
        vt2.setFabricante("Mazda Co");
        vt2.setMaterial("metal y fibra de vidrio");
        System.out.println(vt2);
    }
    
}
