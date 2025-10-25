package org.breaze.estructurales.facade;

public class TeatroEnCasa {
    private Amplificador amplificador;
    private DVDPlayer dvdPlayer;
    private Proyector proyector;

    public TeatroEnCasa(Amplificador amplificador, DVDPlayer dvdPlayer, Proyector proyector) {
        this.amplificador = amplificador;
        this.dvdPlayer = dvdPlayer;
        this.proyector = proyector;
    }

    public void verPelicula(String pelicula) {
        System.out.println("Preparando teatro en casa");
        this.amplificador.encender();
        this.proyector.encender();
        this.dvdPlayer.reproducirPelicula(pelicula);
    }

    public void apagarTodo(){
        System.out.println("Apagando teatro en casa");
        this.dvdPlayer.detenerPelicula();
        this.proyector.apagar();
        this.amplificador.apagar();

    }
}
