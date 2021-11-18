package ejercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2 {
    private int numero1 = 0;
    private int numero2 = 0;

    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);

    public void inicio() {
        System.out.println("Ingresa 2 números para compararlos");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }

    private void operacion() {
        try {
            System.out.println("Añade el primero numero: ");
            numero1 = Integer.parseInt(leer.readLine());
            System.out.println("Añade el segundo numero: ");
            numero2 = Integer.parseInt(leer.readLine());

            if (numero1 > numero2) {
                System.out.println("El número mayor es: " + numero1);
            } else if (numero1 < numero2) {
                System.out.println("El número mayor es: " + numero2);
            } else if (numero1 == numero2) {
                System.out.println("Los números son iguales");
            }
        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
    }
}
