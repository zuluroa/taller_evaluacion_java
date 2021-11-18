package ejercicio18;

public class VideoJuego implements Entregable{

    private String titulo;
    private int horas = 10;
    private boolean entregado= false;
    private String genero;
    private String company;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
    }

    public VideoJuego(String titulo, int horas, String genero, String company) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.company = company;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", company='" + company + '\'' +
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
        if(this.getHoras() > ((VideoJuego)a).getHoras()){
            valorRetorno = true;
        }
        else{
            valorRetorno = false;
        }
        return valorRetorno;
    }
}
