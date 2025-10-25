package org.breaze;

import org.breaze.creacionales.factory.*;
import org.breaze.creacionales.singleton.DBConnection;
import org.breaze.creacionales.singleton.Test;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*DBConnection instance = DBConnection.getInstance();
        instance.setNumero(5);
        Test test = new Test("");*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tipo de transporte");
        String tipoTransporte = sc.nextLine();
        FabricaTransporte fabrica = new FabricaTransporte();
        ITransporte transporte = fabrica.crearTransporte(TipoTransporte.valueOf(tipoTransporte));
        transporte.entregar();
        System.out.println("Ingresa el tipo de transporte");
        String tipoTransporte2 = sc.nextLine();
        ITransporte transporte1 = fabrica.crearTransporte(TipoTransporte.valueOf(tipoTransporte2));
        transporte1.entregar();
    }
}