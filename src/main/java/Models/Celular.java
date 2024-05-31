package Models;

public class Celular {

  private String compania;
  private int numero;
  private double saldo;

  public Celular() {
  }

  public Celular(String compania, int numero, double saldo) {
    this.compania = compania;
    this.numero = numero;
    this.saldo = saldo;
  }

  public String getCompania() {
    return compania;
  }

  public void setCompania(String compania) {
    this.compania = compania;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Celular{");
    sb.append("compania=").append(compania);
    sb.append(", numero=").append(numero);
    sb.append(", saldo=").append(saldo);
    sb.append('}');
    return sb.toString();
  }
}
