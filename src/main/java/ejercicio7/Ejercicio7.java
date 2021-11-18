package ejercicio7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio7 {
    private int numero = 0;
    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);

    public void inicio() {
        System.out.println("Solicitar un número");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }

    private void operacion() {
        try {
            do {
                System.out.println("Añade un numero: ");
                numero = Integer.parseInt(leer.readLine());
            }while (numero <= 0);
        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
        System.out.println("El número es : " + numero);
    }
}
