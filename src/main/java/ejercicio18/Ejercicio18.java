package ejercicio18;

import java.util.ArrayList;

public class Ejercicio18 {

    private ArrayList<Serie> ListaSeries = new ArrayList<>();
    private ArrayList<VideoJuego> ListaVideoJuegos = new ArrayList<>();
    private int contador;

    public void inicio(){
        series();
        videoJuegos();
    }

    private void videoJuegos() {
        contador = 0;
        VideoJuego juegoPrueba =  new VideoJuego("titulo",0);
        VideoJuego videoJuego =  new VideoJuego("Word of Warcraft",20);
        VideoJuego videoJuego2 =  new VideoJuego("Control",21,"Action-adventure","Ubisof");
        VideoJuego videoJuego3 =  new VideoJuego("FIFA 22",60,"Simlador","EA");
        VideoJuego videoJuego4 =  new VideoJuego("Minecraft",12,"Action-adventure","Ubisof");
        VideoJuego videoJuego5 =  new VideoJuego("Fornite",18,"Shooter","Epic Games");

        videoJuego2.entregar();
        videoJuego3.entregar();
        videoJuego5.entregar();

        ListaVideoJuegos.add(videoJuego);
        ListaVideoJuegos.add(videoJuego2);
        ListaVideoJuegos.add(videoJuego3);
        ListaVideoJuegos.add(videoJuego4);
        ListaVideoJuegos.add(videoJuego5);


        for (VideoJuego juego : ListaVideoJuegos){
            if (juego.isEntregado()){
                juego.devolver();
                contador ++;
            }
            for (int i = 0; i < ListaVideoJuegos.size() -1; i++){
                if(juego.compareTo(juegoPrueba)){
                    juegoPrueba = juego;
                }
            }
        }


        System.out.println("La cantidad de juegos entregados son: "+contador);
        System.out.println("Video juego que tiene más horas estimadas es: " +juegoPrueba);
    }

    private void series(){
        contador = 0;
        Serie seriePrueba = new Serie("Titulo", 0,"Comedia", "Yo");
        Serie series = new Serie("Sex Education", 3,"Comedia-drama", "Laurie Nunn");
        Serie series2 = new Serie("Squid Game", 1,"Drama", "Hwang Dong-hyuk");
        Serie series3= new Serie("The 100", 7,"Accion", "Laurie");
        Serie series4 = new Serie("Anne With An E", 2,"Drama", "Anne of Green Gables");
        Serie series5 = new Serie("Bridgerton", 1,"Accion", "Chris Van Dusen");

        series.entregar();
        series4.entregar();

        ListaSeries.add(series);
        ListaSeries.add(series2);
        ListaSeries.add(series3);
        ListaSeries.add(series4);
        ListaSeries.add(series5);

        for (Serie serie : ListaSeries){
            if (serie.isEntregado()){
                serie.devolver();
                contador ++;
            }
            for (int i = 0; i < ListaSeries.size() -1; i++){
                if(serie.compareTo(seriePrueba)){
                    seriePrueba = serie;
                }
            }
        }
        System.out.println("La cantidad de series entregadas son: "+contador);
        System.out.println("Serie que tiene más temporadas es: " +seriePrueba);
    }

}
