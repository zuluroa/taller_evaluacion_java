package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    String nombre,sexoTeclado;
    int edad;
    double peso,altura;
    char sexo;
    Scanner sc;
    Persona persona;

    public void inicio(){
        System.out.println("****** VALIDACION DE DATOS ********");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingresa los siguientes datos:");
        operacion();
    }

    private void operacion() {
        persona1();
        persona2();
        persona3();
    }

    private void persona1(){
        sc = new Scanner(System.in);
        System.out.println("-----------------------------------PERSONA 1------------------------------------");
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su sexo (H o M)");
        sexoTeclado = sc.next();
        sexo = sexoTeclado.charAt(0);
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Ingrese su peso");
        peso = sc.nextDouble();
        System.out.println("Ingrese su altura");
        altura = sc.nextDouble();
        System.out.println("-----------------------------------RESULTADO------------------------------------");
        persona = new Persona(nombre,edad,sexo,peso,altura);
        System.out.println(persona);
    }

    private void persona2(){
        sc = new Scanner(System.in);
        nombre = "";
        sexoTeclado = "";
        sexo = ' ';
        edad = 0;
        altura = 0;
        System.out.println("-----------------------------------PERSONA 2------------------------------------");
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su sexo (H o M)");
        sexoTeclado = sc.next();
        sexo = sexoTeclado.charAt(0);
        System.out.println("Por favor ingrese la edad");
        edad = sc.nextInt();
        System.out.println("-----------------------------------RESULTADO------------------------------------");
        persona = new Persona(nombre,edad,sexo);
        System.out.println(persona);
    }

    private void persona3(){
        sc = new Scanner(System.in);
        sexoTeclado = "";
        persona = new Persona();
        System.out.println("-----------------------------------PERSONA 3------------------------------------");
        System.out.println("Ingrese su nombre");
        persona.setNombre((sc.nextLine()));
        System.out.println("Ingrese su sexo (H o M)");
        sexoTeclado = sc.next();
        persona.setSexo(sexoTeclado.charAt(0));
        System.out.println("Ingrese su edad");
        persona.setEdad((sc.nextInt()));
        System.out.println("Ingrese su peso");
        persona.setPeso(sc.nextDouble());
        System.out.println("Ingrese su altura");
        persona.setAltura(sc.nextDouble());
        System.out.println("-----------------------------------RESULTADO------------------------------------");
        persona.mensajePeso();
        persona.mensajeEdad();
        System.out.println(persona);
    }
}
