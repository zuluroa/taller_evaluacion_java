package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    private int diaSemana = 0;
    private Scanner sc;
    private Boolean salir = true;

    public void inicio() {
        do {
            System.out.println("****** GESTION CINEMATOGRAFICA ********");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("1. NUEVO ACTOR\n"+ "2. BUSCAR ACTOR\n"+ "3. ELIMINAR ACTOR\n"+ "4. " + "MODIFICAR ACTOR\n"+ "5. " + "VER TODOS LOS ACTORES\n"+
                    "6. " + "VER PELICULAS DE LOS ACTORES\n"+ "7. " + "VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"+ "8. " + "SALIR\n");
            System.out.println("****** SELECCIONA UNA OPCION ********");
            sc = new Scanner(System.in);
            diaSemana = sc.nextInt();
            operacion(diaSemana);
        }while (salir);

    }

    private void operacion(int opcion) {
        try {
            if(opcion == 8){
                salir = false;
            }else {
                System.out.println("OPCION INCORRECTO");
            }

        }catch (Exception e){
            System.out.println("Error --->" + e);
        }

    }
}
