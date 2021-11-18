package ejercicio18;

public class Serie implements Entregable{

    private String titulo;
    private int numerotemp = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;


    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numerotemp, String genero, String creador) {
        this.titulo = titulo;
        this.numerotemp = numerotemp;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumerotemp() {
        return numerotemp;
    }

    public void setNumerotemp(int numerotemp) {
        this.numerotemp = numerotemp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numerotemp=" + numerotemp +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean valorRetorno;
        if(this.getNumerotemp() > ((Serie)a).getNumerotemp()){
            valorRetorno = true;
        }
        else{
            valorRetorno = false;
        }
        return valorRetorno;
    }
}
