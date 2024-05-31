package Models;

public class Auto {

  private String patente;
  private String modelo;
  private double combustible;

  public Auto() {
  }

  public Auto(String patente, String modelos) {
    this.patente = patente;
    this.modelo = modelos;
    this.combustible = 50;
  }

  public String getPatente() {
    return patente;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelos) {
    this.modelo = modelos;
  }

  public double getCombustible() {
    return combustible;
  }

  public void setCombustible(double combustible) {
    this.combustible = combustible;
  }

  @Override
  public String toString() {
    return "Auto{" + "patente=" + patente + ", modelo=" + modelo + ", combustible=" + combustible + '}';
  }
}
