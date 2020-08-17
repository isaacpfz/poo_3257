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
public class Editorial {
    private String marca;
    private String edicion;
    private float paginas;
    private String volumen;

    public Editorial() {
    }

    public Editorial(String marca, String edicion, float paginas, String volumen) {
        this.marca = marca;
        this.edicion = edicion;
        this.paginas = paginas;
        this.volumen = volumen;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public float getPaginas() {
        return paginas;
    }

    public void setPaginas(float paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Editorial{" + "marca=" + marca + ", edicion=" + edicion + ", paginas=" + paginas + ", volumen=" + volumen + '}';
    }
    
}
