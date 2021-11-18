package ejercicio4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio4 {
    private double precio, precioFinal = 0;
    final double IVA = 0.21;
    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);

    public void inicio() {
        System.out.println("Calcula el iva de un producto");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }

    private void operacion() {
        try {
            System.out.println("Ingresa el precio del producto: ");
            precio = Double.parseDouble(leer.readLine());
            double iva = IVA * precio;
            precioFinal = iva + precio;
            System.out.println("Precio final del producto con iva : " + precioFinal);

        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
    }
}
