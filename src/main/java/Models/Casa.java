package Models;

public class Casa {

  private String zona;

  public Casa() {
  }

  public Casa(String zona) {
    this.zona = zona;
  }

  public String getZona() {
    return zona;
  }

  public void setZona(String zona) {
    this.zona = zona;
  }

  @Override
  public String toString() {
    return "Casa{" + "zona=" + zona + '}';
  }
}
