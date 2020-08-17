/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lenovo;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author zac_0
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor mi_Monitor;
    private Cpu mi_Cpu;
    private Teclado mi_Teclado;
    private Mouse mi_Mouse;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor mi_Monitor, Cpu mi_Cpu, Teclado mi_Teclado, Mouse mi_Mouse) {
        this.marca = marca;
        this.modelo = modelo;
        this.mi_Monitor = mi_Monitor;
        this.mi_Cpu = mi_Cpu;
        this.mi_Teclado = mi_Teclado;
        this.mi_Mouse = mi_Mouse;
    }

    public Mouse getMi_Mouse() {
        return mi_Mouse;
    }

    public void setMi_Mouse(Mouse mi_Mouse) {
        this.mi_Mouse = mi_Mouse;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getMi_Monitor() {
        return mi_Monitor;
    }

    public void setMi_Monitor(Monitor mi_Monitor) {
        this.mi_Monitor = mi_Monitor;
    }

    public Cpu getMi_Cpu() {
        return mi_Cpu;
    }

    public void setMi_Cpu(Cpu mi_Cpu) {
        this.mi_Cpu = mi_Cpu;
    }

    public Teclado getMi_Teclado() {
        return mi_Teclado;
    }

    public void setMi_Teclado(Teclado mi_Teclado) {
        this.mi_Teclado = mi_Teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", mi_Monitor=" + mi_Monitor + ", mi_Cpu=" + mi_Cpu + ", mi_Teclado=" + mi_Teclado + ", mi_Mouse=" + mi_Mouse + '}';
    }
    
    
}
