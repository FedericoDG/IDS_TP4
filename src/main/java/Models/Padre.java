package Models;

public class Padre {

  private String nombre;
  private String apellido;
  private Auto auto;
  private Casa casa;

  public Padre() {
  }

  public Padre(Auto auto) {
    this.nombre = "Papá";
    this.apellido = "López";
    comprarAuto(auto);
    construirCasa();
  }

  private void construirCasa() {
    this.casa = new Casa("Centro. (2) pisos");
  }

  private void comprarAuto(Auto auto) {
    this.auto = auto;
  }

  public void cantar() {
    System.out.println("Asi canta tu padre, Don " + apellido);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Auto getAuto() {
    return auto;
  }

  public void setAuto(Auto auto) {
    this.auto = auto;
  }

  public Casa getCasa() {
    return casa;
  }

  public void setCasa(Casa casa) {
    this.casa = casa;
  }

  @Override
  public String toString() {
    return "Padre{" + "nombre=" + nombre + ", apellido=" + apellido + ", auto=" + auto + ", casa=" + casa + '}';
  }
}
