package polimorphism;

public class Herbivora extends Hewan {
  final String jenisMakanan = "tumbuhan";

  public Herbivora(String nama) {
    super(nama);
  }

  public void makan() {
    System.out.println("Hewan " + super.getNamaHewan() + " sedang memakan " + jenisMakanan);
  }

}