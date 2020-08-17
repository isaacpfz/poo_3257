/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.bibliografia;

/**
 *
 * @author zac_0
 */
public class Autor {
    private String apPaterno;
    private String nombre;

    public Autor() {
    }

    public Autor(String apPaterno, String nombre, String titulo) {
        this.apPaterno = apPaterno;
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "apPaterno=" + apPaterno + ", nombre=" + nombre + '}';
    }
    
    
    
}
