package Models;

import Interfaces.Hermano;
import Interfaces.Madre;
import Interfaces.Tio;

public class Hijo extends Padre implements Madre, Tio, Hermano {

  private String nombre;
  private double billetera;
  private Celular celular;
  private int goles;

  public Hijo(String nombre, Celular celular, Auto auto) {
    super(auto);
    this.nombre = nombre;
    this.celular = celular;
  }

  public void conducirAuto(Auto auto) {
    System.out.println(nombre + " está conduciendo un de un amigo " + auto.getModelo() + ", " + auto.getPatente());
  }

  @Override
  public void cantar() {
    super.cantar();
    System.out.println("Asi canta tu padre, Don" + super.getApellido());
  }

  @Override
  public void bailar() {
    System.out.println("Se bailar como mi madre ♪ ♫ ♪");
  }

  @Override
  public int jugarLoteria() {
    System.out.println("SALIO EL NUMERO DE LA SUERTE " + NROSUERTE);
    heredarDinero(FORTUNA);
    return NROSUERTE;
  }

  @Override
  public void heredarDinero(double money) {
    billetera += money;
    System.out.println("Heredaste una fortuna de " + FORTUNA + ". Ahora tiene una fortuna de: " + billetera);
  }

  @Override
  public void jugarFutbol() {
    System.out.println("Se jugar futbol gracias a mi hermano");
  }

  @Override
  public int hacerGoles() {
    goles++;
    return goles;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getBilletera() {
    return billetera;
  }

  public void setBilletera(double billetera) {
    this.billetera = billetera;
  }

  public Celular getCelular() {
    return celular;
  }

  public void setCelular(Celular celular) {
    this.celular = celular;
  }

  public int getGoles() {
    return goles;
  }

  public void setGoles(int goles) {
    this.goles = goles;
  }

  @Override
  public String toString() {
    return "Hijo{" + "nombre=" + nombre + ", billetera=" + billetera + ", celular=" + celular + ", goles=" + goles + '}';
  }
}
