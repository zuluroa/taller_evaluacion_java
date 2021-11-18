package ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    public void inicio() {
        System.out.println("Fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }

    private void operacion() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("AAAA/MM/DD HH:MM:SS");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha con formato 1-> "+formatter.format(LocalDateTime.now()));
        System.out.println("Fecha con formato 2-> "+formato2.format(LocalDateTime.now()));
    }
}
