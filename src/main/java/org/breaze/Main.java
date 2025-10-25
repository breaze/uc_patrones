package org.breaze;

import org.breaze.creacionales.singleton.DBConnection;
import org.breaze.creacionales.singleton.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DBConnection instance = DBConnection.getInstance();
        instance.setNumero(5);
        Test test = new Test("");
    }
}