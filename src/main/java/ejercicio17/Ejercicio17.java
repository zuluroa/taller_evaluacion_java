package ejercicio17;

import java.util.ArrayList;

public class Ejercicio17 {

    double preciotelevision=0,precioLavadoras=0,precioElectrodomesticos=0, total=0;

    public void inicio(){

        ArrayList<Electrodomestico> electrodomestico = new ArrayList<>(10);
        electrodomestico.add(new Electrodomestico(100, 10, "verde",'A'));
        electrodomestico.add(new Electrodomestico(60,10,"blanco",'B'));
        electrodomestico.add(new Electrodomestico(70,20,"gris",'C'));
        electrodomestico.add(new Lavadora(70,10));
        electrodomestico.add(new Lavadora(100,10,"azul",'B',80));
        electrodomestico.add(new Lavadora(80,10,"blanco",'A',70));
        electrodomestico.add(new Lavadora(50,10));
        electrodomestico.add(new Television(70,10,50, true));
        electrodomestico.add(new Television(50,10));
        electrodomestico.add(new Television(100, 60, 40, true));


        for (int i = 0; i < electrodomestico.size(); i++) {
            if (electrodomestico.get(i) instanceof Television){
                preciotelevision =preciotelevision+ electrodomestico.get(i).precioFinal();
            }else if (electrodomestico.get(i) instanceof Lavadora){
                precioLavadoras = precioLavadoras+electrodomestico.get(i).precioFinal();
            }else if (electrodomestico.get(i) instanceof Electrodomestico) {
                precioElectrodomesticos =precioElectrodomesticos+ electrodomestico.get(i).precioFinal();
            }
        }
        precioElectrodomesticos = precioElectrodomesticos+preciotelevision+precioLavadoras;
        System.out.println("PRECIOS DE TODOS LOS TELEVISORES: "+preciotelevision);
        System.out.println("PRECIOS DE TODAS LAS LAVADORAS: "+precioLavadoras);
        System.out.println("PRECIOS TOTAL DE LOS ELECTRODOMESTICOS: "+precioElectrodomesticos);
    }

}
