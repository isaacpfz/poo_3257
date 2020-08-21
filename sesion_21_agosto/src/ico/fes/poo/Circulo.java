/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author zac_0
 */
public class Circulo implements figura {

    @Override
    public void dibujar() {
        System.out.println("Dibujar un circulo");
    }

    @Override
    public void colorear() {
        System.out.println("Coloreando un circulo");
    }

    @Override
    public int calcularArea() {
        System.out.println("Calculando area Pi * r 2");
        return 15;
    }
    
    
}
