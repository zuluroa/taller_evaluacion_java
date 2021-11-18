package ejercicio17;

public class Television extends Electrodomestico{

    private double resolucion = 20;
    private boolean sintonizador = false;

    public Television(){

    }

    public Television(double precio, double peso) {
        super(precio,peso);
    }

    public Television(double precio, double peso, double resolucion, boolean sintonizador) {
        super(precio,peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void obtenerPrecioPulgadas(){
        if (resolucion > 40){
            double recargo = getPrecio_base() * 0.3;
            sumarAdicional(recargo);
        }
    }

    public void obtenerPrecioSintonizador(){
        if (sintonizador == true){
            sumarAdicional(50);
        }
    }

    public double precioFinal(){
        super.precioFinal();
        obtenerPrecioPulgadas();
        obtenerPrecioSintonizador();
        return getPrecio_base();
    }
}
