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
public class Cuadrado implements figura {
    private int base;
    private int altura;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando el cuadrado");
    }

    @Override
    public void colorear() {
        System.out.println("Coloreando el cuadrado");
    }

    @Override
    public int calcularArea() {
        System.out.println("Calcular lado * lado");
        return base * altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
