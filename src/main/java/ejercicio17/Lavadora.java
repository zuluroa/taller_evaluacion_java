package ejercicio17;

public class Lavadora extends Electrodomestico{

    private double carga=5;

    public Lavadora(){

    }

    public Lavadora(double precio, double peso, String color,char consumo, double carga) {
        super(precio,peso,color,consumo);
        this.carga = carga;
    }

    public Lavadora(double precio, double peso) {
        super(precio,peso);
    }

    public double getCarga() {
        return carga;
    }

    public void sumarCarga(){
        if (carga > 30){
            sumarAdicional(50);
        }
    }

    public double precioFinal(){
        super.precioFinal();
        sumarCarga();
        return getPrecio_base();
    }
}
