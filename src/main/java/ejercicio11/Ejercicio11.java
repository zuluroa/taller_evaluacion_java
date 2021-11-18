package ejercicio11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio11 {
    private String texto = "";
    private int contador = 0;
    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);

    public void inicio() {
        System.out.println("Eliminar espacio a la frase");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }

    private void operacion() {
        try {
            System.out.println("Añade una frase o palabra que quieras agregar al texto: ");
            texto = leer.readLine();

            System.out.println("El tamaño del texto es: " + texto.length());

            for (int i = texto.length() -1 ; i > 0; i--) {
                if ((texto.charAt(i) == 'a') || (texto.charAt(i) == 'e') || (texto.charAt(i) == 'i') || (texto.charAt(i) == 'o') || (texto.charAt(i) == 'u')) {
                    contador++;
                }
            }
            System.out.println("Cantidad de vocales : " + contador);
        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
    }
}
