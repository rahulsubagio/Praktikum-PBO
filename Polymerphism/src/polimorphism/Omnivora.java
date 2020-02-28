package polimorphism;

public class Omnivora extends Hewan {
  final String jenisMakanan = "semuanya";

  public Omnivora(String nama) {
    super(nama);
  }

  public void makan() {
    System.out.println("Hewan " + super.getNamaHewan() + " sedang memakan " + jenisMakanan);
  }

}