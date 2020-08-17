package sesion_14_agosto;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;

import mx.lenovo.Computadora;

/**
 *
 * @author zac_0
 */
public class Sesion_14_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora c1= new Computadora();
        System.out.println(c1);
        Computadora c2= new Computadora("Lenovo", "LN2010", 
                new Monitor("Samsung", 32),
                new Cpu("Intel", 3.2f, 8), null, null);
        System.out.println(c2);
   }
    
}
