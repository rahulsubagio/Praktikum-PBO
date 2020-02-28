package bangunDimensi.lingkaran;

public class Tabung extends Lingkaran {
  private int tinggi;

  public Tabung() {

  }

  public Tabung(int jari, int tinggi) {
    super(jari);
    this.tinggi = tinggi;
  }

  @Override
  public double hitungLuas() {
    super.luas = 2 * super.pi * getJari() * (getJari() + tinggi);
    return super.luas;
  }

  public double hitungVolume() {
    super.volume = super.pi * getJari() * getJari() * tinggi;
    return super.volume;
  }

  public void tampil() {
    super.hitungLuas();
    super.hitungKeliling();
    System.out.println("\n3. ::: Lingkaran ::: ");
    System.out.println("   -> Luas : " + super.luas);
    System.out.println("   -> Keliling : " + super.keliling);

    hitungLuas();
    hitungVolume();
    System.out.println("\n     ::: Tabung ::: ");
    System.out.println("     -> Luas : " + super.luas);
    System.out.println("     -> Volume : " + super.volume);
  }
}