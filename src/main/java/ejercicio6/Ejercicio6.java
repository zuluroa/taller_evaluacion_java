package ejercicio6;

public class Ejercicio6 {
    public void inicio() {
        System.out.println("numeros pares e impares");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }
    private void operacion(){
        for (int numero = 100; numero >= 1; numero--){
            if (numero %2 == 0){
                System.out.println(numero + " es par");
            }else{
                System.out.println(numero + " es impar");
            }
        }
    }
}
