package ejercicio5;

public class Ejercicio5 {
    int numero = 100;

    public void inicio() {
        System.out.println("numeros pares e impares");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }
    private void operacion(){
       while (numero >= 1){
           if (numero %2 == 0){
               System.out.println(numero + " es par");
           }else{
               System.out.println(numero + " es impar");
           }
           numero --;
       }
    }
}
