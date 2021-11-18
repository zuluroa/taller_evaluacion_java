package ejercicio1;

public class Ejercicio1 {
    private int numero1 = 5;
    private int numero2 = 12;

    public void inicio() {
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El número mayor es: " + numero2);
        }else if(numero1 == numero2){
            System.out.println("Los números son iguales");
        }
    }
}
