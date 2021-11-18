package ejercicio16;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
        mensajeEdad();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        comprobarSexo(sexo);
        this.altura = altura;
        mensajeEdad();
        mensajePeso();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private int calcularIMC(){
        double resultado = 0;
        resultado = this.peso/(Math.pow(this.altura,2));
        if(resultado < 20){
            resultado = -1;
        }else if(resultado < 26){
            resultado = 0;
        }else{
            resultado = 1;
        }
        return (int) resultado;
    }

    public void mensajePeso(){
        int resultado_peso = calcularIMC();

        switch (resultado_peso){
            case 0:
                System.out.println("Esta por debajo del peso");
                break;
            case 1:
                System.out.println("Tiene sobre peso");
                break;
            default:
                System.out.println("Tiene el peso apropiado");
                break;
        }

    }

    private boolean mayorDeEdad(){
        boolean valida;
        if(this.edad<18){
            valida=false;
        }else{
            valida=true;
        }
        return valida;
    }

    public void mensajeEdad(){
        boolean result_mayore = mayorDeEdad();
        if(result_mayore == true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public void comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        }else{
            this.sexo = 'H';
        }

    }

    private String generarDNI(){
        String letras[]= {"-T","-R","-W","-A","-G","-M","-Y","-F","-P","-D","-X","-B","-N","-J","-Z","-S","-Q","-V","-H","-L","-C","-K","-E"};
        String letraDNI = "";
        int operacion = (int)(Math.random()*99999999);
        for (int i = 0; i < letras.length ; i++) {
            if(operacion%23 == i){
                letraDNI = letras[i];
            }
        }
        String operacion_cast = operacion+"";
        return operacion_cast + letraDNI;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI +  '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura
                ;
    }
}
