package polimorphism;

public class Karnivora extends Hewan {
  final String jenisMakanan = "daging";

  public Karnivora(String nama) {
    super(nama);
  }

  public void makan() {
    System.out.println("Hewan " + super.getNamaHewan() + " sedang memakan " + jenisMakanan);
  }

}