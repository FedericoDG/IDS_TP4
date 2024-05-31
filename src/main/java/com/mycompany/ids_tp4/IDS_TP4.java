package com.mycompany.ids_tp4;

import Models.Auto;
import Models.Celular;
import Models.Hijo;
import Models.Padre;

public class IDS_TP4 {

  public static void main(String[] args) {
    Auto cascajo = new Auto("123LATA", "Renault 12");
    Auto ford = new Auto("999POWR", "Ford Focus");
    Padre padre = new Padre(ford);
    System.out.println("Papá me dejo esta casa en zona: " + padre.getCasa().getZona());

    Celular celular = new Celular("Claro", 7564940, 1500.50);
    Hijo hijo = new Hijo("Juan Carlos", celular, cascajo);
    System.out.println("Soy el hijo y heredé de mi padre su apellido: " + hijo.getApellido());
    System.out.println("Papá me dejó este auto: " + hijo.getAuto().getModelo());
    hijo.conducirAuto(ford);
    hijo.jugarFutbol();
    hijo.bailar();
    hijo.jugarLoteria();
    hijo.cantar();
    hijo.heredarDinero(2000);
    System.out.println("Jugando al futbol! Hoy hice: " + hijo.hacerGoles());
  }
}
