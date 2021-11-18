package ejercicio17;

public class Electrodomestico {

    private String color = COLOR;
    private double precio_base =100;
    private double peso = 5;
    private char consumo=CONSUMO;
    private static final char CONSUMO= 'F';
    private static final String COLOR= "blanco";
    private static final String colores[]= {"blanco","negro","rojo","azul","gris"};
    private static final char letras[]={'A','B','C','D','E','F'};

    public Electrodomestico(){

    }

    public Electrodomestico(double precio_base, double peso){
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(double precio_base, double peso, String color, char consumo){
        this.precio_base = precio_base;
        this.peso = peso;
        this.color = color;
        comprobarColor(color);
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public double getPeso() {
        return peso;
    }

    public char getConsumo() {
        return consumo;
    }

    private boolean comprobarConsumoEnergetico(char letra){
        boolean valida = false;
        for (int i = 0; i < letras.length ; i++) {
            if(letra == letras[i]){
                this.consumo = letras[i];
                valida=true;
                break;
            }else{
                this.consumo =CONSUMO;
                valida = false;
            }
        }
        return valida;
    }

    public void calcularConsumo(){
        boolean valida_c = comprobarConsumoEnergetico(getConsumo());
        if (valida_c == true){
            switch (consumo){
                case 'A':
                    precio_base = precio_base +100;
                    break;
                case 'B':
                    precio_base = precio_base +80;
                    break;
                case 'C':
                    precio_base = precio_base +60;
                    break;
                case 'D':
                    precio_base = precio_base +50;
                    break;
                case 'E':
                    precio_base = precio_base +30;
                    break;
                default:
                    precio_base = precio_base +10;
            }
        }else{
            System.out.println("No ha ingresado un consumo valido");
        }
    }

    public void comprobarColor(String color){
        for (int i = 0; i < colores.length ; i++) {
            if(color.toLowerCase() == colores[i]){
                this.color = colores[i];
                break;
            }else{
                this.color =COLOR;
            }

        }
    }

    public void calcularTamanio(){
        if(peso<20){
            precio_base = precio_base +10;
        }else if(peso<50){
            precio_base = precio_base +50;
        }else if(peso<80) {
            precio_base = precio_base + 80;
        }else{
            precio_base = precio_base + 100;
        }
    }

    public void precioBase(){
        calcularConsumo();
        calcularTamanio();
    }

    protected void sumarAdicional( double adicional){
        precio_base = precio_base + adicional;
    }

    public double precioFinal(){
        precioBase();
        //System.out.println("PRECIO ELETRODOMESTICO --->"+precio_base);
        return precio_base;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "color='" + color + '\'' +
                ", precio_base=" + precio_base +
                ", peso=" + peso +
                ", consumo=" + consumo +
                '}';
    }
}
