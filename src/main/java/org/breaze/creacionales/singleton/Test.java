package org.breaze.creacionales.singleton;

public class Test {
    private String nombre;

    public Test(String nombre) {
        this.nombre = nombre;
        DBConnection instance = DBConnection.getInstance();
        System.out.println(instance.getNumero());
    }
}