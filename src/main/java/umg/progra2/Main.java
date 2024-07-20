package umg.progra2;

import umg.progra2.Grupo1.ejercicios1;
import umg.progra2.Grupo2.ejercicios2;
public class Main {
    public static void main(String[] args) {

        Cubo miCubo = new Cubo(4.0);

        double volumen = miCubo.calcularVolumen();
        System.out.println("El volumen del cubo es: " + volumen);
    }
}
