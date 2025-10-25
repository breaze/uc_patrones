package org.breaze.creacionales.singleton;

import java.util.HashMap;

public class DBConnection {
    private static DBConnection dbConnection;
    private int numero;
    private DBConnection() {

    }
    public static synchronized DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
