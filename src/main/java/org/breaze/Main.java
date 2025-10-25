package org.breaze;

import org.breaze.creacionales.abstractfactory.*;
import org.breaze.creacionales.builder.Director;
import org.breaze.creacionales.builder.House;
import org.breaze.creacionales.builder.HouseBuilder;
import org.breaze.creacionales.builder.IHouseBuilder;
import org.breaze.creacionales.factory.*;
import org.breaze.creacionales.factory.ITransporte;
import org.breaze.creacionales.singleton.DBConnection;
import org.breaze.creacionales.singleton.Test;
import org.breaze.estructurales.facade.Amplificador;
import org.breaze.estructurales.facade.DVDPlayer;
import org.breaze.estructurales.facade.Proyector;
import org.breaze.estructurales.facade.TeatroEnCasa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*DBConnection instance = DBConnection.getInstance();
        instance.setNumero(5);
        Test test = new Test("");*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tipo de transporte");
        String tipoTransporte = sc.nextLine();
        FabricaTransporte fabrica = new FabricaTransporte();
        ITransporte transporte = fabrica.crearTransporte(TipoTransporte.valueOf(tipoTransporte));
        transporte.entregar();
        System.out.println("Ingresa el tipo de transporte");
        String tipoTransporte2 = sc.nextLine();
        ITransporte transporte1 = fabrica.crearTransporte(TipoTransporte.valueOf(tipoTransporte2));
        transporte1.entregar();*/
        /*FabricaLogistica fabricaLogistica = new FabricaLogistica();
        IFabricaLogistica planeadorRuta = fabricaLogistica.crear(TipoLogistica.TERRESTRE);
        IPlaneadorRuta planeadorTierra = planeadorRuta.crearPlaneadorRuta();
        ITransporte tTerrestre = planeadorRuta.crearTransporte();
        planeadorTierra.planearRuta("Medellin", "Bogotá");
        System.out.println("Entregando...");
        tTerrestre.entregar();
        IFabricaLogistica planeadorRuta2 = fabricaLogistica.crear(TipoLogistica.MARITIMA);
        IPlaneadorRuta planeadorMar = planeadorRuta2.crearPlaneadorRuta();
        ITransporte tMaritimo = planeadorRuta2.crearTransporte();
        planeadorMar.planearRuta("Cartagena", "Tulum");
        System.out.println("Entregando...");
        tMaritimo.entregar();*/
        /*House house = new House();
        House house1 = House.builder.bedrooms(1)
                .bathrooms(2)
                .swimmingPool(true)
                .getHouse();

        Director director = new Director();
        IHouseBuilder builder = new HouseBuilder();
        director.setBuilder(builder);
        director.buildLuxuryHouse();
        House luxuryHouse = builder.getHouse();
        System.out.println("Luxury house: " + luxuryHouse.getBathroom());*/
        Amplificador amplificador = new Amplificador();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Proyector proyector = new Proyector();
        TeatroEnCasa teatroEnCasa = new TeatroEnCasa(amplificador, dvdPlayer, proyector);
        teatroEnCasa.verPelicula("Los Simpsons");
        System.out.println("--------");
        teatroEnCasa.apagarTodo();
    }
}