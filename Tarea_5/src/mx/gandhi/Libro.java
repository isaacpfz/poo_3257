/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gandhi;

import ico.fes.bibliografia.Autor;
import ico.fes.bibliografia.Editorial;
/**
 *
 * @author zac_0
 */
public class Libro {
    private String titulo;
    private Autor mi_autor;
    private Editorial mi_editorial;

    public Libro() {
    }

    public Libro(String titulo, Autor mi_autor, Editorial mi_editorial) {
        this.titulo = titulo;
        this.mi_autor = mi_autor;
        this.mi_editorial = mi_editorial;
    }

    public Editorial getMi_editorial() {
        return mi_editorial;
    }

    public void setMi_editorial(Editorial mi_editorial) {
        this.mi_editorial = mi_editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getMi_autor() {
        return mi_autor;
    }

    public void setMi_autor(Autor mi_autor) {
        this.mi_autor = mi_autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", mi_autor=" + mi_autor + ", mi_editorial=" + mi_editorial + '}';
    }
    
    
}
