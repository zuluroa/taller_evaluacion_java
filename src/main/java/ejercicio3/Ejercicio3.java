package ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio3 {
    private double radio,area = 0;
    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);

    public void inicio(){
        System.out.println("Calcule el area de un circulo");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }

    private void operacion() {
        try {
            System.out.println("Ingresa el radio del circulo: ");
            radio = Double.parseDouble(leer.readLine());

            area = Math.PI * Math.pow(radio,2);

            System.out.println("El area del circulo es: "+area);

        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
    }
}
