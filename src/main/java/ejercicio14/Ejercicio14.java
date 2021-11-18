package ejercicio14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio14 {
    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);
    private int numero = 0;
    public void inicio() {
        System.out.println("Ingresa un número por teclado: ");
        try {
            numero = Integer.parseInt(leer.readLine());
        }catch (Exception e){
            System.out.println("Error-->"+e);
        }
        operacion(numero);
    }

    private void operacion(int numero) {
        try {

            for(int i = numero; i <= 1000; i+=2){
                System.out.println(i);
            }

        }catch (Exception e){
            System.out.println("Error --->" + e);
        }

    }
}
