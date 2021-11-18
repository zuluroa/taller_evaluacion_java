package ejercicio9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio9 {
    private String texto = "La sonrisa sera la mejor arma contra la tristeza";
    private String nuevaPalabra = "";
    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);

    public void inicio() {
        System.out.println("Ejercicio 9, frase");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("El texto -->"+ texto);
        operacion();
    }

    private void operacion() {
        try {
            texto = texto.replace("a","e");
            System.out.println("Añade una frase o palabra que quieras agregar al texto: ");
            nuevaPalabra = leer.readLine();

            System.out.println("El nuevo texto es: "+texto.concat(" "+nuevaPalabra));

        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
    }
}
