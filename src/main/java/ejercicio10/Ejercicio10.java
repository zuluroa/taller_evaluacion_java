package ejercicio10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio10 {
    private String texto= "";
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

            System.out.println("El nuevo texto es: "+texto.replace(" ",""));

        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
    }
}
