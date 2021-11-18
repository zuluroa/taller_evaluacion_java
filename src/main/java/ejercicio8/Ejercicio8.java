package ejercicio8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio8 {
    private int diaSemana = 0;
    private Scanner sc;

    public void inicio() {
        System.out.println("Selecciona un dia de la semana");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1. Lunes\n"+ "2. Martes\n"+ "3. Miercoles\n"+ "4. " + "Jueves\n"+ "5. " + "Viernes\n"+ "6. " + "Sabado\n"+ "7. " + "Domingo\n");
        sc = new Scanner(System.in);
        diaSemana = sc.nextInt();
        operacion(diaSemana);
    }

    private void operacion(int opcion) {
        try {
            if(opcion == 1){
                System.out.println("Es dia laboral");
            }else if(opcion == 2){
                System.out.println("Es dia laboral");
            }else if(opcion == 3){
                System.out.println("Es dia laboral");
            }else if(opcion == 4){
                System.out.println("Es dia laboral");
            }else if(opcion == 5){
                System.out.println("Es dia laboral");
            }else if(opcion == 6){
                System.out.println("No es dia laboral");
            }else if(opcion == 7){
                System.out.println("No es dia laboral");
            }else{
                System.out.println("Ingresa una opcion correcta");
            }

        }catch (Exception e){
            System.out.println("Error --->" + e);
        }

    }
}
